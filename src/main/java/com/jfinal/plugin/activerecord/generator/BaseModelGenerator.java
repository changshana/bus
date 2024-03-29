/**
 * Copyright (c) 2011-2017, James Zhan 詹波 (jfinal@126.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jfinal.plugin.activerecord.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jfinal.kit.JavaKeyword;
import com.jfinal.kit.StrKit;

/**
 * Base model 生成器
 */
public class BaseModelGenerator {

    protected String packageTemplate =
            "package %s;%n%n";
    protected String importTemplate =
            "import com.jfinal.plugin.activerecord.Model;%n" +
                    "import com.jfinal.plugin.activerecord.IBean;%n%n";
    protected String classDefineTemplate =
            "/**%n" +
                    " * %s:%s( do not modify this file.)%n" +
                    " */%n" +
                    "@SuppressWarnings(\"serial\")%n" +
                    "public abstract class %s<M extends %s<M>> extends Model<M> implements IBean {%n%n";
    protected String classDefineForSetterChainTemplate =
            "/**%n" +
                    " * %s:%s( do not modify this file.)%n" +
                    " */%n" +
                    "@SuppressWarnings({\"serial\", \"unchecked\"})%n" +
                    "public abstract class %s<M extends %s<M>> extends Model<M> implements IBean {%n%n";
    protected String setterTemplate =
            "\t/**%n" +
            "\t*设置%s %n" +
            "\t*/%n" +
            "\tpublic void %s(%s %s) {%n" +
                    "\t\tset(\"%s\", %s);%n" +
                    "\t}%n%n";
    protected String setterChainTemplate =
            "\t/**%n" +
            "\t*设置%s %n" +
            "\t*/%n" +
            "\tpublic M %s(%s %s) {%n" +
                    "\t\tset(\"%s\", %s);%n" +
                    "\t\treturn (M)this;%n" +
                    "\t}%n%n";

    protected String getterTemplate =
            "\t/**%n" +
            "\t*获取%s %n" +
            "\t*/%n" +
            "\tpublic %s %s() {%n" +
                    "\t\treturn %s(\"%s\");%n" +
                    "\t}%n%n";

    protected String baseModelPackageName;
    protected String baseModelOutputDir;
    protected boolean generateChainSetter = false;

    protected JavaKeyword javaKeyword = JavaKeyword.me;

    public BaseModelGenerator(String baseModelPackageName, String baseModelOutputDir) {
        if (StrKit.isBlank(baseModelPackageName)) {
            throw new IllegalArgumentException("baseModelPackageName can not be blank.");
        }
        if (baseModelPackageName.contains("/") || baseModelPackageName.contains("\\")) {
            throw new IllegalArgumentException("baseModelPackageName error : " + baseModelPackageName);
        }
        if (StrKit.isBlank(baseModelOutputDir)) {
            throw new IllegalArgumentException("baseModelOutputDir can not be blank.");
        }

        this.baseModelPackageName = baseModelPackageName;
        this.baseModelOutputDir = baseModelOutputDir;
    }

    public void setGenerateChainSetter(boolean generateChainSetter) {
        this.generateChainSetter = generateChainSetter;
    }

    public void generate(List<TableMeta> tableMetas) {
        System.out.println("Generate base model ...");
        System.out.println("Base Model Output Dir: " + baseModelOutputDir);
        for (TableMeta tableMeta : tableMetas) {
            genBaseModelContent(tableMeta);
        }
        writeToFile(tableMetas);
    }

    protected void genBaseModelContent(TableMeta tableMeta) {
        StringBuilder ret = new StringBuilder();
        genPackage(ret);
        genImport(ret);
        genClassDefine(tableMeta, ret);
        for (ColumnMeta columnMeta : tableMeta.columnMetas) {
            genSetMethodName(columnMeta, ret);
            genGetMethodName(columnMeta, ret);
        }
        ret.append(String.format("}%n"));
        tableMeta.baseModelContent = ret.toString();
    }

    protected void genPackage(StringBuilder ret) {
        ret.append(String.format(packageTemplate, baseModelPackageName));
    }

    protected void genImport(StringBuilder ret) {
        ret.append(String.format(importTemplate));
    }

    protected void genClassDefine(TableMeta tableMeta, StringBuilder ret) {
        String template = generateChainSetter ? classDefineForSetterChainTemplate : classDefineTemplate;
        ret.append(String.format(template,tableMeta.name,tableMeta.remarks,tableMeta.baseModelName, tableMeta.baseModelName));
    }

    protected void genSetMethodName(ColumnMeta columnMeta, StringBuilder ret) {
        String setterMethodName = "set" + StrKit.firstCharToUpperCase(columnMeta.attrName);
        // 如果 setter 参数名为 java 语言关键字，则添加下划线前缀 "_"
        String argName = javaKeyword.contains(columnMeta.attrName) ? "_" + columnMeta.attrName : columnMeta.attrName;
        String template = generateChainSetter ? setterChainTemplate : setterTemplate;
        String setter = String.format(template, columnMeta.remarks,setterMethodName, columnMeta.javaType, argName, columnMeta.name, argName);
        ret.append(setter);
    }

    protected void genGetMethodName(ColumnMeta columnMeta, StringBuilder ret) {
        String getterMethodName = "get" + StrKit.firstCharToUpperCase(columnMeta.attrName);
        String getterOfModel = getGetterOfModel(columnMeta.javaType);
        String getter = String.format(getterTemplate, columnMeta.remarks,columnMeta.javaType, getterMethodName, getterOfModel, columnMeta.name);
        ret.append(getter);
    }

    /**
     * 针对 Model 中六种可以自动转换类型的 getter 方法，调用其具有确定类型返回值的 getter 方法
     * 享用自动类型转换的便利性，例如 getInt(String)、getStr(String)
     * 其它方法使用泛型返回值方法： get(String)
     * 注意：jfinal 3.2 及以上版本 Model 中的六种 getter 方法才具有类型转换功能
     */
    protected String getGetterOfModel(String javaType) {
        String ret = getterTypeMap.get(javaType);
        return ret != null ? ret : "get";
    }

    @SuppressWarnings("serial")
    protected Map<String, String> getterTypeMap = new HashMap<String, String>() {{
        put("java.lang.String", "getStr");
        put("java.lang.Integer", "getInt");
        put("java.lang.Long", "getLong");
        put("java.lang.Double", "getDouble");
        put("java.lang.Float", "getFloat");
        put("java.lang.Short", "getShort");
    }};

    protected void writeToFile(List<TableMeta> tableMetas) {
        try {
            for (TableMeta tableMeta : tableMetas) {
                writeToFile(tableMeta);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * base model 覆盖写入
     */
    protected void writeToFile(TableMeta tableMeta) throws IOException {
        File dir = new File(baseModelOutputDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String target = baseModelOutputDir + File.separator + tableMeta.baseModelName + ".java";
        FileWriter fw = new FileWriter(target);
        try {
            fw.write(tableMeta.baseModelContent);
        }
        finally {
            fw.close();
        }
    }
}







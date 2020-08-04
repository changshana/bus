package com.mht.system;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lemon.sql.Field;
import com.lemon.toolkit.Convertor;
import com.lemon.toolkit.StringUtil;
import org.apache.commons.lang.StringEscapeUtils;

public class PmUtil {

	public static void main(String[] args) {

		boolean b = PmUtil.test("1");
		System.out.println(b);

	}

	public static boolean test(String str){
		Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
		Matcher m = p.matcher(str);
		return m.matches();

	}


	public static String gerRegExp(String str, String regexp){

		StringBuffer sb = new StringBuffer();

		sb.append("\t\tif(regexp.trim().equals(\"\")){return true;}\n");

		//regexp = StringUtil.replace(regexp, "\\", "\\\\");
		//regexp = StringUtil.replace(regexp, "\"", "\\\"");

		regexp = StringEscapeUtils.escapeJava(regexp);

		sb.append("\t\tPattern p = Pattern.compile(\""+regexp+"\");\n");
		sb.append("\t\tMatcher m = p.matcher("+str+");\n");
		sb.append("\t\treturn m.matches();\n");

		return sb.toString();
	}


	public static String getClassHeader(String packageName){
		StringBuffer sb = new StringBuffer();
		sb.append("package "+packageName+";\n\n");
		return sb.toString();
	}


	public static String getClassHeader(String packageName, ArrayList<String> importList){

		StringBuffer sb = new StringBuffer();

		sb.append("package "+packageName+";\n\n");

		for (int i = 0; i < importList.size(); i++) {
			sb.append("import "+importList.get(i)+";\n");
		}

		sb.append("\n");

		return sb.toString();
	}

	/**
	 * @param classPrev
	 * @param className
	 * @param classBody
	 * @return
	 */

	public static String getClassTemplate(String classPrev, String className, String classBody){
		return classPrev+" class "+className+"{\n\n"+classBody+"\n}";
	}

	public static String getClassExtendsTemplate(String classPrev, String className, String classExtends, String classBody){
		return classPrev+" "+className+" extends "+classExtends+"{\n\n"+classBody+"\n}";
	}

	public static String getClassImplementsTemplate(String classPrev, String className, String classImplements, String classBody){
		return classPrev+" "+className+" implements "+classImplements+"{\n\n"+classBody+"\n}";
	}

	public static String getClassExtendsImplementsTemplate(String classPrev, String className, String classExtends, String classImplements, String classBody){
		return classPrev+" "+className+" extends "+classExtends+" implements "+classImplements+"{\n\n"+classBody+"\n}";
	}


	/**
	 * @param methodPrev
	 * @param methodName
	 * @param returnType
	 * @param methodParams
	 * @param methodBody
	 * @return
	 */
	public static String getMethodTemplate(String methodPrev, String methodName, String returnType, String methodParams, String methodBody){
		return "\t"+methodPrev+" "+returnType+" "+methodName+"("+methodParams+"){\n"+methodBody+"\n\t}\n\n";
	}

	public static String getMethodTemplate(String methodPrev, String methodName, String returnType, String methodParams, String methodThrows, String methodBody){
		if(methodThrows.equals("")){
			return "\t"+methodPrev+" "+returnType+" "+methodName+"("+methodParams+"){\n"+methodBody+"\n\t}\n\n";
		}
		return "\t"+methodPrev+" "+returnType+" "+methodName+"("+methodParams+") throws "+methodThrows+" {\n"+methodBody+"\n\t}\n\n";
	}


	public static String getMemberTemplate(String memberPrev, String memberName, String memberType){
		return "\t"+memberPrev+" "+memberType+" "+memberName+";\n";
	}

	public static String getMemberTemplate(String memberPrev, String memberName, String memberType, String memberInitValue){
		return "\t"+memberPrev+" "+memberType+" "+memberName+" = "+memberInitValue+";\n";
	}



	public static String getJavaObjectName(String sTableName, boolean bFirstWordUpper) {
		String[] aName = StringUtil.split(sTableName, "_");
		String sRet = "";
		boolean bFirstWord = true;
		for (int i = 0; i < aName.length; i++) {
			if (aName[i].length() == 0) {
				continue;
			}
			if (bFirstWordUpper || !bFirstWord) {
				sRet += aName[i].substring(0, 1).toUpperCase();
			} else {
				sRet += aName[i].substring(0, 1).toLowerCase();
			}
			if (aName[i].length() > 1) {
				sRet += aName[i].substring(1).toLowerCase();
			}
			bFirstWord = false;
		}
		return sRet;
	}

	public static String getJavaType(String sTypeInDB) {

		String sVarType = "String";

		if (sTypeInDB.equals("int")) {
			sVarType = "int";
		} else if (sTypeInDB.equals("bigint")) {
			sVarType = "long";
		} else if (sTypeInDB.equals("varchar") || sTypeInDB.equals("nvarchar")) {
			sVarType = "String";
		} else if (sTypeInDB.equals("double") || sTypeInDB.equals("float") || sTypeInDB.equals("decimal")) {
			sVarType = "double";
		} else if (sTypeInDB.equals("date") || sTypeInDB.equals("datetime")) {
			sVarType = "String";
		} else if (sTypeInDB.equals("text") || sTypeInDB.equals("ntext")) {
			sVarType = "String";
		} else if (sTypeInDB.equals("tinyint") || sTypeInDB.equals("bit")) {
			sVarType = "boolean";
		}

		return sVarType;

	}

	public static String getJavaType2(String sTypeInDB) {
		int nFieldType = Convertor.toInt(sTypeInDB);
		String sVarType = "";
		if (nFieldType == Field.TYPE_INT) {
			sVarType = "int";
		} else if (nFieldType == Field.TYPE_LONG) {
			sVarType = "long";
		} else if (nFieldType == Field.TYPE_DOUBLE) {
			sVarType = "double";
		} else if (nFieldType == Field.TYPE_STRING) {
			sVarType = "String";
		} else if (nFieldType == Field.TYPE_DATE || nFieldType == Field.TYPE_DATETIME) {
			sVarType = "String";
		} else if (nFieldType == Field.TYPE_TEXT || nFieldType == Field.TYPE_CLOB) {
			sVarType = "String";
		} else if (nFieldType == Field.TYPE_BOOLEAN) {
			sVarType = "boolean";
		}

		return sVarType;
	}

	public static String getFieldType(String sTypeInDB) {

		String sVarType = "string";

		if (sTypeInDB.equals("int")) {
			sVarType = "int";
		} else if (sTypeInDB.equals("bigint")) {
			sVarType = "long";
		} else if (sTypeInDB.equals("varchar") || sTypeInDB.equals("nvarchar")) {
			sVarType = "string";
		} else if (sTypeInDB.equals("double") || sTypeInDB.equals("float") || sTypeInDB.equals("decimal")) {
			sVarType = "double";
		} else if (sTypeInDB.equals("date")) {
			sVarType = "date";
		} else if (sTypeInDB.equals("datetime")) {
			sVarType = "datetime";
		}else if (sTypeInDB.equals("text") || sTypeInDB.equals("ntext")) {
			sVarType = "clob";
		} else if (sTypeInDB.equals("tinyint") || sTypeInDB.equals("bit")) {
			sVarType = "boolean";
		}

		return sVarType;
	}

	public static String getFieldType2(String sTypeInDB) {
		int nFieldType = Convertor.toInt(sTypeInDB);
		String sVarType = "";

		if (sTypeInDB.equals("int")) {
			sVarType = "int";
		} else if (sTypeInDB.equals("bigint")) {
			sVarType = "long";
		} else if (nFieldType == Field.TYPE_LONG) {
			sVarType = "int";
		} else if (nFieldType == Field.TYPE_DOUBLE) {
			sVarType = "double";
		} else if (nFieldType == Field.TYPE_STRING) {
			sVarType = "string";
		} else if (nFieldType == Field.TYPE_DATE || nFieldType == Field.TYPE_DATETIME) {
			sVarType = "datetime";
		} else if (nFieldType == Field.TYPE_TEXT || nFieldType == Field.TYPE_CLOB) {
			sVarType = "clob";
		} else if (nFieldType == Field.TYPE_BOOLEAN) {
			sVarType = "boolean";
		}

		return sVarType;
	}

	//首字母转小写
	public static String toLowerCaseFirstOne(String s){
		if(Character.isLowerCase(s.charAt(0)))
			return s;
		else
			return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
	}
	//首字母转大写
	public static String toUpperCaseFirstOne(String s){
		if(Character.isUpperCase(s.charAt(0)))
			return s;
		else
			return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
	}
}

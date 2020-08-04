package com.mht.system;

import java.util.List;

import com.mht.common.model.PmField;
import com.mht.common.model.PmTable;

import cn.dreampie.ValidateKit;

public class CodeUtil{

    public static StringBuffer createTableSql(PmTable table, List<PmField> tableFields){
        StringBuffer sb=new StringBuffer();
        sb.append("drop table IF EXISTS "+table.getTableName()+";\n");
        sb.append("create table "+table.getTableName()+"(\n");
        String primary_key="";
        for (PmField field:tableFields){
            if(field.getStatus()==1){
                if(field.getFieldIskey()==1){
                    primary_key+=field.getFieldName()+",";
                }
                sb.append(createField(field));
            }
        }
        if(!ValidateKit.isNullOrEmpty(primary_key)){
            sb.append("\tPRIMARY KEY ("+primary_key.substring(0,primary_key.length()-1)+")\n");
        }else{
            sb=new StringBuffer(sb.substring(0,sb.length()-1));
        }
        sb.append(") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='"+table.getRemark()+"';");
        return sb;
    }


    public static String createField(PmField field){
        String fieldMsg="\t"+field.getFieldName();
        switch (field.getFieldType()){
            case "datetime":fieldMsg+=" "+field.getFieldType();break;
            case "date":fieldMsg+=" "+field.getFieldType();break;
            default:fieldMsg+=" "+field.getFieldType()+"("+field.getFieldMaxLength()+")";
                break;
        }
        switch (field.getFieldIsnullable()){
            case 0:fieldMsg+=" NOT NULL";
                break;
        }
        switch (field.getFieldAutoIncrement()){
            case 1:fieldMsg+=" AUTO_INCREMENT";
                break;
        }
        fieldMsg+=" COMMENT '"+field.getFieldAlias()+"',\n";
        return fieldMsg;
    }

    public static StringBuffer createTableService(PmTable table, String pk_name) {
        StringBuffer sb=new StringBuffer();
        String className = PmUtil.getJavaObjectName(table.getTableName(), true);
        String var=PmUtil.toLowerCaseFirstOne(className);
        String serviceName=className+"Service";
        sb.append("public class "+serviceName+" extends CommonService{\n");
        sb.append("\tpublic static final "+serviceName+" me=new "+serviceName+"();\n");
        sb.append("\tpublic static final "+className+" dao=new "+className+"().dao();\n");
        sb.append("\tpublic Page<"+className+"> paginate(int pageNumber, int pageSize) {\n" );
        sb.append("\t\treturn dao.paginate(pageNumber, pageSize, \"select *\", \"FROM `"+table.getTableName()+"`\");\n" );
        sb.append("\t}\n");
        sb.append("\tpublic "+className+" findById(String id){\n");
        sb.append("\t\treturn dao.findById(id);\n");
        sb.append("\t}\n");
        sb.append("\tpublic void save("+className+" "+var+"){\n");
        sb.append("\t\t"+var+".save();\n");
        sb.append("\t}\n");
        sb.append("\tpublic void update("+className+" "+var+"){\n");
        sb.append("\t\t"+var+".update();\n");
        sb.append("\t}\n");
        sb.append("\tpublic void delete(String id){\n");
        sb.append("\t\tdao.deleteById(id);\n");
        sb.append("\t}\n");
        sb.append("}");
        return sb;
    }

    public static StringBuffer createTableController(PmTable table, String pk_name) {
        StringBuffer sb=new StringBuffer();
        String className = PmUtil.getJavaObjectName(table.getTableName(), true);
        String var=PmUtil.toLowerCaseFirstOne(className);
        String serviceName=className+"Service";
        sb.append("public class "+className+"Controller extends CommonController{\n");
        sb.append("\tpublic static final "+serviceName+" "+PmUtil.toLowerCaseFirstOne(serviceName)+"= "+serviceName+".me;\n");
        sb.append("\tpublic void index(){\n");
        sb.append("\t\trender(\""+var+".html\");\n");
        sb.append("\t}\n");
        sb.append("\tpublic void get"+className+"List(){\n");
        sb.append("\t\trenderJson(Format.layuiPage("+PmUtil.toLowerCaseFirstOne(serviceName)+".paginate(getParaToInt(\"page\", 1),getParaToInt(\"limit\", 10))));\n");
        sb.append("\t}\n");
        sb.append("\tpublic void addOrUpdate"+className+"(){\n");
        sb.append("\t\tString "+pk_name+"=getPara(\""+pk_name+"\",\"\");\n");
        sb.append("\t\t"+className+" "+PmUtil.toLowerCaseFirstOne(className)+"=getModel("+className+".class,\""+PmUtil.toLowerCaseFirstOne(className)+"\");\n");
        sb.append("\t\tif(!"+pk_name+".isEmpty()){\n");
        sb.append("\t\t\t"+PmUtil.toLowerCaseFirstOne(className)+"="+PmUtil.toLowerCaseFirstOne(serviceName)+".findById("+pk_name+");\n");
        sb.append("\t\t}\n");
        sb.append("\t\tsetAttr(\""+PmUtil.toLowerCaseFirstOne(PmUtil.getJavaObjectName(table.getTableName(),true))+"\","+PmUtil.toLowerCaseFirstOne(className)+");\n");
        sb.append("\t\trender(\""+PmUtil.toLowerCaseFirstOne(PmUtil.getJavaObjectName(table.getTableName(),true))+"Detail.html\");\n");
        sb.append("\t}\n");
        sb.append("\tpublic void save"+className+"(){\n");
        sb.append("\t\t"+className+" "+PmUtil.toLowerCaseFirstOne(className)+"=getModel("+className+".class,\""+PmUtil.toLowerCaseFirstOne(className)+"\");\n");
        sb.append("\t\tif("+PmUtil.toLowerCaseFirstOne(className)+".get"+PmUtil.getJavaObjectName(pk_name,true)+"()==null){\n");
        sb.append("\t\t\t"+PmUtil.toLowerCaseFirstOne(serviceName)+".save("+PmUtil.toLowerCaseFirstOne(className)+");\n");
        sb.append("\t\t}else{\n");
        sb.append("\t\t\t"+PmUtil.toLowerCaseFirstOne(serviceName)+".update("+PmUtil.toLowerCaseFirstOne(className)+");\n");
        sb.append("\t\t}\n");
        sb.append("\t\tredirect(\"/index\");\n");
        sb.append("\t}\n");
        sb.append("\tpublic void delete"+className+"(){\n");
        sb.append("\t\tString ids=getPara(\"ids\");\n");
        sb.append("\t\tString[] arr=ids.split(\",\");\n");
        sb.append("\t\tfor(String id:arr){\n");
        sb.append("\t\t\t"+PmUtil.toLowerCaseFirstOne(serviceName)+".delete(id);\n");
        sb.append("\t\t}\n");
        sb.append("\t\trenderJson();\n");
        sb.append("\t}\n");
        sb.append("}");
        return sb;
    }
    public static StringBuffer createTableListPage(PmTable table, String module_url,List<PmField> tableFields,String pk_name) {
        String className = PmUtil.getJavaObjectName(table.getTableName(), true);
        StringBuffer sb=new StringBuffer();
        sb.append("#@common()\n");
        sb.append("#define main()\n");
        sb.append("<div class=\"content-box\">\n");
        sb.append("\t<div class=\"layui-row\">\n");
        sb.append("\t\t<div class=\"layui-col-md5\">\n");
        sb.append("\t\t\t<div class=\"layui-btn-container\" >\n");
        sb.append("\t\t\t\t<button class=\"layui-btn\" data-type=\"refresh\"><i class=\"layui-icon layui-icon-refresh\"></i>刷新</button>\n");
        sb.append("\t\t\t\t<button class=\"layui-btn\" data-type=\"add\"><i class=\"layui-icon layui-icon-add-circle-fine\"></i> 添加</button>\n");
        sb.append("\t\t\t\t<button class=\"layui-btn\" data-type=\"delete\"><i class=\"layui-icon layui-icon-delete\"></i>删除</button>\n");
        //按钮拼接
        sb.append("\t\t\t</div>\n");
        sb.append("\t\t</div>\n");
        sb.append("\t\t<div class=\"layui-col-md5 condition-box\">\n");
        sb.append("\t\t<form name=\"cond-form\" class=\"layui-form\" action=\"\">\n");
        sb.append("\t\t\t<div class=\"layui-form-item\">\n");
        sb.append("\t\t\t\t<div class=\"layui-inline\">\n");
        //条件拼接
        sb.append("\t\t\t\t</div>\n");
        sb.append("\t\t\t</div>\n");
        sb.append("\t\t\t</form>\n");
        sb.append("\t\t</div>\n");
        sb.append("\t\t<div class=\"layui-col-md2\">\n");
        sb.append("\t\t\t<div class=\"search-box\">\n");
        sb.append("\t\t\t\t<div class=\"layui-inline\">\n");
        sb.append("\t\t\t\t\t<input class=\"layui-input\" name=\"search_param\" id=\"search_param\" autocomplete=\"off\" onfocus=\"fnShowSearchTip('请输入关键字进行搜索',this)\" onblur=\"hideTipMessage()\">\n");
        sb.append("\t\t\t\t</div>\n");
        sb.append("\t\t\t\t<button class=\"layui-btn\" data-type=\"reloadData\">搜索</button>\n");
        sb.append("\t\t\t</div>\n");
        sb.append("\t\t</div>\n");
        sb.append("\t</div>\n");
        sb.append("\t<table class=\"layui-table\" lay-data=\"{cellMinWidth:60,url:'"+module_url+"/get"+className+"List', page:true,dataId:'"+pk_name+"', id:'"+PmUtil.toLowerCaseFirstOne(className)+"List',height: 'full-200'}\" lay-filter=\""+PmUtil.toLowerCaseFirstOne(className)+"List\">\n");
        sb.append("\t\t<thead>\n");
        sb.append("\t\t\t<tr>\n");
        sb.append("\t\t\t\t<th lay-data=\"{type:'checkbox', fixed: 'left'}\"></th>\n");
        sb.append("\t\t\t\t<th lay-data=\"{width:80,toolbar: '#editBar'}\">编辑</th>\n");
        for(PmField pmField:tableFields){
            if(pmField.getListPageShow()==1){
                sb.append("\t\t\t\t<th lay-data=\"{field:'"+pmField.getFieldName()+"'}\">"+pmField.getFieldAlias()+"</th>\n");
            }
        }
        sb.append("\t\t\t</tr>\n");
        sb.append("\t\t</thead>\n");
        sb.append("\t</table>\n");
        sb.append("\t<script type=\"text/html\" id=\"editBar\">\n");
        sb.append("\t\t<a class=\"layui-btn layui-btn-xs\" lay-event=\"toEdit\"><i class=\"layui-icon layui-icon-edit\"></i></a>\n");
        sb.append("\t</script>\n");
        sb.append("</div>\n");
        sb.append("<script type=\"text/javascript\">\n");
        sb.append("\tlayui.use('table', function(){\n");
        sb.append("\t\tvar table = layui.table,form=layui.form;\n");
        sb.append("\t\ttable.on('tool("+PmUtil.toLowerCaseFirstOne(className)+"List)', function(obj){\n");
        sb.append("\t\t\tvar data = obj.data;\n");
        sb.append("\t\t\tif(obj.event === 'toEdit'){\n");
        sb.append("\t\t\t\twindowNewLocation(\""+module_url+"/addOrUpdate"+className+"?"+pk_name+"=\"+data."+pk_name+");\n");
        sb.append("\t\t\t}\n");
        sb.append("\t\t});\n");
        sb.append("\t\tvar $ = layui.$, active = {\n");
        sb.append("\t\t\trefresh:function(){\n");
        sb.append("\t\t\t\t//todo 清空条件\n");
        sb.append("\t\t\t\ttable.reload('"+PmUtil.toLowerCaseFirstOne(className)+"List', {\n");
        sb.append("\t\t\t\t\twhere: {\n");
        sb.append("\t\t\t\t\t\tsearch_param:''\n");
        sb.append("\t\t\t\t\t}\n");
        sb.append("\t\t\t\t});\n");
        sb.append("\t\t\t},\n");
        sb.append("\t\t\treloadData:function(){\n");
        sb.append("\t\t\t\ttable.reload('"+PmUtil.toLowerCaseFirstOne(className)+"List', {\n");
        sb.append("\t\t\t\t\twhere: {\n");
        sb.append("\t\t\t\t\t\tsearch_param:$('#search_param').val()\n");
        sb.append("\t\t\t\t\t}\n");
        sb.append("\t\t\t\t});\n");
        sb.append("\t\t\t},\n");
        sb.append("\t\t\tadd:function(){\n");
        sb.append("\t\t\t\twindowNewLocation(\""+module_url+"/addOrUpdate"+className+"\");\n");
        sb.append("\t\t\t},\n");
        sb.append("\t\t\tdelete:function(){\n");
        sb.append("\t\t\t\tvar checkStatus = table.checkStatus('"+PmUtil.toLowerCaseFirstOne(className)+"List'),data = checkStatus.data;\n");
        sb.append("\t\t\t\tif(data.length==0){\n");
        sb.append("\t\t\t\t\tlayer.alert('请先选中您要删除的数据行！');\n");
        sb.append("\t\t\t\t}else{\n");
        sb.append("\t\t\t\t\tvar ids=\"\";\n");
        sb.append("\t\t\t\t\t$.each(data,function(i,obj){\n");
        sb.append("\t\t\t\t\t\tids+=obj."+pk_name+"+',';\n");
        sb.append("\t\t\t\t\t});\n");
        sb.append("\t\t\t\t\tlayer.confirm(\"确定要删除你所选中的所有数据行？\", function(index){\n");
        sb.append("\t\t\t\t\t\t$.ajax({\n");
        sb.append("\t\t\t\t\t\t\ttype:'post',\n");
        sb.append("\t\t\t\t\t\t\turl:'"+module_url+"/delete"+className+"',\n");
        sb.append("\t\t\t\t\t\t\tdata:{\"ids\":ids},\n");
        sb.append("\t\t\t\t\t\t\tsuccess:function (res) {\n");
        sb.append("\t\t\t\t\t\t\t\tlayer.close(index);\n");
        sb.append("\t\t\t\t\t\t\t\ttable.reload('"+PmUtil.toLowerCaseFirstOne(className)+"List', {\n");
        sb.append("\t\t\t\t\t\t\t\t\twhere: {\n");
        sb.append("\t\t\t\t\t\t\t\t\t\tsearch_param:$('#search_param').val()\n");
        sb.append("\t\t\t\t\t\t\t\t\t}\n");
        sb.append("\t\t\t\t\t\t\t\t});\n");
        sb.append("\t\t\t\t\t\t\t},error:function(){\n");
        sb.append("\t\t\t\t\t\t\t\twindowNewLocation('error');\n");
        sb.append("\t\t\t\t\t\t\t}\n");
        sb.append("\t\t\t\t\t\t});\n");
        sb.append("\t\t\t\t\t});\n");
        sb.append("\t\t\t\t}\n");
        sb.append("\t\t\t}\n");
        sb.append("\t\t};\n");
        sb.append("\t\t$('.layui-btn').on('click', function(){\n");
        sb.append("\t\t\tvar type = $(this).data('type');\n");
        sb.append("\t\t\tactive[type] ? active[type].call(this) : '';\n");
        sb.append("\t\t});\n");
        sb.append("\t});\n");
        sb.append("</script>\n");
        sb.append("#end\n");
        return sb;
    }

    public static StringBuffer createTablePropPage(PmTable table, String module_url,List<PmField> tableFields) {
        String className = PmUtil.getJavaObjectName(table.getTableName(), true);
        StringBuffer sb=new StringBuffer();
        try {
            sb.append("#@common()\n");
            if(tableFields.size()>9){
                sb.append("#define css()\n");
                sb.append("<link rel=\"stylesheet\" href=\"lp/static/css/system/sysSetting.css\">\n");
                sb.append("#end\n");
            }
            sb.append("#define main()\n");
            sb.append("<fieldset class=\"layui-elem-field layui-field-title\">\n");
            sb.append("\t<legend>编辑信息</legend>\n");
            sb.append("</fieldset>\n");
            sb.append("<form class=\"layui-form addForm content-box\" action=\""+module_url+"/save"+className+"\" method=\"post\">\n");
            String script="";
            for(PmField field:tableFields){
                if(field.getStatus()==1){
                    sb.append(createFieldProp(field,PmUtil.toLowerCaseFirstOne(PmUtil.getJavaObjectName(table.getTableName(),true)))+"\n");
                    if("date".equals(field.getInputType())){
                        script+="\t\tvar laydate = layui.laydate;\n";
                        script+="\t\tlaydate.render({elem: '#"+field.getFieldName()+"' });\n";
                    }
                    if("file_upload".equals(field.getInputType())||"img_upload".equals(field.getInputType())){
                        script+="\t\tvar upload = layui.upload;\n";
                        script+="\t\tupload.render({\n";
                        script+="\t\t\telem: '.file-upload'\n";
                        script+="\t\t\t,before: function(){\n";
                        script+="\t\t\t\tlayer.tips('接口地址：'+ this.url, this.item, {tips: 1});\n";
                        script+="\t\t\t}\n";
                        script+="\t\t\t,done: function(res, index, upload){\n";
                        script+="\t\t\t\tvar item = this.item;\n";
                        script+="\t\t\t}\n";
                        script+="\t\t});\n";
                    }
                }
            }
            sb.append("\t<div class=\"layui-form-item\">\n");
            sb.append("\t\t<div class=\"layui-input-block\">\n");
            sb.append("\t\t\t<button class=\"layui-btn\" lay-submit lay-filter=\"formBox\">保存</button>\n");
            sb.append("\t\t\t<button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\n");
            sb.append("\t\t\t<a type=\"back\" class=\"layui-btn layui-btn-primary\" onclick=\"returnPage()\">返回</a>\n");
            sb.append("\t\t</div>\n");
            sb.append("\t</div>\n");
            sb.append("</form>\n");
            sb.append("<script>\n");
            sb.append("\tlayui.use(['form','laydate','upload'], function(){\n");
            sb.append(script);
            sb.append("\t});\n");
            sb.append("</script>\n");
            sb.append("#end\n");
        }catch (Exception e){
            e.printStackTrace();
        }
        return sb;
    }

    public static String createFieldProp(PmField field,String pmTableName){
        //"+pmTableName+"==null?'':"+pmTableName+"."+field.getFieldName()+"
        //"+pmTableName+"."+field.getFieldName()+"
        String fieldMsg="\t<div class=\"layui-form-item\">\n";
        fieldMsg += "\t\t<label class=\"layui-form-label\">"+field.getFieldAlias()+"</label>\n";
        fieldMsg += "\t\t<div class=\"layui-input-inline\">\n";
        switch (field.getInputType()) {
            case "text":
                fieldMsg += "\t\t\t<input type=\"text\" name=\""+pmTableName+"."+field.getFieldName()+"\"  value=\"#("+pmTableName+"."+field.getFieldName()+")\"  placeholder=\""+(field.getInputTip()==null?"":field.getInputTip())+"\" autocomplete=\"off\" class=\"layui-input\">\n";
                break;
            case "select":
                fieldMsg += "\t\t\t<select name=\""+pmTableName+"."+field.getFieldName()+"\" value=\"#("+pmTableName+"."+field.getFieldName()+")\" "+(field.getFieldIsnullable()==0?"lay-verify=\"required\"":"")+" lay-filter=\""+field.getFieldName()+"\">\n";
                fieldMsg += "\t\t\t\t<option value=\"\">——请选择——</option>\n";
                fieldMsg += "\t\t\t</select>\n";
                break;
            case "checkbox":
                fieldMsg+="\t\t\t<input type=\"checkbox\" name=\""+pmTableName+"."+field.getFieldName()+"\"  value=\"1\"  #(("+pmTableName+"."+field.getFieldName()+"==null||"+pmTableName+"."+field.getFieldName()+"==1)?'checked':'')>\n";
                break;
            case "date":
                fieldMsg+="\t\t\t<input type=\"text\" name=\""+pmTableName+"."+field.getFieldName()+"\" value=\"#("+pmTableName+"."+field.getFieldName()+")\" id=\""+field.getFieldName()+"\" lay-verify=\"date\" placeholder=\"yyyy-MM-dd\" autocomplete=\"off\" class=\"layui-input\">\n";
                break;
            case "hidden":
                fieldMsg="\t<input type=\"hidden\" name=\""+pmTableName+"."+field.getFieldName()+"\" value=\"#("+pmTableName+"."+field.getFieldName()+")\">";
                break;
            case "textarea":
                fieldMsg += "\t\t\t<textarea name=\""+pmTableName+"."+field.getFieldName()+"\"  class=\"layui-textarea\">#("+pmTableName+"."+field.getFieldName()+")<\\textarea>\n";
                break;
            case "file_upload":
                fieldMsg += "\t\t\t<button class=\"layui-btn file-upload\" lay-data=\"{url: ''}\">上传文件</button>\n";
                break;
            case "img_upload":
                fieldMsg += "\t\t\t<button class=\"layui-btn file-upload\" lay-data=\"{url: ''}\">上传图片</button>\n";
                break;
        }
        if(!"hidden".equals(field.getInputType())){
            fieldMsg += "\t\t</div>\n";
            fieldMsg+="\t</div>";
        }
        return fieldMsg;
    }
}
function reloadTable(table,id){
    table.reload(id, {
        where: {
            plat_id:$('#plat_id').val()
        },
        done:function () {
            if(id=='permModuleList'){
                $('.layui-col-md5 a[lay-event="moveDown"]:last').addClass('layui-btn-disabled').removeClass('layui-bg-red');
            }
            if(id=='pmFieldList'){
                $('.layui-col-md10 a[lay-event="moveDown"]:last').addClass('layui-btn-disabled').removeClass('layui-bg-red');
            }
        }
    });
}
function reloadTableBySearch(table,id,search){
    table.reload(id, {
        where: {
            search_param:search,
            status:$('#status').val()
        }
    });
}
function reloadTableByParentModuleId(table,id,data){
    table.reload(id, {
        where: {
            parent_module_id:data
        },
        done:function(){
            $('.layui-col-md7 a[lay-event="moveDown"]:last').addClass('layui-btn-disabled').removeClass('layui-bg-red');
        }
    });
}
function reloadTableByModuleId(table,id,data){
    table.reload(id, {
        where: {
            module_id:data
        }
    });
}
function reloadTableByParentSiteId(table,id,data){
    table.reload(id, {
        where: {
            parent_site_id:data
        }
    });
}
function reloadTableByParentSiteId2(table,id,data,fn){
    table.reload(id, {
        where: {
            parent_site_id:data
        },
        done:function(){
            fn();
        }
    });
}
function reloadTableByUserOrRole(table,id,module_id,user_id,role_id){
    table.reload(id, {
        where: {
            module_id:module_id,
            user_id:user_id,
            role_id:role_id
        },
        done:function(){
            fnValidateCheckBox();
        }
    });
}

/**
 *请求路径为：/system/getCodeFromSys_code
 * @param code_type 码值类型代码
 * @param tipTxt 下拉选第一行的提示文字,可为空，默认‘-请选择-’
 * @param compareValue 对比的value
 * @param appendId 需要动态生成下拉选的组件id
 */
function fnGetCodeFormSys_code(code_type,tipTxt, compareValue,appendId,code_table){
    layui.use(['form','jquery'], function() {
        var $ = layui.jquery;
        var form = layui.form;
        if(!tipTxt){
            tipTxt="-请选择-";
        }
        $.ajax({
            type: 'post',
            url: 'system/getCodeFromSys_code?code_type='+code_type+'&code_table='+code_table,
            success: function (res) {
                $("#"+appendId).html("");
                /*var compareValue = $("#"+compareId).val();*/
                var html = "<option value=''>"+tipTxt+"</option>";
                $.each(res.data, function (index, value) {
                    var codeValue = value.code_value;
                    var select = "";
                    if (compareValue && codeValue == compareValue) {
                        select = 'selected';
                    }
                    html += "<option value='" + codeValue + "' " + select + ">" + value.name + "</option>";
                });
                $("#"+appendId).append(html);
                form.render();
            }

        });
    });
}


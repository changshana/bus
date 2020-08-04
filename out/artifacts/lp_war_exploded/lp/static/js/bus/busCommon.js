
/**
 *请求路径为：personnel/getCode
 * @param code_table 码值表
 * @param code_type 码值类型代码
 * @param tipTxt 下拉选第一行的提示文字,可为空，默认‘-请选择-’
 * @param compareValue 对比的value
 * @param appendId 需要动态生成下拉选的组件id
 * @param filter 需要过滤的码值  ['value1','value2',...]
 * @param parent_code_value
 */
function fnGetCode(code_table,code_type,tipTxt, compareValue,appendId,filter,parent_code_value){
    layui.use(['form','jquery'], function() {
        var $ = layui.jquery;
        var form = layui.form;
        if(!tipTxt){
            tipTxt="——请选择——";
        }
        $.ajax({
            type: 'post',
            url: 'bus/getCode',
            data:{
                code_table:code_table,
                code_type:code_type,
                parent_code_value:parent_code_value
            },
            success: function (res) {
                $("#"+appendId).html("");
                var html = "<option value=''>"+tipTxt+"</option>";
                $.each(res, function (index, value) {
                    var codeValue = value.aaa004;
                    var select = "";
                    if (compareValue && codeValue == compareValue) {
                        select = 'selected';
                    }
                    if(isNotEmpty(filter)&&$.inArray(codeValue,filter)>=0){
                        //todo
                    }else{
                        html += "<option value='" + codeValue + "' " + select + ">" + value.aaa005 + "</option>";
                    }
                });
                $("#"+appendId).append(html);
                form.render();
            }

        });
    });
}





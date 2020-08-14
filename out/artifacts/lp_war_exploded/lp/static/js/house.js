
function fnValidateCheckBox(){
    var len=0,check_len=$('td[data-field="perm_value"]').length;
    $('td[data-field="perm_value"]').each(function(i,o){
        var user_perm_value=0;
        $(o).find(":checkbox[checked]").each(function(m,n){
            user_perm_value+=parseInt($(n).val());
        });
        if(user_perm_value==$(o).attr('data-content')){
            $('tr[data-index="'+i+'"] td[data-field="0"] :checkbox').attr("checked",true).next(".layui-form-checkbox").addClass('layui-form-checked');
            len++;
        }
    });
    if(len!=0&&len==check_len){
        $('thead :checkbox').attr("checked",true).next(".layui-form-checkbox").addClass('layui-form-checked');
    }
}
function changeStatus(obj,table_name,table_id,id){
    var status;
    if(obj.elem.checked){
        status=1;
    }else{
        status=0;
    }
    $.ajax({
        type:'post',
        url:'/system/changeStatus',
        data:{'id':id,'table_name':table_name,'status':status,'table_id':table_id},
        success:function(data){
        }
    });
}
function isNotEmpty(obj){
    if(obj!=null&&obj!=''&&obj!=undefined){
        return true;
    }
    return false;
}
function windowNewLocation(href){
    window.location.href=href;
}
function showTipMessage(msg, domObj) {
    layer.tips(msg, domObj,{tips: [1, '#009688'],time:0});
}
function hideTipMessage(){
    $('.layui-layer-tips').remove();
}
function clearSessionStorage(url,type){
    if(type=="this"){
        sessionStorage.setItem(url, "");
    }
    if(type=="other"){
        var this_info=JSON.parse(sessionStorage.getItem(url));
        sessionStorage.clear();
        sessionStorage.setItem(url, JSON.stringify(this_info));
    }
    if(type=="all"){
        sessionStorage.clear();
    }
}
function saveBaseSessionStorage(){
    var url=window.location.pathname;
    if(url!='/'){
        if(isNotEmpty(sessionStorage.getItem(url))){
            var old_info=JSON.parse(sessionStorage.getItem(url));
            const info = {
                url: url,
                limit: old_info.limit,
                page: old_info.page,
                checked: old_info.checked
            };
            sessionStorage.setItem(url, JSON.stringify(info));
        }else{
            const info = {
                url: url,
                limit: 10,
                page: 1,
                checked: []
            };
            sessionStorage.setItem(url, JSON.stringify(info));
        }
    }
    /*if(!isNotEmpty(sessionStorage.getItem(url))&&url!='/') {
        const info = {
            url: url,
            limit: 10,
            page: 1,
            checked: []
        };
        sessionStorage.setItem(url, JSON.stringify(info));
    }*/
}
function resetBaseSessionStorage(){
    var url=window.location.pathname;
    var old_info=JSON.parse(sessionStorage.getItem(url));
    const info = {
        url: url,
        limit: old_info.limit,
        page: 1,
        checked: []
    };
    sessionStorage.setItem(url, JSON.stringify(info));
}
function saveSessionStorage(o){
    const info = {
        url: window.location.pathname,
        limit: o.limit,
        page: o.curr,
        checked: []
    };
    sessionStorage.setItem(window.location.pathname, JSON.stringify(info));
}
function saveCheckedSessionStorage(id,flag){
    var old_info=JSON.parse(sessionStorage.getItem(window.location.pathname));
    var arr_id=old_info.checked;
    if(flag&&isNotEmpty(id)){if(!arr_id.hasValue(id)){arr_id.push(id)};}else{if(arr_id.hasValue(id)){arr_id.removeByValue(id);}}
    const new_info = {
        url: window.location.pathname,
        limit: old_info.limit,
        page: old_info.page,
        checked: arr_id
    };
    sessionStorage.setItem(window.location.pathname, JSON.stringify(new_info));
}
Array.prototype.removeByValue = function(key) {
    for(var i=0; i<this.length; i++) {
        if(this[i] == key) {
            this.splice(i, 1);
            break;
        }
    }
}
Array.prototype.hasValue=function(key){
    var flag=false;
    for(var i=0; i<this.length; i++) {
        if(this[i] == key) {
            flag=true;
            break;
        }
    }
    return flag;
}
function returnPage(){
    history.go(-1);
}
function fnShowSearchTip(msg,obj){
    showTipMessage(msg,$(obj));
}

function toIndex(){
    parent.window.location.href='/';
}

function timeOut(err){
    if(err.status=='408'){windowNewLocation('/error');}
}

$(function(){
    $('.layui-nav-tree>li').click(function(){
        $(this).addClass('layui-nav-itemed').siblings().removeClass('layui-nav-itemed');
    });
});


$.ajaxSetup( {
    //设置ajax请求结束后的执行动作
    error :
        function(xhr, textStatus) {
            // 通过XMLHttpRequest取得响应头，sessionstatus
            var sessionstatus = xhr.getResponseHeader("sessionstatus");
            if (sessionstatus == "TIMEOUT") {
                windowNewLocation( xhr.getResponseHeader("CONTEXTPATH"));
            }
        }
});




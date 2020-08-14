$(function () {

    /*window.onload = function() {
        document.onkeydown = function() {
            var e = window.event || arguments[0];
            //屏蔽F12
            if(e.keyCode == 123) {

                return false;
                //屏蔽Ctrl+Shift+I
            } else if((e.ctrlKey) && (e.shiftKey) && (e.keyCode == 73)) {

                return false;
                //屏蔽Shift+F10
            } else if((e.shiftKey) && (e.keyCode == 121)){
                return false;
            }
        };
        //屏蔽右键单击
        document.oncontextmenu = function() {
            return false;
        }
    }*/
});
function fnPageCondLoad(){
    if(isNotEmpty(document.forms['cond-form'])){
        var cond=fnGetPageCond();
        $.each(Object.keys(cond),function(i,o){
            $('#'+o).attr('value',cond[o]);
        });
    }
}
function fnGetPageCond(){
    var cond={};
    if(isNotEmpty(document.forms['cond-form'])){
    var url = window.location.pathname;
    var old_info = JSON.parse(sessionStorage.getItem(url));
    cond=old_info.cond;}
    return cond;
}

function fnValidateCheckBox() {
    var len = 0, check_len = $('td[data-field="perm_value"]').length;
    $('td[data-field="perm_value"]').each(function (i, o) {
        var user_perm_value = 0;
        $(o).find(":checkbox[checked]").each(function (m, n) {
            user_perm_value += parseInt($(n).val());
        });
        if (user_perm_value == $(o).attr('data-content')) {
            $('tr[data-index="' + i + '"] td[data-field="0"] :checkbox').attr("checked", true).next(".layui-form-checkbox").addClass('layui-form-checked');
            len++;
        }
    });
    if (len != 0 && len == check_len) {
        $('thead :checkbox').attr("checked", true).next(".layui-form-checkbox").addClass('layui-form-checked');
    }
}

function changeStatus(obj, table_name, table_id, id) {
    var status;
    if (obj.elem.checked) {
        status = 1;
    } else {
        status = 0;
    }
    $.ajax({
        type: 'post',
        url: 'system/changeStatus',
        data: {'id': id, 'table_name': table_name, 'status': status, 'table_id': table_id},
        success: function (data) {
        }
    });
}

function change996(obj, table_name, table_id, id,fn) {
    var status;
    if (obj.elem.checked) {
        status = 1;
    } else {
        status = 0;
    }
    $.ajax({
        type: 'post',
        url: 'common/changeAaa996',
        data: {'id': id, 'table_name': table_name, 'aaa996': status, 'table_id': table_id},
        success: function (data) {
            if(isNotEmpty(fn)){fn()}
        }
    });
}

function isNotEmpty(obj) {
    if (obj != null && obj != '' && obj != undefined && obj != 'null') {
        return true;
    }
    return false;
}

function windowNewLocation(href) {
    //处理条件
    if(isNotEmpty(document.forms['cond-form'])){
        var cond={};
        $('form[name="cond-form"] input[type="hidden"],form[name="cond-form"] select[lay-filter]').each(function(i,o){
            if(isNotEmpty($(o).val())){
                cond[$(o).attr('name')||$(o).attr('id')]=$(o).val();
            }
        });
        cond.search_param=$('#search_param').val();
        var url = window.location.pathname;
        var old_info = JSON.parse(sessionStorage.getItem(url));
        const info = {
            url: url,
            limit: old_info.limit,
            page: old_info.page,
            checked: old_info.checked,
            cond: cond
        };
        sessionStorage.setItem(url, JSON.stringify(info));
    }
    window.location.href = Base.BasePath + href;
}

function alertMsg(msg, type) {
    var obj = {};
    switch (type) {
        case 'warn':
            obj = {icon: 0, title: '提示'};
            break;
        case 'success':
            obj = {icon: 1, title: '提示'};
            break;
        case 'error':
            obj = {icon: 2, title: '提示'};
            break;
        case 'affirm':
            obj = {icon: 3, title: '提示'};
            break;
    }
    layer.alert(msg, obj);
}

function showTipMessage(msg, domObj) {
    layer.tips(msg, domObj, {tips: [1, '#009688'], time: 0});
}

function hideTipMessage() {
    $('.layui-layer-tips').remove();
}

function clearSessionStorage(url, type) {
    if (type == "this") {
        sessionStorage.setItem(url, "");
    }
    if (type == "other") {
        var this_info = JSON.parse(sessionStorage.getItem(url));
        sessionStorage.clear();
        sessionStorage.setItem(url, JSON.stringify(this_info));
    }
    if (type == "all") {
        sessionStorage.clear();
    }
}

function saveBaseSessionStorage() {
    var url = window.location.pathname;
    if (url != '/') {
        if (isNotEmpty(sessionStorage.getItem(url))) {
            var old_info = JSON.parse(sessionStorage.getItem(url));
            const info = {
                url: url,
                limit: old_info.limit,
                page: old_info.page,
                checked: old_info.checked,
                cond: old_info.cond
            };
            sessionStorage.setItem(url, JSON.stringify(info));
        } else {
            const info = {
                url: url,
                limit: 0,
                page: 1,
                checked: [],
                cond: {}
            };
            sessionStorage.setItem(url, JSON.stringify(info));
        }
    }
}

function resetBaseSessionStorageWithTableReload() {
    var url = window.location.pathname;
    var old_info = JSON.parse(sessionStorage.getItem(url));
    const info = {
        url: url,
        limit: old_info.limit,
        page: 1,
        checked: [],
        cond: {}
    };
    sessionStorage.setItem(url, JSON.stringify(info));
}

function resetBaseSessionStorage() {
    var url = window.location.pathname;
    /*if(isNotEmpty(sessionStorage.getItem(url))){
        var old_info=JSON.parse(sessionStorage.getItem(url));
        var cond=old_info.cond;
        if($.isEmptyObject(cond)){
            $('form[name="cond-form"] select').each(function(i,o){
                cond[$(o).attr("select-name")]=$(o).val();
            });
            cond['search_param']=$('#search_param').val();
        }else{
            $('form[name="cond-form"] select').each(function(i,o){
                $(o).val(cond[$(o).attr("select-name")]).attr('value',cond[$(o).attr("select-name")]);
                $(o).siblings(':hidden').val(cond[$(o).attr("select-name")]);
            });
            $('#search_param').val(cond['search_param']);
        }
        // saveCondSessionStorage(cond);
    }*/
}

function saveSessionStorage(o) {
    var url = window.location.pathname;
    var old_info = JSON.parse(sessionStorage.getItem(url));
    const info = {
        url: url,
        limit: o.limit,
        page: o.curr || 1,
        checked: [],
        cond: old_info.cond
    };
    sessionStorage.setItem(window.location.pathname, JSON.stringify(info));
}

function saveCondSessionStorage(cond) {
    var url = window.location.pathname;
    var old_info = JSON.parse(sessionStorage.getItem(url));
    const info = {
        url: url,
        limit: old_info.limit,
        page: old_info.page,
        checked: old_info.checked,
        cond: cond
    };
    sessionStorage.setItem(window.location.pathname, JSON.stringify(info));
}

function saveCheckedSessionStorage(id, flag) {
    var old_info = JSON.parse(sessionStorage.getItem(window.location.pathname));
    var arr_id = old_info.checked;
    if (flag && isNotEmpty(id)) {
        if (!arr_id.hasValue(id)) {
            arr_id.push(id)
        }
        ;
    } else {
        if (arr_id.hasValue(id)) {
            arr_id.removeByValue(id);
        }
    }
    const new_info = {
        url: window.location.pathname,
        limit: old_info.limit,
        page: old_info.page,
        checked: arr_id,
        cond: old_info.cond
    };
    sessionStorage.setItem(window.location.pathname, JSON.stringify(new_info));
}

Array.prototype.removeByValue = function (key) {
    for (var i = 0; i < this.length; i++) {
        if (this[i] == key) {
            this.splice(i, 1);
            break;
        }
    }
};
Array.prototype.hasValue = function (key) {
    var flag = false;
    for (var i = 0; i < this.length; i++) {
        if (this[i] == key) {
            flag = true;
            break;
        }
    }
    return flag;
};

function returnPage() {
    history.go(-1);
}

function fnShowSearchTip(msg, obj) {
    showTipMessage(msg, $(obj));
}

function toIndex() {
    top.window.location.href = 'errorEnterPage';
}

function timeOut(err) {
    if (err.status == '408') {
        windowNewLocation('error');
    }
}

$(function () {
    $('.layui-nav-tree>li').click(function () {
        $(this).siblings().removeClass('layui-nav-itemed');
    });
});


$.ajaxSetup({
    //设置ajax请求结束后的执行动作
    error:
        function (xhr, textStatus) {
            // 通过XMLHttpRequest取得响应头，sessionstatus
            var sessionstatus = xhr.getResponseHeader("sessionstatus");
            if (sessionstatus == "TIMEOUT") {
                windowNewLocation(xhr.getResponseHeader("CONTEXTPATH"));
            }
        }
});


function checkIdCode(identity_card) {
    var reg = /(^\d{15}$)|(^\d{17}(x|X|\d)$)/;
    if (reg.test(identity_card) === false) {
        return '请输入正确的身份证号！';
    } else {
        return identity_card;
    }
}

function checkIdentitycCard(table_name, table_id, id, identity_card) {
    $.ajax({
        type: 'post',
        data: {'table_name': table_name, 'table_id': table_id, 'id': id, 'identity_card': identity_card},
        url: 'common/checkIdCard',
        success: function (res) {
            if (res.length == 0) {
                getMsgByIdCard(identity_card);
                return true;
            } else {
                $('#identity_card').val('');
                alertMsg('该身份证号已经存在，请重新录入！', 'error');
                return false;

            }
        }
    });
}

function getInfo(identity_card) {
    var birth, gender;
    if (identity_card.length == 18) {
        birth = identity_card.substr(6, 4) + "-" + identity_card.substr(10, 2) + "-" + identity_card.substr(12, 2);
        gender = identity_card.substring(16, 17)
    }
    if (identity_card.length == 15) {
        birth = "19" + identity_card.substr(6, 2) + "-" + identity_card.substr(8, 2) + "-" + identity_card.substr(10, 2);
        gender = identity_card.substring(14, 15)
    }
    return {'birth': birth, 'gender': parseInt(gender) % 2 == 0 ? 2 : 1};//返回：1-男  2-女

}



/**
 * iframe弹出框（新打开一个页面url）
 * @param title
 * @param url
 * @param fn
 * @param area
 */
var layerIframe=function(title,url,fn,area){
    var set='auto';
    if(isNotEmpty(area)){
        if(window.screen.width<1000){area=['100%','100%'];set='t';}
    }else{
        if(window.screen.width>1366){area=['65%','80%'];}else if(1366>=window.screen.width>1000){area=['80%','80%'];}else{area=['100%','100%'];set='t';}
    }
    layer.open({
        title:title||'编辑信息',
        type: 2,
        content: url,
        area:area||['65%','80%'],
        anim: 2,
        offset: set,
        isOutAnim:false,
        btn:['关闭窗口'],
        btnAlign:'c',
        yes: function(){
            if(isNotEmpty(fn)){fn();}
            layer.closeAll();
        },
        cancel: function(){
            if(isNotEmpty(fn)){fn();}
        },
        end:function(){
            if(isNotEmpty(fn)){fn();}
        }
    });
}

/**
 * post请求
 * @param url
 * @param data
 * @param fn
 * @param errorFn
 */
function layPost(url,data,fn,errorFn) {
    var index = layer.load();
    $.ajax({
        type:'post',
        url:url,
        data:data,
        success:function(res){
            layer.close(index);
            if(isNotEmpty(fn)){fn(res);}
        },
        error:function(error){
            layer.close(index);
            if(!isNotEmpty(errorFn)){
                layerAlert(Base.errorTips+"（"+JSON.stringify(error)+"）",null,2);
            }else{
                errorFn();
            }
        }
    });
}
/**
 * 页面跳转
 * @type {{reload: layPage.reload, newLocation: layPage.newLocation, returnPage: layPage.returnPage, loginOut: layPage.loginOut, expire: layPage.expire}}
 */
var layPage={
    reload:function(){
        window.location.reload();
    },
    newLocation:function(url){
        window.location.href=Base.basePath+'/'+url;
    },
    returnPage:function(){
        history.go(-1);
    },
    loginOut:function(){
        window.top.location.href=Base.basePath+'/admin/login/loginOut';
    },
    expire:function(){
        window.top.location.href=Base.basePath;
    }
}


/**
 * 图片上传
 * @param upload
 */
var fileUpload=function(upload){
    upload.render({
        elem: '.layui-upload-drag'
        ,acceptMime: 'image/jpg,image/png,image/jpeg'
        ,before: function(){
            layer.open({type: 3,content: '上传中...'});
//                layer.tips('接口地址：'+ this.url, this.item, {tips: 1});
        }
        ,done: function(res, index, upload){
            layer.closeAll();
            this.item.html('<img src="'+res.filePath+'">');
            this.item.siblings('[file-input]').val(res.filePath);
        }
    })
}

/**
 * 获取表格选中数据的主键值组
 * @param data
 * @param primary
 * @returns {string}
 */
function fnGetTableCheckedDataWithPrimary(data,primary){
    var primaryValues='';
    $.each(data,function(i,o){
        primaryValues+=o[primary]+',';
    });
    return primaryValues.substring(0,primaryValues.lastIndexOf(','));
}

/**
 * msg提示框
 * @param msg
 * @param fn
 * @param icon  0：叹  1：勾  2：叉  3:问   4：锁   5：哭   6：笑
 * @param time
 */
var layerMsg=function(msg,fn,icon,time){
    layer.msg(msg, {
        icon: icon||1,
        time: time||2000
    }, function(){
        if(isNotEmpty(fn)){fn();}
    });
}
/**
 * alert提示框
 * @param content
 * @param fn
 * @param icon 0：叹  1：勾  2：叉  3:问   4：锁   5：哭   6：笑
 */
var layerAlert=function(content,fn,icon){
    layer.alert(content, isNotEmpty(icon)?{icon:icon}:null, function(index){
        if(isNotEmpty(fn)){fn();}
        layer.close(index);
    });
}
/**
 * confirm询问框
 * @param content
 * @param fn
 * @param icon 0：叹  1：勾  2：叉  3:问   4：锁   5：哭   6：笑
 */
var layerConfirm=function(content,fn,icon){
    layer.confirm(content,{icon: icon||3, title:'提示'},function(index){
        if(isNotEmpty(fn)){fn();}
        layer.close(index);
    });
}

/**
 * 图片放大显示
 * @param imgContent
 */
var layerShowImage=function(imgSrc,imgContent,area){
    if(isNotEmpty(area)){
        if(window.screen.width<1000){area='80%';}
    }else{
        if(window.screen.width>1366){area='50%';}else if(1366>=window.screen.width>1000){area='55%';}else{area='80%';}
    }
    layer.open({
        title:'图片资料',
        type: 1,
        area:area||'50%',
        content: (isNotEmpty(imgSrc)?'<img style="max-width: 90%;margin: auto;display: block;padding: 10px;" src="'+imgSrc+'">':imgContent),
        shadeClose:true
    });
}

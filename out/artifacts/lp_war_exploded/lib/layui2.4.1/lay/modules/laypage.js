/** layui-v2.4.1 MIT License By https://www.layui.com */
;layui.define(function (e) {
    "use strict";
    saveBaseSessionStorage();
    var a = document, t = "getElementById", n = "getElementsByTagName", i = "laypage", r = "layui-disabled",
        u = function (e) {
            var a = this;
            a.config = e || {}, a.config.index = ++s.index, a.render(!0)
        };
    u.prototype.type = function () {
        var e = this.config;
        if ("object" == typeof e.elem) return void 0 === e.elem.length ? 2 : 3
    }, u.prototype.view = function () {
        var e = this, a = e.config, t = a.groups = "groups" in a ? 0 | a.groups : 5;

        var this_info = JSON.parse(sessionStorage.getItem(window.location.pathname));
        a.curr=this_info.page;
        a.limit=a.limit||this_info.limit;

        a.layout = "object" == typeof a.layout ? a.layout : ["prev", "page", "next"], a.count = 0 | a.count, a.curr = 0 | a.curr || 1, a.limits = "object" == typeof a.limits ? a.limits : [10, 20, 30, 40, 50], a.limit = 0 | a.limit || 10, a.pages = Math.ceil(a.count / a.limit) || 1, a.curr > a.pages && (a.curr = a.pages), t < 0 ? t = 1 : t > a.pages && (t = a.pages), a.prev = "prev" in a ? a.prev : "&#x4E0A;&#x4E00;&#x9875;", a.next = "next" in a ? a.next : "&#x4E0B;&#x4E00;&#x9875;";
        var n = a.pages > t ? Math.ceil((a.curr + (t > 1 ? 1 : 0)) / (t > 0 ? t : 1)) : 1, i = {
            prev: function () {
                return a.prev ? '<a href="javascript:;" class="layui-laypage-prev' + (1 == a.curr ? " " + r : "") + '" data-page="' + (a.curr - 1) + '">' + a.prev + "</a>" : ""
            }(),
            page: function () {
                var e = [];
                if (a.count < 1) return "";
                n > 1 && a.first !== !1 && 0 !== t && e.push('<a href="javascript:;" class="layui-laypage-first" data-page="1"  title="&#x9996;&#x9875;">' + (a.first || 1) + "</a>");
                var i = Math.floor((t - 1) / 2), r = n > 1 ? a.curr - i : 1, u = n > 1 ? function () {
                    var e = a.curr + (t - i - 1);
                    return e > a.pages ? a.pages : e
                }() : t;
                for (u - r < t - 1 && (r = u - t + 1), a.first !== !1 && r > 2 && e.push('<span class="layui-laypage-spr">&#x2026;</span>'); r <= u; r++) r === a.curr ? e.push('<span class="layui-laypage-curr"><em class="layui-laypage-em" ' + (/^#/.test(a.theme) ? 'style="background-color:' + a.theme + ';"' : "") + "></em><em>" + r + "</em></span>") : e.push('<a href="javascript:;" data-page="' + r + '">' + r + "</a>");
                return a.pages > t && a.pages > u && a.last !== !1 && (u + 1 < a.pages && e.push('<span class="layui-laypage-spr">&#x2026;</span>'), 0 !== t && e.push('<a href="javascript:;" class="layui-laypage-last" title="&#x5C3E;&#x9875;"  data-page="' + a.pages + '">' + (a.last || a.pages) + "</a>")), e.join("")
            }(),
            next: function () {
                return a.next ? '<a href="javascript:;" class="layui-laypage-next' + (a.curr == a.pages ? " " + r : "") + '" data-page="' + (a.curr + 1) + '">' + a.next + "</a>" : ""
            }(),
            count: '<span class="layui-laypage-count">共 ' + a.count + " 条</span>",
            limit: function () {
                var e = '',style='',btn='',p_e='',p_a='';
                var exportBtn=a.export,customBtn=a.custom;
                if(exportBtn==undefined||exportBtn==true){
                    p_e='<span style="float:right"><select lay-ignore><option value="">——导出表格——</option><option value="0">导出当前页数据</option><option value="1">导出表格所有数据</option></select></span>';
                }
                if(customBtn==undefined||customBtn==true){
                    btn='<button class="laypage-custom-btn" style="cursor:pointer;">自定义分页</button>'
                    if(a.limit>90||(a.limit%10)!=0||a.limit<10){
                        e='<span style="display: none;"><select></select></span>';
                        style='display:inline-block;';
                        btn='';
                    }else{
                        e+='<span class="layui-laypage-limits"><select lay-ignore>';
                        layui.each(a.limits, function (t, n) {
                            e+='<option value="' + n + '"' + (n === a.limit ? "selected" : "") + ">" + n + " 条/页</option>";
                        });
                        e+='</select>'+btn+'</span>';
                        style="display:none;";
                    }
                    p_a='<span class="layui-laypage-custom" style="'+style+'"><input type="number" min="1" max="5000" class="layui-input page-input" value="'+a.limit+'" lay-ignore>条/页</span>';
                }else{
                    e+='<span class="layui-laypage-limits"><select lay-ignore>';
                    layui.each(a.limits, function (t, n) {
                        e+='<option value="' + n + '"' + (n === a.limit ? "selected" : "") + ">" + n + " 条/页</option>";
                    });
                    e+='</select>'+btn+'</span>';
                }
                return e+p_a+p_e;

            }(),
            refresh: ['<a href="javascript:;" data-page="' + a.curr + '" class="layui-laypage-refresh">', '<i class="layui-icon layui-icon-refresh"></i>', "</a>"].join(""),
            skip: function () {
                return ['<span class="layui-laypage-skip">&#x5230;&#x7B2C;', '<input type="text" min="1" value="' + a.curr + '" class="layui-input">', '&#x9875;<button type="button" class="layui-laypage-btn">&#x786e;&#x5b9a;</button>', "</span>"].join("")
            }()
        };
        return ['<div class="layui-box layui-laypage layui-laypage-' + (a.theme ? /^#/.test(a.theme) ? "molv" : a.theme : "default") + '" id="layui-laypage-' + a.index + '">', function () {
            var e = [];
            return layui.each(a.layout, function (a, t) {
                i[t] && e.push(i[t])
            }), e.join("")
        }(), "</div>"].join("")
    }, u.prototype.jump = function (e, a) {
        if (e) {
            /*var t = this, i = t.config, r = e.children, u = e[n]("button")[0], l = e[n]("input")[0],
                p = e[n]("select")[0], c = function () {
                    var e = 0 | l.value.replace(/\s|\D/g, "");
                    e && (i.curr = e, t.render())
                };
            if (a) return c();
            for (var o = 0, y = r.length; o < y; o++) "a" === r[o].nodeName.toLowerCase() && s.on(r[o], "click", function () {
                var e = 0 | this.getAttribute("data-page");
                e < 1 || e > i.pages || (i.curr = e, t.render())
            });
            p && s.on(p, "change", function () {
                var e = this.value;
                i.curr * e > i.count && (i.curr = Math.ceil(i.count / e)), i.limit = e, t.render()
            }), u && s.on(u, "click", function () {
                c()
            })*/
            var t = this, i = t.config, r = e.children, u = e[n]("button")[0], l = e[n]("input")[0],c_s=e[n]('button')[1],p_s=e[n]("select")[0],
                p = e[n]("input")[1],exp=e[n]("select")[1], c = function () {
                    var e = 0 | l.value.replace(/\s|\D/g, "");
                    e && (i.curr = e,saveSessionStorage(i), t.render());
                };
            if (a) return c();
            for (var o = 0, y = r.length; o < y; o++) "a" === r[o].nodeName.toLowerCase() && s.on(r[o], "click", function () {
                var e = 0 | this.getAttribute("data-page");
                e < 1 || e > i.pages || (i.curr = e, saveSessionStorage(i),t.render())
            });
            p_s && s.on(p_s, "change", function () {
                var e = this.value;
                i.curr * e > i.count && (i.curr = Math.ceil(i.count / e)), i.limit = e, saveSessionStorage(i),t.render()
            }),
            u && s.on(u, "click", function () {
                c()
            }),
            p && s.on(p, "blur", function () {
                var li=i.limit;
                var e = this.value;
                if(li==e){return;}
                if(e>5000){e=5000;}
                if(e<=0){e=10;}
                i.curr * e > i.count && (i.curr = Math.ceil(i.count / e)), i.limit = e,saveSessionStorage(i), t.render();
            }),
            c_s && s.on(c_s, "click", function () {
                $('#'+i.elem).find('.layui-laypage-limits').hide().siblings('.layui-laypage-custom').show();
            }),
            exp && s.on(exp, "change", function () {
                if(!isNotEmpty(this.value)){
                    return;
                }else{
                    var table=$('#'+i.elem).parent('.layui-table-page').parent('.layui-form').siblings('.layui-table');
                    var sqlId=$(table).attr('export-id');
                    var keys="",values="";
                    $.each($(table).find('th[export-key]'),function(i,o){
                        keys+=$(o).attr("export-key")+",";
                        values+=$(o).text()+",";
                    });
                    if(!isNotEmpty(sqlId)||!isNotEmpty(keys)){
                        alert("该模块由于某些原因暂未开放导出表格数据的功能，如需导出请联系开发人员");
                        return;
                    }
                    var sheetName="导出当前页数据";
                    var page=JSON.parse(sessionStorage.getItem(window.location.pathname)).page;
                    var limit=JSON.parse(sessionStorage.getItem(window.location.pathname)).limit;
                    //考虑页面的搜索条件
                    if(this.value==1) {//导出全部数据
                        limit = 0;
                        sheetName="导出表格全部数据";
                    }
                    var url = "file/downLoadTable";
                    var form = $("<form name='download_cond_form'></form>").attr("action", url).attr("method", "post");
                    form.append($("<input></input>").attr("type", "hidden").attr("name", "keys").attr("value", keys));
                    form.append($("<input></input>").attr("type", "hidden").attr("name", "values").attr("value", values));
                    form.append($("<input></input>").attr("type", "hidden").attr("name", "sheetName").attr("value", sheetName));
                    form.append($("<input></input>").attr("type", "hidden").attr("name", "page").attr("value", page));
                    form.append($("<input></input>").attr("type", "hidden").attr("name", "limit").attr("value", limit));
                    form.append($("<input></input>").attr("type", "hidden").attr("name", "sqlId").attr("value", sqlId));
                    form.append($("<input></input>").attr("type", "hidden").attr("name", "search_param").attr("value", $('#search_param').val()));
                    if(isNotEmpty(document.forms['cond-form'])){
                        $('form[name="cond-form"] input[type="hidden"],form[name="cond-form"] select[lay-filter]').each(function(i,o){
                            if(isNotEmpty($(o).val())){
                                form.append($("<input></input>").attr("type", "hidden").attr("name", $(o).attr('name')||$(o).attr('id')).attr("value", $(o).val()));
                            }
                        });
                        // form.append(document.forms['cond-form'].elements[':hidden']);
                    }
                    form.appendTo('body').submit().remove();

                }
            }),u && s.on(u, "click", function () {
                c()
            })

        }
    }, u.prototype.skip = function (e) {
        if (e) {
            var a = this, t = e[n]("input")[0];
            t && s.on(t, "keyup", function (t) {
                var n = this.value, i = t.keyCode;
                /^(37|38|39|40)$/.test(i) || (/\D/.test(n) && (this.value = n.replace(/\D/, "")), 13 === i && a.jump(e, !0))
            })
        }
    }, u.prototype.render = function (e) {
        var n = this, i = n.config, r = n.type(), u = n.view();

        var this_info = JSON.parse(sessionStorage.getItem(window.location.pathname));
        i.curr=this_info.page;
        i.limit=this_info.limit!=0?this_info.limit:i.limit;

        2 === r ? i.elem && (i.elem.innerHTML = u) : 3 === r ? i.elem.html(u) : a[t](i.elem) && (a[t](i.elem).innerHTML = u), i.jump && i.jump(i, e);
        var s = a[t]("layui-laypage-" + i.index);
        n.jump(s), i.hash && !e && (location.hash = "!" + i.hash + "=" + i.curr), n.skip(s)
    };
    var s = {
        render: function (e) {
            var a = new u(e);
            return a.index
        }, index: layui.laypage ? layui.laypage.index + 1e4 : 0, on: function (e, a, t) {
            return e.attachEvent ? e.attachEvent("on" + a, function (a) {
                a.target = a.srcElement, t.call(e, a)
            }) : e.addEventListener(a, t, !1), this
        }
    };
    e(i, s)
});
/**
 * 简单的颜色选择器
 * @author yl
 * @time 2017/08/15
 */
/************************ 参数介绍 ***************************/
// containerId: (string) 弹框容器id
// left: (int)距离触发按钮左边距离
// top: (int)距离触发元素顶部距离
// defaultColor: (string)默认颜色
// customColor: (array)自定义颜色
// format: (array)标准色

;(function($){
    $.fn.ylColor = function(options){
        var defaults = {
            containerId: 'ylColor',
            left: 50,
            top: 0,
            defaultColor: '#000'
        };
        defaults.customColor = [
            '&#xe68e;','&#xe66c;','&#xe66a;','&#xe667;','&#xe7ae;','&#xe665;','&#xe716;','&#xe653;','&#xe663;','&#xe660;',
            '&#xe65e;','&#xe659;','&#xe735;','&#xe756;','&#xe715;','&#xe705;','&#xe6b2;','&#xe657;','&#xe681;','&#xe770;',
            '&#xe645;','&#xe63c;','&#xe637;','&#xe631;','&#xe62d;','&#xe62c;','&#xe628;','&#xe615;','&#xe60a;','&#xe600;',
            '&#xe609;','&#xe604;','&#xe606;','&#xe60e;','&#xe621;','&#xe62e;','&#xe630;','&#xe63b;','&#xe6ed;','&#xe64d;',
            '&#xe6c9;','&#xe67b;','&#xe67a;','&#xe675;','&#xe673;','&#xe6b1;','&#xe67c;','&#xe670;','&#xe641;','&#xe639;'
        ];

        var settings = $.extend(defaults,options);
        var elems = this;
        var cur_elem;

        var event = function(){
            $(elems).each(function(){
                $(this).click(function(){
                    show(this);
                });
            });
            $('#' + settings.containerId).find('.aCol').click(function(){
                onSelect(this);
            });
        };
        var build = function(){
            var containerId = settings.containerId;
            var containerDiv = $('<div id="'+ containerId+'" class="ylColor" style="display: none"></div>');
            var customDiv = $('<div class="ylColor-custom"></div>');
            var formatDiv = $('<div class="ylColor-format"></div>');

            var liHtml = '';
            $.each(settings.customColor,function(i,e){
                liHtml += '<li class="aCol" data-icon="'+e+'"><i class="layui-icon">'+e+'</i></li>';
            });
            customDiv.append('<div class="title">系统图片</div><ul>'+liHtml+'</ul>');

            if($('#' + containerId).length == 0){
                //不存在，则创建
                $('body').append(containerDiv);
            }
            containerDiv.append(customDiv,formatDiv);

        }
        var show = function(elem){
            cur_elem = elem;
            var top = $(elem).offset().top;
            var left = $(elem).offset().left;
            $('#' + settings.containerId).css({
                top: top + settings.top,
                left: left + settings.left,
            }).fadeIn(50);
        };
        var onSelect = function(selectOne){
            $('#'+ settings.containerId).fadeOut(50);
            if(options.onSelect){
                options.onSelect(selectOne,cur_elem);
            }
        };

        build();
        event();
    };
})(jQuery);
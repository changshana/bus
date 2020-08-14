let center, map, tmap;
var init = function () {
    tmap = new TMap.Map('container', {
        center: new TMap.LatLng(30.630319, 104.083767),//地图显示中心点
        zoom: 12	//缩放级别
    });
    let loadIndex = layer.load(0, {content: '初始化地图组件中...', shade: 0.8});
    registerStartService();
    registerEndService();
    layer.close(loadIndex)
}

function registerStartService() {
    var ap_start = new qq.maps.place.Autocomplete(document.getElementById("start"));
    var keyword = "";
    //调用Poi检索类。用于进行本地检索、周边检索等服务。
    var searchService_s = new qq.maps.SearchService({
        complete: function (results) {
            if (results.type === "CITY_LIST") {
                searchService_s.setLocation(results.detail.cities[0].cityName);
                searchService_s.search(keyword);
                return;
            }
            startPoiList = results.detail.pois;
        }
    });
    //添加监听事件
    qq.maps.event.addListener(ap_start, "confirm", function (res) {
        searchService_s.search(res.value);
        startIndex = res.index;
    });
}

function registerEndService() {
    var ap_end = new qq.maps.place.Autocomplete(document.getElementById("endPoint"));
    var keyword_end = "";
    //调用Poi检索类。用于进行本地检索、周边检索等服务。
    var searchService_e = new qq.maps.SearchService({
        complete: function (results) {
            if (results.type === "CITY_LIST") {
                searchService_e.setLocation(results.detail.cities[0].cityName);
                searchService_e.search(keyword_end);
                return;
            }
            endPoiList = results.detail.pois;
        }
    });
    //添加监听事件
    qq.maps.event.addListener(ap_end, "confirm", function (res) {
        searchService_e.search(res.value);
        endIndex = res.index;
    });
}

function displayRout() {
    //WebServiceAPI请求URL（驾车路线规划默认会参考实时路况进行计算）
    var from = startPoiList[startIndex].latLng;
    var to = endPoiList[endIndex].latLng;
    var url = "https://apis.map.qq.com/ws/direction/v1/driving/"; //请求路径
    url += "?from=" + from.lat + "," + from.lng;  //起点坐标
    url += "&to=" + to.lat + "," + to.lng;  //终点坐标
    url += "&output=jsonp&callback=cb";  //指定JSONP回调函数名，本例为cb
    url += "&key=ZHLBZ-IUWCK-GIUJ2-AQQHR-KLO7S-6NFCR"; //开发key，可在控制台自助创建
    //url += "&refer=cEbWPlpNof4ZPAyqU1N8bmNkduUrREOV";
    $("#start_pos").attr("lat", from.lat).attr('lng', from.lng);
    $("#end_pos").attr("lat", to.lat).attr('lng', to.lng);
    jsonp_request(url);
}

//浏览器调用WebServiceAPI需要通过Jsonp的方式，此处定义了发送JOSNP请求的函数
function jsonp_request(url) {
    var script = document.createElement('script');
    script.src = url;
    document.body.appendChild(script);
}

//定义请求回调函数
function cb(ret) {
    //从结果中取出路线坐标串
    var coords = ret.result.routes[0].polyline, pl = [];
    //坐标解压（返回的点串坐标，通过前向差分进行压缩，因此需要解压）
    var kr = 1000000;
    for (var i = 2; i < coords.length; i++) {
        coords[i] = Number(coords[i - 2]) + Number(coords[i]) / kr;
    }
    //将解压后的坐标生成LatLng数组
    //将解压后的坐标放入点串数组pl中
    for (var i = 0; i < coords.length; i += 2) {
        pl.push(new TMap.LatLng(coords[i], coords[i + 1]));
    }
    display_polyline(pl)//显示路线
    handle(ret.result.routes[0].distance, ret.result.routes[0].duration);//显示预估时间和距离
}

function handle(distance, duration) {
    $("#distance").parent().remove();
    $("#duration").parent().remove();
    var html =
        '<p>' +
        '   <span>预估距离(千米)</span>' +
        '   <input class="input-panel" value="' + (distance / 1000) + '" id="distance" readonly/>' +
        '</p>' +
        '<p>' +
        '   <span>预估时间(分钟)</span>' +
        '   <input class="input-panel" value="' + (duration) + '" id="duration" readonly/>' +
        ' </p>';
    $(".other-info").prepend(html);
}

let polylineLayer;

function display_polyline(pl) {
    //创建起点和终点
    addMarker()
    //创建 MultiPolyline显示折线
    if (isEmpty(polylineLayer)) {
        polylineLayer = new TMap.MultiPolyline({
            id: 'polyline-layer-t', //图层唯一标识
            map: tmap,//绘制到目标地图
            //折线样式定义
            styles: {
                'style_blue': new TMap.PolylineStyle({
                    'color': '#3777FF', //线填充色
                    'width': 8, //折线宽度
                    'borderWidth': 5, //边线宽度
                    'borderColor': '#FFF', //边线颜色
                    'lineCap': 'round', //线端头方式
                })
            },
            //折线数据定义
            geometries: [
                {
                    'id': 'pl_1',//折线唯一标识，删除时使用
                    'styleId': 'style_blue',//绑定样式名
                    'paths': pl
                }
            ]
        });
    } else {
        var geom = [
            {
                'id': 'pl_1',//折线唯一标识，删除时使用
                'styleId': 'style_blue',//绑定样式名
                'paths': pl
            }
        ];
        polylineLayer.setGeometries(geom);
    }
}

let marker_layer;

function addMarker() {
    var from = startPoiList[startIndex].latLng;
    var to = endPoiList[endIndex].latLng;
    if (isEmpty(polylineLayer)) {
        marker_layer = new TMap.MultiMarker({
            id: 'marker-layer',
            map: tmap,
            styles: {
                "start": new TMap.MarkerStyle({
                    "width": 25,
                    "height": 35,
                    "anchor": {x: 16, y: 32},
                    "src": 'https://mapapi.qq.com/web/lbs/javascriptGL/demo/img/start.png'
                }),
                "end": new TMap.MarkerStyle({
                    "width": 25,
                    "height": 35,
                    "anchor": {x: 16, y: 32},
                    "src": 'https://mapapi.qq.com/web/lbs/javascriptGL/demo/img/end.png'
                })
            },
            geometries: [{
                "id": 'start',
                "styleId": 'start',
                "position": new TMap.LatLng(from.lat, from.lng)
            }, {
                "id": 'end',
                "styleId": 'end',
                "position": new TMap.LatLng(to.lat, to.lng)
            }]
        });
    } else {
        var geom = [{
            "id": 'start',
            "styleId": 'start',
            "position": new TMap.LatLng(from.lat, from.lng)
        }, {
            "id": 'end',
            "styleId": 'end',
            "position": new TMap.LatLng(to.lat, to.lng)
        }];
        marker_layer.setGeometries(geom);
    }
}

function isEmpty(obj) {
    return obj == null || obj == "" || obj == undefined;

}
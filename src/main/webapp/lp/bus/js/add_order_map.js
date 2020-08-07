var init = function () {
    center = new qq.maps.LatLng(30.630319, 104.083767);
    map = new qq.maps.Map(document.getElementById('container'), {
        center: center,
        zoom: 13
    });
    var infoWin = new qq.maps.InfoWindow({
        map: map
    });
    infoWin.open();
    infoWin.setContent('四川省成都市武侯区一环路南一段24号');
    infoWin.setPosition(map.getCenter());

    registerStartService();
    registerEndService();
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
            var pois = results.detail.pois;
            startPoiList = results.detail.pois;
            var latlngBounds = new qq.maps.LatLngBounds();
            for (var i = 0, l = pois.length; i < l; i++) {
                var poi = pois[i];
                latlngBounds.extend(poi.latLng);
                var marker = new qq.maps.Marker({
                    map: map,
                    position: poi.latLng
                });

                marker.setTitle(poi.name);
            }
            map.fitBounds(latlngBounds);
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
            var pois = results.detail.pois;
            endPoiList = results.detail.pois;
            var latlngBounds = new qq.maps.LatLngBounds();
            for (var i = 0, l = pois.length; i < l; i++) {
                var poi = pois[i];
                latlngBounds.extend(poi.latLng);
                var marker = new qq.maps.Marker({
                    map: map,
                    position: poi.latLng
                });

                marker.setTitle(poi.name);
            }
            map.fitBounds(latlngBounds);
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
    url += "&refer=cEbWPlpNof4ZPAyqU1N8bmNkduUrREOV";

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
    console.log(ret);
    //从结果中取出路线坐标串
    var coors = ret.result.routes[0].polyline, pl = [];
    //坐标解压（返回的点串坐标，通过前向差分进行压缩，因此需要解压）
    var kr = 1000000;
    for (var i = 2; i < coors.length; i++) {
        coors[i] = Number(coors[i - 2]) + Number(coors[i]) / kr;
    }
    //将解压后的坐标生成LatLng数组
    for (var i = 0; i < coors.length; i += 2) {
        pl.push(new TMap.LatLng(coors[i], coors[i + 1]));
    }
    display_polyline(pl)//显示路线
}

function display_polyline(pl) {
    //创建 MultiPolyline显示折线
    var polylineLayer = new TMap.MultiPolyline({
        id: 'polyline-layer', //图层唯一标识
        map: map,//绘制到目标地图
        //折线样式定义
        styles: {
            'style_blue': new TMap.PolylineStyle({
                'color': '#3777FF', //线填充色
                'width': 6, //折线宽度
                'borderWidth': 5, //边线宽度
                'borderColor': '#FFF', //边线颜色
                'lineCap': 'round' //线端头方式
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
}

function isEmpty(obj) {
    return obj == null || obj == "" || obj == undefined;

}

function fnSetOption(type,myChart){
    $('#myChart>div').css('background','none');
    $('#myChart>div .point_img').remove();
    $('.point_content').hide();
    myChart.clear();
    $.ajax({
        type:'post',
        data:{'type':type},
        url:'dormitory/xionggy/getDormitoryConsoleMsg',
        success:function(res){

            switch(type){
                case 'occupancyMap':
                    var groups=res.groups;

                    var height=$('#myChart>div').height();
                    var width=$('#myChart>div').width();
                    var margins_top=[],margins_left=[];
                    for(var i=0;i<parseInt((height-50)/10);i++){
                        margins_top.push((i+1)*10);
                    }
                    for(var i=0;i<parseInt((width-50)/10);i++){
                        margins_left.push((i+1)*10);
                    }
                    var point='';
                    $('#myChart>div').css('background','url("lp/static/images/dormitory/bg_map.png")');
                    $.each(res.groups,function(m,n){
                        point='<span default-group="'+n.group_id+'" default-name="'+n.site_name+n.group_name+'" class="point_img" style="z-index: '+(m+2)+';margin-left: '+margins_left[Math.floor(Math.random()*margins_left.length)]+'px;margin-top: '+margins_top[Math.floor(Math.random()*margins_top.length)]+'px"></span>';
                        $('#myChart>div').append(point);
                    });
                    $('.point_img').click(function(){
                        var obj=$(this);
                        $.ajax({
                            type:'post',
                            url:'dormitory/xionggy/getGroupCheckInMsg',
                            data:{'group_id':$(obj).attr('default-group')},
                            success:function(res){
                                $('.point_content').show().attr('style','margin-top:'+((height-320)/2-height)+'px;margin-left:'+((width-580)/2)+'px');
                                $(obj).addClass('point_check').siblings('.point_img').removeClass('point_check');
                                $('#student_count').text(res.student_count);
                                $('#room_count').text(res.room_count);
                                $('#bed_count').text(res.bed_count);
                                $('#empty_room_count').text(res.empty_room_count);
                                $('#empty_bed_count').text(res.empty_bed_count);
                                $('#group_name').text($(obj).attr('default-name'));
                            }
                        });
                    });
                    break;
                case 'roomTypeAnalysis':
                    var room_type= res.room_type;
                    var room_name_data=[],room_count_data=[],room_sum=0;
                    $.each(room_type,function(i,o){
                        room_name_data.push(o.name);
                        room_count_data.push(o.value);
                        room_sum+=o.value;
                    });
                    var room_sum_data=[];
                    $.each(room_count_data,function(i,o){
                        room_sum_data.push(room_sum);
                    });
                    var roomTypeAnalysisOption = {
                        grid: {
                            left: '5%',
                            right: '40%',
                            bottom: '3%',
                            top: '3%',
                            containLabel: true
                        },
                        legend: {
                            orient: 'vertical',
                            x: '75%',
                            y:'55%',
                            itemGap:15,
                            textStyle: {color: '#ffffff'},
                            data:room_name_data
                        },
                        xAxis:  [{
                            type: 'value',
                            show: false
                        },{
                            type: 'value',
                            show: false
                        }],
                        yAxis: [{
                            type: 'category',
                            axisLine: {
                                show: false
                            },
                            axisTick: {
                                show: false
                            },
                            axisLabel: {
                                color: '#fff',
                                fontSize: 14,
                                fontWeight: 400,
                                interval: 0
                            },
                            data: room_name_data,
                        },
                            {
                                type: 'category',
                                axisLine: {
                                    show: false
                                },
                                axisTick: {
                                    show: false
                                },
                                axisLabel: {
                                    color: '#fff',
                                    fontSize: 14,
                                    fontWeight: 300,
                                    interval: 0
                                },
                                data: room_count_data
                            }],
                        series: [
                            {
                                name: '房间数',
                                type: 'bar',
                                barWidth: 15,
                                itemStyle: {
                                    normal: {
                                        barBorderRadius: [5, 5, 5,5],
                                    },
                                },
                                data: room_count_data
                            }, {
                                name: '框',
                                type: 'bar',
                                yAxisIndex: 0,
                                barGap: '-100%',
                                data: room_sum_data,
                                barWidth: 15,
                                itemStyle: {
                                    normal: {
                                        color: 'none',
                                        borderColor: '#0a437c',
                                        borderWidth: 1,
                                        barBorderRadius: [5, 5, 5,5],
                                    }
                                }
                            },{
                                type: 'pie',
                                radius : '30%',
                                center: ['80%', '30%'],
                                selectedMode: 'single',
                                data:room_type,
                                labelLine: {
                                    normal: {
                                        show: true
                                    }
                                }
                            }
                        ],color:['#3398db','#80B800','#A488D5','#657487','#EEAA00','#00A7EE']
                    };
                    /*var roomTypeAnalysisOption = {
                        color: ['#3398db'],
                        tooltip: {
                            trigger: 'axis',
                            axisPointer: {
                                type: 'shadow'
                            }
                        },
                        legend: {
                            orient: 'vertical',
                            x: '85%',
                            y:'10%',
                            itemGap:15,
                            textStyle: {color: '#ffffff'},
                            data:room_name_data
                        },
                        grid: {
                            left: '5%',
                            right: '5%',
                            bottom: '5%',
                            containLabel: true
                        },
                        xAxis: {
                            type: 'value',
                            axisLabel: {
                                color: '#fff',
                                fontSize: 13,
                                fontWeight: 400,
                                interval: 0
                            },
                            splitLine:{
                                show:false
                            },
                            boundaryGap: false,
                        },
                        yAxis: {
                            type: 'category',
                            splitLine:{
                                show:false
                            },
                            axisLabel: {
                                color: '#fff',
                                fontSize: 13,
                                fontWeight: 400,
                                interval: 0
                            },
                            data:room_name_data
                        },
                        series: [
                            {
                                name: '房间数',
                                type: 'bar',
                                zlevel:1,
                                barMaxWidth:'40',
                                data: room_count_data
                            },{
                                type: 'pie',
                                radius : '30%',
                                center: ['70%', '30%'],
                                selectedMode: 'single',
                                zlevel:2,
                                data:room_type,
                                labelLine: {
                                    normal: {
                                        show: false
                                    }
                                }
                            }
                        ]
                    };*/

                    myChart.setOption(roomTypeAnalysisOption);
                    break;
                case 'bedRest':
                    var bed_rest=res.bed_rest;
                    var bed_data=[];
                    $.each(bed_rest,function(i,o){
                        bed_data.push('{a|剩余床位：'+o.bed_count+'}\n'+o.site_name+'-'+o.group_name);
                    });

                    var uploadedDataURL = "";
                    var radarStyle = document.createElement("style");
                    var str = '#chart-panel:after {width: 100%;height: 100%;content: \' \';display: block;background: url("lp/static/images/dormitory/data-1537519874661-sKxXo9lsW.png");background-size: 50%;background-position: center;background-repeat: no-repeat;position: absolute;top: 10px;left: 0;right: 0;margin: 0 auto; -webkit-animation: radar-beam 3s infinite linear;z-index: 20;transform: translate(-50%,0);}@keyframes radar-beam {0% {transform: rotate(0deg);}100% {transform: rotate(360deg);}}';
                    if(radarStyle.styleSheet){         //ie下
                        radarStyle.styleSheet.cssText = str;
                    } else {
                        radarStyle.innerHTML = str;
                    };
                    document.getElementsByTagName("head")[0].appendChild(radarStyle);


                    var dataArr = []
                    var series = []
                    for (var i = 0; i < dataArr.length; i++) {
                        series.push({
                            coordinateSystem: 'polar',
                            name: 'line',
                            type: 'line',
                            z: 20,
                            lineStyle: {
                                color: '#0fe3ec',
                                width: 1
                            },
                            symbol: 'circle',
                            symbolSize: 8,
                            itemStyle: {
                                color: '#fbbc5e'
                            },
                            data: dataArr[i]
                        })
                    }
                    var bedRestOption = {
                        backgroundColor: '#0c2133',
                        grid: {
                            left: '20%',
                            right: '20%'
                        },

                        angleAxis: {
                            interval: 1,
                            type: 'category',
                            data: bed_data,
                            z: 10,
                            axisLine: {
                                show: false,
                                lineStyle: {
                                    color: "#1d51a3",
                                    width: 1,
                                    type: "dashed",
                                    opacity: 0.7
                                }
                            },
                            axisLabel: {
                                interval: 0,
                                show: true,
                                color: "#d5d5dd",
                                margin: 2,
                                fontSize: 11,
                                lineHeight: 15,
                                align: 'center',
                                rich: {
                                    a: {
                                        align: 'center',
                                    }
                                }
                            },
                            axisTick: {
                                show: true
                            }
                        },
                        radiusAxis: {
                            min: 0,
                            max: 100,
                            interval: 20,
                            axisLine: {
                                show: false,
                                lineStyle: {
                                    color: "#00c7ff",
                                    width: 1,
                                    type: "dashed"
                                }
                            },
                            axisTick: {
                                show: false
                            },
                            axisLabel: {
                                show: false
                            },
                            splitLine: {
                                lineStyle: {
                                    color: "#1d51a3",
                                    width: 1,
                                    type: "dashed",
                                    opacity: 0.7
                                }
                            },
                            splitArea: {
                                show: true,
                                areaStyle: {
                                    color: '#1d51a3',
                                    opacity: 0.5
                                }
                            }
                        },
                        polar: {},
                        geo: {
                            map: 'world',
                            left: '30%',
                            right: '30%',
                            z: 15,
                            label: {
                                emphasis: {
                                    show: false
                                }
                            },
                            mapType: 'world',
                            itemStyle: {
                                normal: {
                                    areaColor: '#3dacdd',
                                    borderColor: '#3dacdd'
                                },
                                emphasis: {
                                    areaColor: '#3dacdd'
                                }
                            }
                        },
                        series: series
                    };
                    myChart.setOption(bedRestOption);
                    break;
                case 'studentSexRatio':
                    var student_sum_man=0,student_sum_woman=0,student_sum=0;
                    var student_sum_arr=res.student_sum_arr;
                    $.each(student_sum_arr,function(i,o){
                        if(o.sex==1){student_sum_man=o.student_sum;}
                        if(o.sex==2){student_sum_woman=o.student_sum;}
                    });
                    student_sum=student_sum_man+student_sum_woman;
                    var man_scale=(student_sum_man/student_sum*100).toFixed(2);
                    var woman_scale=(student_sum_woman/student_sum*100).toFixed(2);

                    if(man_scale=='NaN'){man_scale=0.0;}
                    if(woman_scale=='NaN'){woman_scale=0.0;}

                    var placeHolderStyle = {
                        normal: {
                            label: {
                                show: false
                            },
                            labelLine: {
                                show: false
                            },
                            color: "rgba(0,0,0,0)",
                            borderWidth: 0
                        },
                        emphasis: {
                            color: "rgba(0,0,0,0)",
                            borderWidth: 0
                        }
                    };
                    var dataStyle = {
                        normal: {
                            formatter: '{c}%',
                            position: 'center',
                            show: true,
                            textStyle: {
                                fontSize: '18',
                                fontWeight: 'normal',
                                color: '#fff'
                            }
                        }
                    };
                    var studentSexRatioOption = {
                        title: [{
                            text: '入住学生男生',
                            left: '27%',
                            top: '52%',
                            textAlign: 'center',
                            textStyle: {
                                fontWeight: 'normal',
                                fontSize: '14',
                                color: '#fff',
                                textAlign: 'center',
                            },
                        }, {
                            text: '入住学生女生',
                            left: '70%',
                            top: '70%',
                            textAlign: 'center',
                            textStyle: {
                                color: '#fff',
                                fontWeight: 'normal',
                                fontSize: '14',
                                textAlign: 'center',
                            },
                        }],
                        series: [{
                            type: 'pie',
                            hoverAnimation: false, //鼠标经过的特效
                            radius: ['25%', '31%'],
                            center: ['27%', '32%'],
                            startAngle: 225,
                            labelLine: {
                                normal: {
                                    show: false
                                }
                            },
                            label: {
                                normal: {
                                    position: 'center'
                                }
                            },
                            data: [{
                                value: man_scale,
                                itemStyle: {
                                    normal: {
                                        color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                            offset: 0,
                                            color: '#99da69'
                                        }, {
                                            offset: 1,
                                            color: '#01babc'
                                        }]),
                                    }
                                },
                                label: dataStyle,
                            }, {
                                value: 33,
                                itemStyle: placeHolderStyle,
                            },

                            ]
                        },
                            {
                                type: 'pie',
                                hoverAnimation: false,
                                radius: ['25%', '31%'],
                                center: ['70%', '50%'],
                                startAngle: 225,
                                labelLine: {
                                    normal: {
                                        show: false
                                    }
                                },
                                label: {
                                    normal: {
                                        position: 'center'
                                    }
                                },
                                data: [{
                                    value: woman_scale,
                                    itemStyle: {
                                        normal: {
                                            color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                                offset: 0,
                                                color: '#9f3edd'
                                            }, {
                                                offset: 1,
                                                color: '#4897f6'
                                            }]),
                                        }
                                    },
                                    label: dataStyle,
                                }, {
                                    value: 33,
                                    itemStyle: placeHolderStyle,
                                },

                                ]
                            },

                            //外圈的边框
                            {
                                // name: '总人数',
                                type: 'pie',
                                hoverAnimation: false, //鼠标经过的特效
                                radius: ['31%', '32%'],
                                center: ['27%', '32%'],
                                startAngle: 225,
                                labelLine: {
                                    normal: {
                                        show: false
                                    }
                                },
                                label: {
                                    normal: {
                                        position: 'center'
                                    }
                                },
                                data: [{
                                    value: 100,
                                    itemStyle: {
                                        normal: {
                                            color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                                offset: 0,
                                                color: '#01babc'
                                            }, {
                                                offset: 1,
                                                color: '#99da69'
                                            }]),
                                        }
                                    },
                                }, {
                                    value: 33,
                                    itemStyle: placeHolderStyle,
                                },

                                ]
                            },
                            {
                                type: 'pie',
                                hoverAnimation: false,
                                radius: ['31%', '32%'],
                                center: ['70%', '50%'],
                                startAngle: 225,
                                labelLine: {
                                    normal: {
                                        show: false
                                    }
                                },
                                label: {
                                    normal: {
                                        position: 'center'
                                    }
                                },
                                data: [{
                                    value: 100,
                                    itemStyle: {
                                        normal: {
                                            color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                                offset: 0,
                                                color: '#4897f6'
                                            }, {
                                                offset: 1,
                                                color: '#9f3edd'
                                            }]),
                                        }
                                    },
                                }, {
                                    value: 33,
                                    itemStyle: placeHolderStyle,
                                },

                                ]
                            },
                        ]
                    };
                    myChart.setOption(studentSexRatioOption);
                    break;
                case 'studentCheckIn':
                    var check_data_arr=res.check_data_arr;
                    var check_name_arr=res.check_name_arr;
                    const targetCoord = [50, 80]
                    const curveness = 0.2
                    const linesData = []
                    const categories = [{
                        name: '流入中',
                        itemStyle: {
                            normal: {
                                color: new echarts.graphic.LinearGradient(0, 0, 1, 0, [{
                                    offset: 0,
                                    color: '#01acca'
                                }, {
                                    offset: 1,
                                    color: '#5adbe7'
                                }]),
                            }
                        },
                        label: {
                            normal: {
                                fontSize: '14'
                            }
                        },
                    }, {
                        name: '暂无流入',
                        itemStyle: {
                            normal: {
                                color: new echarts.graphic.LinearGradient(0, 0, 1, 0, [{
                                    offset: 0,
                                    color: '#ffb402'
                                }, {
                                    offset: 1,
                                    color: '#ffdc84'
                                }]),
                            }
                        },
                        label: {
                            normal: {
                                fontSize: '14'
                            }
                        },
                    }]

                    const item_check_in = {
                        name: "未毕业学生",
                        value: targetCoord,
                        symbolSize: 70,
                        itemStyle: {
                            normal: {
                                position:'bottom',
                                color: new echarts.graphic.LinearGradient(0, 0, 1, 0, [{
                                    offset: 0,
                                    color: '#157eff'
                                }, {
                                    offset: 1,
                                    color: '#35c2ff'
                                }]),
                            }
                        },
                        label: {
                            normal: {
                                fontSize: '14'
                                ,color:'#fff'
                            }
                        },
                    };
                    const items=[];
                    var category=0,active=true,item_name='',item_value='';
                    for(var j=0;j<check_name_arr.length;j++){
                        if(check_name_arr[j]=='已入住'||check_name_arr[j]=='已退宿'){
                            category=1;
                            active=false;
                        }else{
                            category=0;
                            active=true;
                        }
                        item_value=check_data_arr[j].value;
                        item_name=check_name_arr[j]+'('+item_value+')';
                        switch (check_name_arr[j]){
                            case '未分房':items.push({name:item_name,category:category,active:active,speed:item_value,value:[0,0]});break;
                            case '已分房未确认':items.push({name:item_name,category:category,active:active,speed:item_value,value:[0,150]});break;
                            case '入住未确认':items.push({name:item_name,category:category,active:active,speed:item_value,value:[0,300]});break;
                            case '已入住':items.push({name:item_name,category:category,active:active,speed:item_value,value:[30,500]});break;
                            case '退宿未确认':items.push({name:item_name,category:category,active:active,speed:item_value,value:[0,450]});break;
                            case '已退宿':items.push({name:item_name,category:category,active:active,speed:item_value,value:[50,400]});break;
                        }
                    }
                    const data = items.concat([item_check_in]);

                    items.forEach(function(el) {
                        if (el.active) {
                            linesData.push([{
                                coord: el.value
                            }, {
                                coord: targetCoord
                            }])
                        }
                    });

                    const links = items.map((el) => {
                        return {
                            source: el.name,
                            target: item_check_in.name,
                            speed: el.speed,
                            lineStyle: {
                                normal: {
                                    color: el.speed ? '#12b5d0' : '#ff0000',
                                    curveness: curveness,
                                }
                            },
                        }
                    });


                    var studentCheckInOption = {
                        grid: {
                            left: '10%',
                            right: '15%',
                            bottom: '10%',
                            top: '10%',
                            containLabel: true
                        },
                        xAxis: {
                            show: false,
                            type: 'value'
                        },
                        yAxis: {
                            show: false,
                            type: 'value'
                        },
                        series: [{
                            type: 'graph',
                            layout: 'none',
                            coordinateSystem: 'cartesian2d',
                            symbolSize: 40,
                            z: 3,
                            edgeLabel: {
                                normal: {
                                    show: true,
                                    textStyle: {
                                        fontSize: 12
                                    },
                                    formatter: function(params) {
                                        var txt = ''
                                        if (params.data.speed !== undefined) {
                                            txt = params.data.speed
                                        }
                                        return txt
                                    },
                                }
                            },
                            label: {
                                normal: {
                                    show: true,
                                    fontSize: '8',
                                    position: 'bottom',
                                    color: '#fff'
                                }
                            },
                            itemStyle: {
                                normal: {
                                    shadowColor: 'none',
                                    fontSize:'10'
                                },
                                emphasis: {

                                }
                            },
                            lineStyle: {
                                normal: {
                                    width: 2,
                                    shadowColor: 'none'
                                },
                            },
                            edgeSymbol: ['none', 'arrow'],
                            edgeSymbolSize: 8,
                            data: data,
                            links: links,
                            categories: categories
                        }, {
                            name: 'A',
                            type: 'lines',
                            coordinateSystem: 'cartesian2d',
                            z: 1,
                            effect: {
                                show: true,
                                smooth: false,
                                trailLength: 0,
                                symbol: "arrow",
                                color: 'rgba(55,155,255,0.5)',
                                symbolSize: 12
                            },
                            lineStyle: {
                                normal: {
                                    curveness: curveness
                                }
                            },
                            data: linesData
                        }]
                    }

                    myChart.setOption(studentCheckInOption);
                    break;
                case 'studentCategory':
                    var category_name_arr=res.category_name_arr;
                    var category_man_arr=res.category_man_arr;
                    var category_woman_arr=res.category_woman_arr;

                    var studentCategoryOption = {
                        tooltip : {
                            trigger: 'axis',
                            axisPointer : {
                                type : 'shadow'
                            }
                        },
                        legend: {
                            x: 'right',
                            y:'top',
                            textStyle: {color: '#ffffff'},
                            data:['男生','女生']
                        },
                        toolbox: {
                            show : false,
                            feature : {
                                dataView : {show: true, readOnly: false},
                                magicType : {show: true, type: ['line', 'bar']},
                                restore : {show: true},
                                saveAsImage : {show: true}
                            }
                        },
                        calculable : true,
                        xAxis : [
                            {
                                type : 'category',
                                axisLabel: {
                                    color:'#84909E'
                                },
                                axisLine: {onZero: true,lineStyle:{color:'#84909E'}},
                                axisTick: {show: false},
                                data : category_name_arr
                            }
                        ],
                        yAxis : [
                            {
                                type : 'value',
                                axisLabel: {
                                    color:'#84909E'
                                },
                                splitLine:{show: true,lineStyle:{color:'#2B3950'}},
                                axisLine: {onZero: true,lineStyle:{color:'#0F2242'}},
                                axisTick: {show: false}
                            }
                        ],
                        series : [
                            {
                                name:'男生',
                                type:'bar',
                                stack: '性别',
                                data:category_man_arr
                            },
                            {
                                name:'女生',
                                type:'bar',
                                stack: '性别',
                                data:category_woman_arr
                            }
                        ],color:['#00A6ED','#DA6085']
                    };
                    myChart.setOption(studentCategoryOption);
                    break;
                case 'studentOccupancyRate':
                    var year_name_arr=res.year_name_arr;
                    var year_man_arr=res.year_man_arr;
                    var year_woman_arr=res.year_woman_arr;
                    var studentOccupancyRateOption={
                        tooltip: {
                            trigger: 'axis',
                            axisPointer: {
                                lineStyle: {
                                    color: '#57617B'
                                }
                            }
                        },
                        legend: {
                            x: 'right',
                            y:'top',
                            textStyle: {color: '#ffffff'},
                            data:['男生','女生']
                        },
                        grid: {
                            left: '1%',
                            right: '5%',
                            bottom: '6%',
                            top:'14%',
                            containLabel: true
                        },
                        xAxis: [{
                            type: 'category',
                            boundaryGap: false,
                            axisLine: {
                                lineStyle: {
                                    color: '#57617B'
                                }
                            },
                            data: year_name_arr,
                            axisLabel:{
                                interval:0,
                                rotate:50,
                                textStyle:{
                                    fontSize:12
                                }
                            },
                        }],
                        yAxis: [{
                            type: 'value',
                            axisTick: {
                                show: false
                            },
                            axisLine: {
                                lineStyle: {
                                    color: '#57617B'
                                }
                            },
                            axisLabel: {
                                textStyle: {
                                    fontSize: 12
                                }
                            },
                            splitLine: {
                                lineStyle: {
                                    color: '#57617B'
                                }
                            }
                        }],
                        series: [{
                            name: '男生',
                            type: 'line',
                            smooth: true,
                            lineStyle: {
                                normal: {
                                    width: 2
                                }
                            },
                            areaStyle: {
                                normal: {
                                    color: '#16567A',
                                    shadowColor: 'rgba(228, 139, 76, 0.1)',
                                    shadowBlur: 10
                                }
                            },
                            symbolSize:4,
                            itemStyle: {
                                normal: {
                                    color: '#5297FE',
                                    borderColor:'#e48b4c'
                                },
                            },
                            data: year_man_arr,
                        },{
                            name: '女生',
                            type: 'line',
                            smooth: true,
                            lineStyle: {
                                normal: {
                                    width: 2
                                }
                            },
                            areaStyle: {
                                normal: {
                                    color: '#16567A',
                                    shadowColor: 'rgba(228, 139, 76, 0.1)',
                                    shadowBlur: 10
                                }
                            },
                            symbolSize:4,
                            itemStyle: {
                                normal: {
                                    color: '#DA6085',
                                    borderColor:'#e48b4c'
                                },
                            },
                            data: year_woman_arr,
                        } ]
                    };
                    myChart.setOption(studentOccupancyRateOption);
                    break;
                case 'campusOccupancyComparison':
                    var cellphoneBrand  = [];
                    var cellphoneBrand1 = [];
                    var cellphoneBrand2 = [];
                    var cellphoneBrand3 = [];
                    var campus_msg=res.campus_msg;
                    $.each(campus_msg,function(i,o){
                        cellphoneBrand.push(o.site_name+'\n'+o.in_count);
                        cellphoneBrand1.push('空床\n'+o.empty_bed_count);
                        cellphoneBrand2.push('男\n'+o.man_in_count);
                        cellphoneBrand3.push('女\n'+o.woman_in_count);
                    });


                    var data_school = [];
                    for (var i = 0; i < campus_msg.length; ++i) {
                        data_school.push({
                            name: cellphoneBrand[i],
                            label: {
                                position: 'inside',
                                rotate: 'tangential',
                                fontSize:13
                            },
                            children: [{
                                name: cellphoneBrand1[i],
                                value: 1,
                                label: {
                                    position: 'inside',
                                    rotate: 'tangential',
                                    fontSize:13
                                }
                            }, {
                                name: cellphoneBrand2[i],
                                value: 1,
                                label: {
                                    position: 'intside',
                                    rotate: 'tangential',
                                    fontSize:13
                                }
                            }, {
                                name: cellphoneBrand3[i],
                                value: 1,
                                label: {
                                    position: 'intside',
                                    rotate: 'tangential',
                                    fontSize:13
                                }
                            }]
                        });
                    }


                    var campusOccupancyComparisonOption = {
                        backgroundColor:'#0c2133',
                        tooltip: {
                            show: false
                        },
                        series: [{
                            type: 'sunburst',
                            nodeClick: false,
                            levels: [{}, {
                                r0: '10%',
                                r: '58%',
                                label: {},
                                itemStyle: {
                                    borderWidth: 1,
                                    borderColor: '#42ced1',
                                    opacity: 0.6
                                }
                            }, {
                                r0: '58%',
                                r: '95%',
                                label: {},
                                itemStyle: {
                                    borderWidth: 1,
                                    borderColor: '#42b0d1',
                                    opacity: 0.3
                                }
                            }],
                            data: data_school,

                        }],color:['#0E2340','#01AAED','#24BED5','#009688','#2F4056']
                    };

                    myChart.setOption(campusOccupancyComparisonOption);
                    break;
            }





            /*var point='';
            $.each(res.groups,function(m,n){
                point='<span default-group="'+n.group_id+'" default-name="'+n.site_name+n.group_name+'" class="point_img" style="z-index: '+(m+2)+';margin-left: '+margins_left[Math.floor(Math.random()*margins_left.length)]+'px;margin-top: '+margins_top[Math.floor(Math.random()*margins_top.length)]+'px"></span>';
                $('.statistics_top_context').append(point);
            });
            $('#tower_sum').text(res.base_msg.tower_sum);
            $('#student_sum').text(res.base_msg.student_sum);
            $('#room_sum').text(res.base_msg.room_sum);
            $('#bed_sum').text(res.base_msg.bed_sum);
            $('#empty_bed_sum').text(res.base_msg.empty_bed_sum);


            */









        }
    });

    //住宿分布热点图
    /*var point='';
    for(var i=0;i<10;i++){
        point='<span class="point_img" style="z-index: '+(i+2)+';margin-left: '+margins_left[Math.floor(Math.random()*margins_left.length)]+'px;margin-top: '+margins_top[Math.floor(Math.random()*margins_top.length)]+'px"></span>';
        $('.statistics_top_context').append(point);
    }*/
    /*$(document).click(function(e){
        if ($(e.target).hasClass('point_img')){
            $(e.target).addClass('point_check').siblings('.point_img').removeClass('point_check');
            $('.point_content').show().attr('style','margin-top:'+((height-320)/2-height)+'px;margin-left:'+((width-580)/2)+'px');
            $('#group_name').text($(e.target).attr('default-name'));
            $('#student_count').text();
            $('#room_count').text();
            $('#bed_count').text();
            $('#empty_room_count').text();
            $('#empty_bed_count').text();
            $.ajax({
                type:'post',
                url:'dormitory/xionggy/getGroupCheckInMsg',
                data:{'group_id':$(e.target).attr('default-group')},
                success:function(res){
                    $('#student_count').text(res.student_count);
                    $('#room_count').text(res.room_count);
                    $('#bed_count').text(res.bed_count);
                    $('#empty_room_count').text(res.empty_room_count);
                    $('#empty_bed_count').text(res.empty_bed_count);
                }
            });
        }else if($(e.target).hasClass('statistics_top_context')){
            $(".point_content").hide();
            $('.point_img').removeClass('point_check');
        }
    });
    $(".point_content").click(function(event){
        event.stopPropagation();
    });*/




    /*var check_data_arr=[],
        check_name_arr=[];
    var category_name_arr=[],
        category_man_arr=[],
        category_woman_arr=[];
    var year_name_arr=[],
        year_man_arr=[],
        year_woman_arr=[];
    $.ajax({
        type:'post',
        url:'dormitory/xionggy/queryChartMsg',
        data:{
            'graduate_status':1
        },
        success:function(res){
            check_data_arr=res.check_data_arr;
            check_name_arr=res.check_name_arr;

            category_name_arr=res.category_name_arr;
            category_man_arr=res.category_man_arr;
            category_woman_arr=res.category_woman_arr;

            year_name_arr=res.year_name_arr;
            year_man_arr=res.year_man_arr;
            year_woman_arr=res.year_woman_arr;











            var man_scale=(student_sum_man/student_sum*100).toFixed(2);
            var woman_scale=(student_sum_woman/student_sum*100).toFixed(2);

            var placeHolderStyle = {
                normal: {
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: false
                    },
                    color: "rgba(0,0,0,0)",
                    borderWidth: 0
                },
                emphasis: {
                    color: "rgba(0,0,0,0)",
                    borderWidth: 0
                }
            };
            var dataStyle = {
                normal: {
                    formatter: '{c}%',
                    position: 'center',
                    show: true,
                    textStyle: {
                        fontSize: '18',
                        fontWeight: 'normal',
                        color: '#fff'
                    }
                }
            };
            var studentSexRatioOption = {
                title: [{
                    text: '入住学生男生',
                    left: '27%',
                    top: '52%',
                    textAlign: 'center',
                    textStyle: {
                        fontWeight: 'normal',
                        fontSize: '14',
                        color: '#fff',
                        textAlign: 'center',
                    },
                }, {
                    text: '入住学生女生',
                    left: '70%',
                    top: '70%',
                    textAlign: 'center',
                    textStyle: {
                        color: '#fff',
                        fontWeight: 'normal',
                        fontSize: '14',
                        textAlign: 'center',
                    },
                }],
                series: [{
                    type: 'pie',
                    hoverAnimation: false, //鼠标经过的特效
                    radius: ['25%', '31%'],
                    center: ['27%', '32%'],
                    startAngle: 225,
                    labelLine: {
                        normal: {
                            show: false
                        }
                    },
                    label: {
                        normal: {
                            position: 'center'
                        }
                    },
                    data: [{
                        value: man_scale,
                        itemStyle: {
                            normal: {
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                    offset: 0,
                                    color: '#99da69'
                                }, {
                                    offset: 1,
                                    color: '#01babc'
                                }]),
                            }
                        },
                        label: dataStyle,
                    }, {
                        value: 100,
                        itemStyle: placeHolderStyle,
                    },

                    ]
                },
                    {
                        type: 'pie',
                        hoverAnimation: false,
                        radius: ['25%', '31%'],
                        center: ['70%', '50%'],
                        startAngle: 225,
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        label: {
                            normal: {
                                position: 'center'
                            }
                        },
                        data: [{
                            value: woman_scale,
                            itemStyle: {
                                normal: {
                                    color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                        offset: 0,
                                        color: '#9f3edd'
                                    }, {
                                        offset: 1,
                                        color: '#4897f6'
                                    }]),
                                }
                            },
                            label: dataStyle,
                        }, {
                            value: 100,
                            itemStyle: placeHolderStyle,
                        },

                        ]
                    },

                    //外圈的边框
                    {
                        // name: '总人数',
                        type: 'pie',
                        hoverAnimation: false, //鼠标经过的特效
                        radius: ['31%', '32%'],
                        center: ['27%', '32%'],
                        startAngle: 225,
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        label: {
                            normal: {
                                position: 'center'
                            }
                        },
                        data: [{
                            value: 100,
                            itemStyle: {
                                normal: {
                                    color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                        offset: 0,
                                        color: '#01babc'
                                    }, {
                                        offset: 1,
                                        color: '#99da69'
                                    }]),
                                }
                            },
                        }, {
                            value: 33,
                            itemStyle: placeHolderStyle,
                        },

                        ]
                    },
                    {
                        type: 'pie',
                        hoverAnimation: false,
                        radius: ['31%', '32%'],
                        center: ['70%', '50%'],
                        startAngle: 225,
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        label: {
                            normal: {
                                position: 'center'
                            }
                        },
                        data: [{
                            value: 100,
                            itemStyle: {
                                normal: {
                                    color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                        offset: 0,
                                        color: '#4897f6'
                                    }, {
                                        offset: 1,
                                        color: '#9f3edd'
                                    }]),
                                }
                            },
                        }, {
                            value: 33,
                            itemStyle: placeHolderStyle,
                        },

                        ]
                    },
                ]
            };
            studentSexRatioChart.setOption(studentSexRatioOption);

        }
    });










    var studentOccupancyOption = {
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '50%'],
                data:[
                    {value:335, name:''},
                    {value:310, name:''},
                    {value:234, name:''},
                    {value:135, name:''},
                    {value:1548, name:''}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    studentOccupancyChart.setOption(studentOccupancyOption);












    $(window).resize(function(){
        roomTypeAnalysisChart.resize();
        bedRestChart.resize();
        studentOccupancyChart.resize();
        studentOccupancyRateChart.resize();
        studentCategoryChart.resize();
        studentCheckInChart.resize();
        studentSexRatioChart.resize();
        campusOccupancyComparisonChart.resize();
    });*/
}


$(function(){
    var myChart1 = echarts.init(document.getElementById('myChart1'));
    var myChart2 = echarts.init(document.getElementById('myChart2'));

    var xAxisData = [];
    var data1 = [];
    var data2 = [];
    var data3 = [];
    var data4 = [];

    for (var i = 1; i < 13; i++) {
        xAxisData.push(i+'月');
        data1.push((Math.random() * 2).toFixed(0));
        data2.push((Math.random()*3).toFixed(0));
        data3.push((-Math.random() * 4).toFixed(0));
        data4.push((-Math.random() *3).toFixed(0));
    }

    var itemStyle = {
        normal: {
        },
        emphasis: {
            barBorderWidth: 1,
            shadowBlur: 10,
            shadowOffsetX: 0,
            shadowOffsetY: 0,
            shadowColor: 'rgba(0,0,0,0.5)'
        }
    };

    var option1 = {
        legend: {
            data: ['采购入库',  '校区材料出库','校区材料入库', '部门材料出库'],
            align: 'left',
            left: 10,
            textStyle:{color:'#ffffff'}
        },
        tooltip: {},
        xAxis: {
            data: xAxisData,
            name: '时间',
            silent: false,
            axisLine: {onZero: true,lineStyle:{color:'#eeeeee'}},
            splitLine: {show: false},
            axisLabel: {
                color:'#eeeeee'
            },
            splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域
        },
        yAxis: {
            inverse: true,
            axisLine: {onZero: true,lineStyle:{color:'#eeeeee'}},
            axisLabel: {
                color:'#eeeeee'
            },
            splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域
        },
        grid: {
            left: '80',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        visualMap: {
            type: 'continuous',
            dimension: 1,
            text: ['入库', '出库'],
            inverse: true,
            itemHeight: 100,
            calculable: true,
            textStyle:{color:'#ffffff'},
            min: -2,
            max: 6,
            top: 60,
            left: 10,
            inRange: {
                colorLightness: [0.4, 0.8]
            },
            outOfRange: {
                color: '#bbb'
            },
            controller: {
                inRange: {
                    color: '#2f4554'
                }
            }
        },
        series: [
            {
                name: '采购入库',
                type: 'bar',
                stack: 'one',
                itemStyle: itemStyle,
                data: data1
            },
            {
                name: '校区材料入库',
                type: 'bar',
                stack: 'one',
                itemStyle: itemStyle,
                data: data2
            },
            {
                name: '校区材料出库',
                type: 'bar',
                stack: 'two',
                itemStyle: itemStyle,
                data: data3
            },
            {
                name: '部门材料出库',
                type: 'bar',
                stack: 'two',
                itemStyle: itemStyle,
                data: data4
            }
        ],
    };

    myChart1.on('brushSelected', renderBrushed);

    function renderBrushed(params) {
        var brushed = [];
        var brushComponent = params.batch[0];

        for (var sIdx = 0; sIdx < brushComponent.selected.length; sIdx++) {
            var rawIndices = brushComponent.selected[sIdx].dataIndex;
            brushed.push('[Series ' + sIdx + '] ' + rawIndices.join(', '));
        }

        myChart1.setOption({
            title: {
                backgroundColor: '#333',
                text: 'SELECTED DATA INDICES: \n' + brushed.join('\n'),
                bottom: 0,
                right: 0,
                width: 100,
                textStyle: {
                    fontSize: 12,
                    color: '#fff'
                }
            }
        });
    }









    myChart1.setOption(option1);




    var option2 = {
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        legend: {
            data:['锤子','钉子','起子','插座','网线','螺丝','电池','杂品','其他'],
            textStyle:{color:'#ffffff'},
            align: 'left',
            left: 10

        },
        grid: {
            left: '2%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis : [
            {
                type : 'category',
                data :['库存材料','在途材料','备品配件','建筑材料','工具仪表','劳动保护用品','其他'],
                axisLabel: {
                    color:'#eeeeee'
                },
                axisLine: {onZero: true,lineStyle:{color:'#eeeeee'}},
                splitLine:{show: false},//去除网格线
                splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域
            }
        ],
        yAxis : [
            {
                type : 'value',
                axisLine: {onZero: true,lineStyle:{color:'#eeeeee'}},
                axisLabel: {
                    color:'#eeeeee'
                },
                splitLine:{show: false},//去除网格线
                splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域
            }
        ],
        series : [
            {
                name:'锤子',
                type:'bar',
                data:[320, 332, 301, 334, 390, 330, 320]
            },
            {
                name:'钉子',
                type:'bar',
                stack: '广告',
                data:[120, 132, 101, 134, 90, 230, 210]
            },
            {
                name:'起子',
                type:'bar',
                stack: '广告',
                data:[220, 182, 191, 234, 290, 330, 310]
            },
            {
                name:'插座',
                type:'bar',
                stack: '广告',
                data:[150, 232, 201, 154, 190, 330, 410]
            },
            {
                name:'网线',
                type:'bar',
                data:[862, 1018, 964, 1026, 1679, 1600, 1570],
                markLine : {
                    lineStyle: {
                        normal: {
                            type: 'dashed'
                        }
                    },
                    data : [
                        [{type : 'min'}, {type : 'max'}]
                    ]
                }
            },
            {
                name:'螺丝',
                type:'bar',
                barWidth : 5,
                stack: '网线',
                data:[620, 732, 701, 734, 1090, 1130, 1120]
            },
            {
                name:'电池',
                type:'bar',
                stack: '网线',
                data:[120, 132, 101, 134, 290, 230, 220]
            },
            {
                name:'其他',
                type:'bar',
                stack: '网线',
                data:[60, 72, 71, 74, 190, 130, 110]
            },
            {
                name:'杂品',
                type:'bar',
                stack: '网线',
                data:[62, 82, 91, 84, 109, 110, 120]
            }
        ]
    };












    myChart2.setOption(option2);

















});
$(function(){
    var myChart1 = echarts.init(document.getElementById('myChart1'));
//    var myChart2 = echarts.init(document.getElementById('myChart2'));
    var myChart3 = echarts.init(document.getElementById('myChart3'));
    var myChart4 = echarts.init(document.getElementById('myChart4'));
    var myChart5 = echarts.init(document.getElementById('myChart5'));
    var myChart6 = echarts.init(document.getElementById('myChart6'));


    var option1 = {
        title: {
            text: '入驻平台用户所占比例',
            left: 'center',
            top: 20,
            textStyle: {

            }
        },
        tooltip : {
            trigger: 'item',
            formatter: "{b} <br/>用户 : {c} ({d}%)"
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:data,
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ],
        color:['#2ec7c9','#b6a2de','#5ab1ef','#ffb980','#d87a80',
            '#8d98b3','#e5cf0d','#97b552','#95706d','#dc69aa',
            '#07a2a4','#9a7fd1','#588dd5','#f5994e','#c05050',
            '#59678c','#c9ab00','#7eb00a','#6f5553','#c14089']
    };





    var option2 = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        series: [
            {
                name:'访问来源',
                type:'pie',
                radius: ['70%', '95%'],
                avoidLabelOverlap: true,
                itemStyle: {
                    normal: {
                        borderWidth: 10,
                        borderColor: '#182948',
                    }
                },
                label: {
                    normal: {
                        show: true,
                        position: 'center',

                    },
                    emphasis: {
                        show: true,
                        textStyle: {
                            fontSize: '30',
                            fontWeight: 'bold'
                        }
                    }
                },
                labelLine: {
                    normal: {
                        show: true
                    }
                },
                data:data
            }
        ],
        color:['#1b4f81']
    };



    var option3 = {
        title : {
            text: '活跃平台',
            textStyle: {

            }
        },
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['角色','用户'],
            textStyle:{}

        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                data : name_arr,
                axisLabel: {
                    color:'#2f8093'
                },
                axisLine: {lineStyle:{color:'#eeeeee'}},
                splitLine:{show: false},//去除网格线
                splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域

            }
        ],
        yAxis : [
            {
                type : 'value',
                axisLine: {lineStyle:{color:'#eeeeee'}},
                axisLabel: {
                    color:'#2f8093'
                },
                splitLine:{show: false},//去除网格线
                splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域

            }
        ],
        series : [
            {
                name:'角色',
                type:'bar',
                data:role_arr,
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                }
            },
            {
                name:'用户',
                type:'bar',
                data:user_arr,
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                }
            }
        ],
        color:['#4662c3','#e49b70']

    };



    var option4 = {
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['角色','用户'],
            textStyle:{}

        },
        xAxis:  {
            type: 'category',
            boundaryGap: false,
            data: name_arr,
            axisLabel: {
                color:'#2f8093'
            },
            axisLine: {onZero: true,lineStyle:{color:'#eeeeee'}},
            splitLine:{
                show: true,
                lineStyle:{
                    color: ['#217ea9'],
                    width: 1,
                    type: 'solid'
                }
            },//去除网格线
            splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                color:'#2f8093'
            },
            axisLine: {onZero: true,lineStyle:{color:'#eeeeee'}},
            splitLine:{show: true,
                lineStyle:{
                    color: ['#217ea9'],
                    width: 1,
                    type: 'solid'
                }},//去除网格线
            splitArea : {show : true,areaStyle:{color:'#0d446a'}}//保留网格区域
        },
        series: [
            {
                name:'角色',
                type:'line',
                data:role_arr,
                markPoint: {
                    data: [
                        {type: 'max', name: '最大值'},
                        {type: 'min', name: '最小值'}
                    ]
                }
            },
            {
                name:'用户',
                type:'line',
                data:user_arr,
                markPoint: {
                    data: [
                        {type: 'max', name: '最大值'},
                        {type: 'min', name: '最小值'}
                    ]
                }
            }
        ],
        color:['#ffdb75','#00e7fa']
    };

    var option5 = {
        tooltip: {
            trigger: 'item',
            formatter: function(params){
                return params.data.name+'<br>角色：'+params.data.role_count+'，用户：'+params.data.value
            }
        },
        legend: {
            data: all_name_arr,
            textStyle:{}
        },
        calculable: true,
        series: [
            {
                name:'平台信息',
                type:'funnel',
                left: '5%',
                top: 80,
                bottom: 10,
                width: '90%',
                min: 0,
                max: max_count,
                minSize: '0%',
                maxSize: '100%',
                sort: 'descending',
                gap: 2,
                label: {
                    normal: {
                        show: true,
                        position: 'inside'
                    },
                    emphasis: {
                        textStyle: {
                            fontSize: 20
                        }
                    }
                },
                labelLine: {
                    normal: {
                        length: 10,
                        lineStyle: {
                            width: 1,
                            type: 'solid'
                        }
                    }
                },
                itemStyle: {
                    normal: {

                        borderWidth: 1
                    }
                },
                data: data10
            }
        ],
        color:['#d87c7c','#919e8b', '#d7ab82',  '#6e7074','#61a0a8','#efa18d', '#787464', '#cc7e63', '#724e58', '#4b565b']
    };





//    myChart2.setOption(option2);
    myChart1.setOption(option1);
    myChart3.setOption(option3);
    myChart4.setOption(option4);
    myChart5.setOption(option5);

   var option6 = {
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        legend: {
            data: ['角色', '用户','主功能模块','子功能模块'],
            textStyle:{}
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis:  {
            type: 'value',
            axisLabel: {

            },
            axisLine: {lineStyle:{}},
            splitLine:{show: false},//去除网格线
        },
        yAxis: {
            type: 'category',
            axisLine: {lineStyle:{}},
            data: all_name_arr,
            axisLabel: {

            },
            splitLine:{show: false},//去除网格线
        },
        series: [
            {
                name: '角色',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight',
                        formatter:function(params){
                            return params.data!=0?params.data:'';
                        }
                    }
                },
                data: all_role_arr
            },
            {
                name: '用户',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight',
                        formatter:function(params){
                            return params.data!=0?params.data:'';
                        }
                    }
                },
                data: all_user_arr
            },
            {
                name: '主功能模块',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight',
                        formatter:function(params){
                            return params.data!=0?params.data:'';
                        }
                    }
                },
                data: all_pm_arr
            },
            {
                name: '子功能模块',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight',
                        formatter:function(params){
                            return params.data!=0?params.data:'';
                        }
                    }
                },
                data: all_cm_arr
            }
        ],
       color:['#FFB800','#01AAED','#FF5722','#009688','#2F4056']
    };

    myChart6.setOption(option6);


    $('.versions2').hide();
    $('.versions3').hide();















});






























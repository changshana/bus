var approvalTask=[
    {'name':'增岗审批','type':'personnel_post_apply','icon':'task1.png'},
    {'name':'增编审批','type':'personnel_post_establishment','icon':'task2.png'},
    {'name':'调岗审核','type':'personnel_post_adjust_apply','icon':'task3.png'},
    {'name':'合同审批','type':'personnel_contract','icon':'task4.png'},
    {'name':'变岗审批','type':'personnel_post_change','icon':'task5.png'},
    {'name':'离退审批','type':'personnel_retire_management','icon':'task6.png'},
    {'name':'请假审批','type':'personnel_leave','icon':'task7.png'},
    {'name':'参保审批','type':'personnel_social_security_enter1','icon':'task8.png'},
    {'name':'停保审批','type':'personnel_social_security_enter2','icon':'task9.png'},
    {'name':'工伤审批','type':'personnel_work_injury_record','icon':'task10.png'},
    {'name':'考核审批','type':'personnel_annual_assessment','icon':'task11.png'},
    {'name':'标兵审批','type':'personnel_pacesetter','icon':'task12.png'},
    {'name':'工资审批','type':'personnel_salary_able','icon':'task13.png'}
];

var generalType=[
    {'name':'该月新增员工','type':'personnel_employees_record_daily','icon':'line_3.png'},
    {'name':'该月减离员工','type':'personnel_retire_management_daily','icon':'line_5.png'},
    {'name':'该月请假人数','type':'personnel_leave_daily','icon':'line_1.png'},
    {'name':'该月工伤备案','type':'personnel_work_injury_record_daily','icon':'line_4.png'},
    {'name':'该月申请参保','type':'personnel_social_security_daily','icon':'line_2.png'},
    {'name':'该月新签合同','type':'personnel_contract_daily','icon':'line_6.png'}
];



function fnGetMsg(flag,time){
    $.ajax({
        type:'post',
        url:'personnel/getConsoleMsg',
        data:{flag:flag,'time':isNotEmpty(time)?time:''},
        success:function(res){
            console.log(res);
            if(isNotEmpty(res.policyMsg)){
                $.each(res.policyMsg,function(i,o){
                    $('.policy_list').append('<li><span class="policy_title">'+o.rule_title+'</span><span class="policy_time">'+o.create_day+'</span></li>');
                });
            }
            $.each(res.typeMsg,function(i,o){
                $('[default-type='+o.type+']').text(isNotEmpty(o.value)?o.value:0);
            });
        }
    });

}
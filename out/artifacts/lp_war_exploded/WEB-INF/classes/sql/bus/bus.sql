#sql("getBusAa02List")
select
a.aaa020
,a.aaa002
,getBusCode('aaa003',a.aaa003) aaa003
,a.aaa004
,a.aaa005
,a.aaa006
,a.aaa007
,a.aaa008
,a.aaa999
,a.aaa996
,a.aaa997
,a.aaa998
,c.aaa005 as busNo
,b.aaa001 as bindId
from bus_aa02 a
left join bus_ca02 b on a.aaa020=b.aaa020
left join bus_aa01 c on b.aaa001=c.aaa001 and c.aaa996=1
where a.aaa996=1
#if(sex)
and a.aaa003=#para(sex)
#end
#if(search_param)
and (a.aaa002 like concat('%',#para(search_param),'%')
    or a.aaa004 like concat('%',#para(search_param),'%')
    or a.aaa007 like concat('%',#para(search_param),'%')
    or c.aaa005 like concat('%',#para(search_param),'%')
    )
#end
order by aaa998 desc
#end

#sql("getBusAa99List")
select aa99.*,count(ba02.aba020) num from bus_aa99 aa99
left join bus_ba02 ba02 on aa99.aaa004=ba02.aaa995 and ba02.aaa996=1
where aa99.aaa002='aba060'
and aa99.aaa996=1
group by aa99.aaa001
#end

#sql("getBusBa02List")
select a.*,count(b.aba040) as seats
from bus_ba02 a left join bus_ba04 b on a.aba020=b.aba020
where a.aaa996=1
#if(aaa004)
and aaa995=#para(aaa004)
#end
#if(search_param)
and aba002 like concat('%',#para(search_param),'%')
#end
group by a.aba020
#end

#sql("updateBusType")
update bus_ba02 set aaa996=0 where aba020=#para(aba020)
#end

#sql("getBusAa01List")
select ba01.aaa001,
ba01.aaa002,
ba01.aaa003,
ba01.aaa004,
ba01.aaa005,
ba01.aaa006,
ba01.aaa007,
bb02.aaa999,
bb02.aba002,
bb02.aba020,
ba01.aba060,
(select aaa005 from bus_aa99 where aaa002='aaa995' and aaa004=ba01.aba060) as aba060_desc
from bus_aa01 ba01
left join bus_ba02 bb02 on bb02.aba020=ba01.aba020
where ba01.aaa996=1
#if(aba060)
and ba01.aba060=#para(aba060)
#end
#if(search_param)
and (ba01.aaa003 like concat('%',#para(search_param),'%') or ba01.aaa005 like concat('%',#para(search_param),'%'))
#end
group by ba01.aaa001 desc
#end

#sql("getBusBa07List")
  select * FROM `bus_ba07` as a
  where aaa996!=2
#if(search_param)
and (a.aba071 like concat('%',#para(search_param),'%') )
#end
order by aaa996 asc
#end

#sql("getBusInfoPersonExistence")
select a.aaa001
,a.aaa002
,a.aaa005
,(select aba002 from bus_ba02 where aba020=a.aba020) as busName
from bus_aa01 a
where a.aaa001 not in (select aaa001 from bus_ca02)
and a.aaa996=1
#if(search_param)
and (a.aaa002 like concat('%',#para(search_param),'%') or a.aaa004 like concat('%',#para(search_param),'%') or a.aaa007 like concat('%',#para(search_param),'%'))
#end
#end

#sql("getBusInfoPerson")
select a.aaa001
,a.aaa002
,a.aaa005
,(select aba002 from bus_ba02 where aba020=a.aba020) as busName
from bus_aa01 a
where a.aaa001=(
select aaa001 from bus_ca02 where aaa020=#para(aaa020)
)
and a.aaa996=1
#end

#sql("getBusBa03List")
select
    (select count(0) from bus_ba01 b where a.aba030=b.aba030) as count
    ,(select aaa005 from bus_aa99 where aaa004=a.aba020 and aaa002='aba060' and aaa003='车辆类型' ) as type
    ,(select aba071 from bus_ba07 d where a.aba007=d.aba070) as `start`
    ,(select aba071 from bus_ba07 d where a.aba008=d.aba070) as `end`
    ,a.*
    FROM `bus_ba03` a
    where 1=1
    #if(aba020)
        and a.aba020=#para(aba020)
    #end
    #if(aaa996)
        and a.aaa996=#para(aaa996)
    #end
    #if(bus_type=='student')
        and a.aca052=1
    #end
    #if(bus_type=='teacher')
        and a.aca053=1
    #end
    ORDER BY a.aba020
#end

#sql("getBusTicket")
select
  a.aca030
  ,c.aca043 as name
  ,a.aba041 as seat
  ,(select aba071 from bus_ba07 where aba070=e.aba007) as start
  ,(select aba071 from bus_ba07 where aba070=e.aba008) as end
  ,(select aaa005 from bus_aa01 where b.aaa001=aaa001) as busNo
  ,DATE_FORMAT(d.aba051,'%H:%i') as startTime
  ,DATE_FORMAT(d.aba052,'%H:%i') as endTime
  ,DATE_FORMAT(b.aca051,'%Y-%m-%d') as startDate
  ,a.aaa998 as buyTime
  ,a.aca032,a.aca033,a.aca034
  ,CONCAT(DATE_FORMAT(b.aca051,'%Y-%m-%d'),DATE_FORMAT(d.aba051,' %H:%i')) as timeStr
  ,IFNULL(e.aba031,'') as stop
  from bus_ca03 a,bus_ca05 b,bus_ca04 c,bus_ba05 d,bus_ba03 e
  where a.aca050=b.aca050
  and c.aca041=a.aca031
  and c.aca044=a.aca044
  and b.aba050=d.aba050
  and d.aba030=e.aba030
  and a.aaa996=1
  and a.aca035<>0
  #if(aca030)
   And a.aca030=#para(aca030)
  #end
order by aca030 DESC
#end

#sql("getBa03ForAddBa05")
select a.*,
(select aba071 from bus_ba07 d where a.aba007=d.aba070) as `start`,
(select aba071 from bus_ba07 d where a.aba008=d.aba070) as `end`  from bus_ba03 a
where a.aaa996=1
#if(ba020)
   and a.aba020=#para(ba020)
#end

#end
#sql("getBusBa05List")
select
 DATE_FORMAT(a.aba051,'%H:%i') as aba051,
 DATE_FORMAT(a.aba052,'%H:%i') as aba052,
 a.aaa996,
 a.aba050,
 b.aba020,
(select aba071 from bus_ba07 d where b.aba007=d.aba070) as `start`,
(select aba071 from bus_ba07 d where b.aba008=d.aba070) as `end` ,
(select aaa005 from bus_aa99 where aaa004=b.aba020 and aaa002='aba060' and aaa003='车辆类型' )  as  type,
(select aaa005 from bus_aa99 where aaa004=a.aba055 and aaa002='aba055' and aaa003='发车时间' )  as  dateType
FROM `bus_ba05` a left join bus_ba03 b on a.aba030=b.aba030
left join bus_ba02 c on c.aba020=b.aba020
where a.aaa996!=2
#if(type_id)
    and b.aba020=#para(type_id)
#end
#if(aba030Id)
    and a.aba030=#para(aba030Id)
#end
#if(dateType)
    and a.aba055=#para(dateType)
#end
#if(aaa996)
    and a.aaa996=#para(aaa996)
#end
  #if(begin&&end)
   and a.aba053 between #para(begin) and #para(end)
  #end
  #if(type)
 and a.aba055=#para(type)
  #end
  group by a.aba050
  ORDER BY c.aba020,b.aba030,a.aba055,aba051
#end


#sql("getBusInfoTimeExistence")
select a.* from bus_ba02 a
where a.aba020 not in(
select b.aba020 from bus_ba02 b
join bus_ca01 bc01 on b.aba020=bc01.aaa001
where bc01.aba050=#para(aba050))
and a.aaa996=1
and a.aaa995=#para(aba020)
#end

#sql("getBusInfoTime")
select a.* from bus_ba02 a
join bus_ba02 bb02 on bb02.aba020=a.aaa995
join bus_ca01 bc01 on a.aba020=bc01.aaa001
and a.aaa996=1
and bc01.aba050=#para(aba050)
#end

/*zhangy start*/

/*获取选座时间设置信息列表*/
#sql("getBusBa06List")
SELECT
	a.*,
	( SELECT x.aaa005 FROM bus_aa99 x WHERE x.aaa002 = 'aba063' AND x.aaa004 = a.aba063 ) aba063_desc,
	( SELECT x.aaa005 FROM bus_aa99 x WHERE x.aaa002 = 'aba063' AND x.aaa004 = a.aba065 ) aba065_desc,
	count( b.aba060 ) AS count
FROM
	`bus_ba06` a
	LEFT JOIN `bus_ba05` b ON a.aba060 = b.aba060
WHERE 1 = 1
  #if(status)
  AND a.aba996 = #para(status)
  #end
  #if(search_param)
  AND a.aba061 LIKE concat('%',#para(search_param),'%')
  #end
GROUP BY
	a.aba060
#end

/*获取车辆类型未设置预约时间信息列表*/
#sql("getBusTimeExist")
SELECT
	a.aba050,a.aba051,a.aba052,a.aba053,
	(select aaa005 from bus_aa99 where aaa004=a.aba055 and aaa002='aba055' and aaa003='发车时间') as aba055_desc,
	(SELECT x.aba071 FROM `bus_ba07` x WHERE x.aba070 = b.aba007) AS aba007_desc,
	(SELECT x.aba071 FROM `bus_ba07` x WHERE x.aba070 = b.aba008) AS aba008_desc
FROM
	`bus_ba05` a
	LEFT JOIN `bus_ba03` b ON a.aba030 = b.aba030
	LEFT JOIN `bus_ca01` c ON a.aba050 = c.aba050
	LEFT JOIN `bus_ba02` d ON c.aaa001= d.aba020
WHERE
	a.aaa996 = 1
	AND a.aba060 IS NULL
  AND d.aaa995 = 2
  AND d.aba003 = 45
  #if(type)
  AND a.aba055 = #para(type)
  #end
#end

/*获取车辆类型已设置预约时间信息列表*/
#sql("getBusTimeNotExist")
SELECT
	a.aba050,a.aba051,a.aba052,a.aba053,
	(select aaa005 from bus_aa99 where aaa004=a.aba055 and aaa002='aba055' and aaa003='发车时间') as aba055_desc,
	(SELECT x.aba071 FROM `bus_ba07` x WHERE x.aba070 = b.aba007) AS aba007_desc,
	(SELECT x.aba071 FROM `bus_ba07` x WHERE x.aba070 = b.aba008) AS aba008_desc
FROM
	`bus_ba05` a
	LEFT JOIN `bus_ba03` b ON a.aba030 = b.aba030
	LEFT JOIN `bus_ca01` c ON a.aba050 = c.aba050
	LEFT JOIN `bus_ba02` d ON c.aaa001= d.aba020
WHERE
	a.aaa996 = 1
	AND a.aba060 = #para(aba060)
  AND d.aaa995 = 2
  AND d.aba003 = 45
  #if(type)
  AND a.aba055 = #para(type)
  #end
#end

/*获取某班次车辆可预约时间段*/
#sql("getBusTime")
SELECT
	c.aba051,c.aba053,d.aba062,d.aba063,d.aba064,d.aba065
FROM
	`bus_aa01` a,
	`bus_ca01` b,
	`bus_ba05` c,
	`bus_ba06` d
WHERE
	a.aaa001 = #para(bus_id)
	AND c.aba060 = #para(time_id)
	AND a.aaa001 = b.aaa001
	AND b.aba050 = c.aba050
	AND c.aba060 = d.aba060
#end

/*zhangy end*/

























#sql("getBusCodeList")
select
  *
FROM bus_aa99
  where aaa002 =#para(code_type)
and aaa996=1
order by aaa004+0 asc
#end


/*liuxlh start*/

#sql("getBusBa04List")
  select
    a.aba020,
    a.aba002,
    a.aaa995,
    c.aaa005 as aaa995_desc,
    a.aaa996,
    a.aaa997,
    a.aaa998,
    a.aaa999,
    a.aba003,
    a.aba004,
    a.aba005,
    count(b.aba040) as seats
  from bus_ba02 a
  left join bus_ba04 b on a.aba020=b.aba020
  left join bus_aa99 c on a.aaa995 = c.aaa004
  where a.aaa996=1
  #if(aaa995)
  and a.aaa995=#para(aaa995)
  #end
  #if(search_param)
  and a.aba002 like concat('%',#para(search_param),'%')
  #end
  group by a.aba020
#end

#sql("deleteBusSeatPlan")
  delete from bus_ba04 where aba020=#para(aba020)
#end

#sql("findBusSeatsByAaa001")
select
  aba040,
  aba020,
  aba041,
  aba042,
  aba043,
  aba044,
  aba045,
  aaa996,
  aaa997,
  aaa998,
  aaa999
from bus_ba04
where aba020=#para(aba020)
#end
/*liuxlh end*/

/*caoyang start*/
#sql("getSeatInfoByAba020")
  select aba040,aba020,aba041,aba044,aba045,
  (select count(*) from bus_ca03 where aca050=#para(aca050) and aba041=bus_ba04.aba041 and aaa996=1 limit 1) as isLocked,
  (select aca030 from bus_ca03 where aca050=#para(aca050)  and aba041=bus_ba04.aba041 and aaa996=1 limit 1)as aca030,
  (select aca044 from bus_ca03 where aca050=#para(aca050)  and aba041=bus_ba04.aba041 and aaa996=1 limit 1)as aca044,
  (select aca031 from bus_ca03 where  aca050=#para(aca050) and aba041=bus_ba04.aba041 and aaa996=1 limit 1) as creator,
  (select aaa996 from bus_ca03 where  aca050=#para(aca050) and aba041=bus_ba04.aba041 and aaa996=1 limit 1) as aaa996
  from bus_ba04
  where aaa996=1
  #if(aba020)
  and aba020=#para(aba020)
  #end
#end

#sql("getBa05ListByDate")
select a.aba050,
a.aba056,
DATE_FORMAT(a.aba051,'%H:%i') as aba051,
DATE_FORMAT(a.aba052,'%H:%i') as aba052,
b.aba030,
(select aba071 from bus_ba07 where aba070=b.aba007) as aba007,
(select aba071 from bus_ba07 where aba070=b.aba008) as aba008,
c.aba020,
c.aba002,
c.aba003,
c.aba004,
c.aba005,
TIMESTAMPDIFF(SECOND,CONCAT(#para(now),' ',#para(time)),CONCAT(#para(date),' ',aba051)) as secDiff
from bus_ba05 a, bus_ba03 b,bus_ba02 c,bus_ca01 d
where a.aba030=b.aba030
and b.aba020=2
and d.aba050=a.aba050
and d.aba050=a.aba050
and d.aaa001=c.aba020
and c.aaa995=2
and c.aaa996=1
#if(aba055)
  and a.aba055=#para(aba055)
#end
#if(aba030)
  and a.aba030=#para(aba030)
#end
order by a.aba051 ASC
#end

#sql("getBa03List")
  select * from bus_ba03 where aaa996=1 and aba020=2 order by aaa995 asc
#end

#sql("getAa03List")
  select * from bus_aa03 a
  where 1=1
  #if(search_param)
    and  (a.aaa032 like  CONCAT('%',#para(search_param),'%') or a.aaa034 like  CONCAT('%',#para(search_param),'%'))
  #end
  #if(aaa033)
    and a.aaa033=#para(aaa033)
  #end
  order by aaa033 asc,aaa998 desc
#end

#sql("getBusba08DistinctList")
select result.* from (
select ba08.aba050,date_format(ba08.aaa998, '%Y-%m-%d')as aaa998,
sum(ba08.aba081) as total,IFNULL(ba08.aba082,0) as aba082,
(select aaa005 from bus_aa99 where aaa004=IFNULL(ba08.aba082,0) and aaa002='aba082') as aba082_dsc,
ba05.aba051,ba05.aba052,
(select aba071 from bus_ba07 where bus_ba07.aba070=ba03.aba007 and aaa996=1) as aba007,
(select aba071 from bus_ba07 where bus_ba07.aba070=ba03.aba008 and aaa996=1) as aba008
from bus_ba08 ba08,bus_ba05 ba05,bus_ba03 ba03
where ba08.aba050=ba05.aba050
and ba08.aaa996=1
and ba05.aaa996=1
and ba05.aba030=ba03.aba030
and ba03.aaa996=1
#if(aba082)
  and IFNULL(ba08.aba082,0)=#para(aba082)
#end
group by  ba08.aba050,date_format(ba08.aaa998, '%Y-%m-%d')
order by  ba08.aaa998 desc
) result
#end

#sql("getBusba08List")
select * from bus_ba08
where aba050=#para(aba050)
and date_format(aaa998, '%Y-%m-%d')=#para(aaa998)
#end

#sql("getBusBa09ListData")
  select a.*,b.aaa002 as aaa002
  ,(select aaa005 from bus_aa99 where aaa002='aba093' and aaa004=a.aba093) as aba093_desc
  from bus_ba09 a,bus_aa02 b
  where a.aaa020=b.aaa020
  #if(aba093)
    AND a.aba093=#para(aba093)
  #end
  #if(aba090)
    AND a.aba090=#para(aba090)
  #end
#end
/*caoyang end*/



/*xionggy start*/
#sql("busLineList")
  select a.*,
         (select aba071 from bus_ba07 where aba070=a.aba007) as aba007_desc,
         (select aba071 from bus_ba07 where aba070=a.aba008) as aba008_desc,
         (select count(1) from bus_ba01 where aba030=a.aba030) as point_count
   from bus_ba03 a
   where 1=1
  #if(aaa996)
    and a.aaa996=#para(aaa996)
  #end
  #if(aba020)
    and a.aba020=#para(aba020)
  #end
#end
#sql("getBusBa07")
  select * from bus_ba07
#end
#sql("lineTimeList")
  select * from bus_ba05
  #if(aaa996)
    and aaa996=#para(aaa996)
  #end
  #if(aba030)
    and aba030=#para(aba030)
  #end
#end
/*xionggy end*/


/* busAPI start */
  #sql("getMyTicketList")
    SELECT
        ca03.aca030 as ticketid,
        ca03.aba041 as seatnum,
        ca03.aca050 as scheduleid,
        ca03.aca031 as personId,
        DATE_FORMAT(ca03.aba032,'%Y-%m-%d') as startdate,
        DATE_FORMAT(ba05.aba051,'%H:%i')as startime,
        (SELECT aba071 from bus_ba07 ba07 where ba07.aba070=ba03.aba007) as `start`,
        (SELECT aba071 from bus_ba07 ba07 where ba07.aba070=ba03.aba008) as `end`,
        ca03.aaa998 as appointmentime,
        ca03.aca032 as evaluateStar,
        ca03.aca033 as evaluateType,
        ca03.aca034 as evaluateNote,
        ca04.aca043 as passenger,
        (select aaa005 from bus_aa01 where aaa001=ca05.aaa001) as busname,
		(select aaa002 from bus_aa02 where aaa020=ca05.aaa020) as driver,
        (select case
        when TIMESTAMPDIFF(MINUTE,#para(dateTime),CONCAT(DATE_FORMAT(ca03.aba032,'%Y-%m-%d '),aba051))>=0 then 1
        when TIMESTAMPDIFF(MINUTE,#para(dateTime),CONCAT(DATE_FORMAT(ca03.aba032,'%Y-%m-%d '),aba051))<0 and ca03.aca032 is not null then 2 else 3 end) as state
    from bus_ca03 ca03,bus_ca05 ca05,bus_ba05 ba05,bus_ba03 ba03,bus_ca04 ca04
		where ca05.aca050=ca03.aca050
		AND ca05.aba050=ba05.aba050
    AND ba03.aba030 =ba05.aba030
    AND ca04.aca041=ca03.aca031
    AND  ca03.aaa996 <> 0
    #if(aca031)
      and ca03.aca031=#para(aca031)
    #end
    #if(ticketid)
      and ca03.aca030=#para(ticketid)
    #end
    order by ticketid desc
  #end

  #sql("getBusAvailableList")
  select
     a.aca050 as scheduleid
     ,a.aca051 as date
     ,e.aca052 as stuAppoint
     ,e.aca053 as teaAppoint
     ,DATE_FORMAT(b.aba051,'%H:%i') as startime
     ,DATE_FORMAT(b.aba052,'%H:%i') as endtime
     ,(select aba071 from bus_ba07 where aba070=e.aba007) as startpoint
     ,(select aba071 from bus_ba07 where aba070=e.aba008) as endpoint
     ,d.aaa005 as busname
     ,c.aaa002 as driver
     ,a.aca051 as date
    from bus_ca05 a,bus_ba05 b,bus_aa02 c,bus_aa01 d,bus_ba03 e
    where a.aba050=b.aba050
    and a.aaa996=1
    and a.aaa020=c.aaa020
    and a.aaa001=d.aaa001
    and b.aba030=e.aba030
    and TIMESTAMPDIFF(MINUTE,#para(datime),CONCAT(#para(date),' ',b.aba051))>=0
    and TIMESTAMPDIFF(SECOND,a.aaa998,now())>=120
    #if(date)
    and a.aca051=#para(date)
    #end
    #if(bus_type=='student')
    and e.aca052=1
    #end
    #if(bus_type=='teacher')
    and e.aca053=1
    #end
    order by e.aba030 desc, startime asc, aca050 asc
  #end

  #sql("getTomorrowList")
    select
     a.aca050 as scheduleid
     ,a.aca052 as stuAppoint
     ,a.aca053 as teaAppoint
     ,DATE_FORMAT(b.aba051,'%H:%i') as startime
     ,DATE_FORMAT(b.aba052,'%H:%i') as endtime
     ,(select aba071 from bus_ba07 where aba070=e.aba007) as startpoint
     ,(select aba071 from bus_ba07 where aba070=e.aba008) as endpoint
     ,d.aaa005 as busname
     ,c.aaa002 as driver
     ,a.aca051 as date
    from bus_ca05 a,bus_ba05 b,bus_aa02 c,bus_aa01 d,bus_ba03 e
    where a.aba050=b.aba050
    and a.aaa020=c.aaa020
    and a.aaa001=d.aaa001
    and b.aba030=e.aba030
    and a.aaa996=1
    and TIMESTAMPDIFF(SECOND,a.aaa998,now())>=120
    #if(date)
    and a.aca051=#para(tomorrow)
    #end
    #if(bus_type=='student')
    and e.aca052=1
    #end
    #if(bus_type=='teacher')
    and e.aca053=1
    #end
    order by e.aba030 desc,startime asc,aca050 asc
  #end

  #sql("getDispatcherBusList")
  select
     a.aca050 as scheduleid
     ,a.aca051 as date
     ,DATE_FORMAT(b.aba051,'%H:%i') as startime
     ,DATE_FORMAT(b.aba052,'%H:%i') as endtime
     ,(select aba071 from bus_ba07 where aba070=e.aba007) as startpoint
     ,(select aba071 from bus_ba07 where aba070=e.aba008) as endpoint
     ,d.aaa005 as busname
     ,c.aaa002 as driver
    from bus_ca05 a,bus_ba05 b,bus_aa02 c,bus_aa01 d,bus_ba03 e
    where a.aba050=b.aba050
    and a.aaa020=c.aaa020
    and a.aaa001=d.aaa001
    and b.aba030=e.aba030
    and a.aaa996=1
    #if(date)
    and a.aca051>=#para(date)
    #end
    #if(type=='student')
    and e.aca052=1
    #end
    #if(type=='teacher')
    and e.aca053=1
    #end
    order by a.aca051 desc,startime desc,e.aba030 asc,aca050 asc
  #end
/* busAPI end */

#sql("getBa050ListByAba030")
  select a.aba050 as aba050,
  DATE_FORMAT(a.aba051,'%H:%i') as aba051,
  DATE_FORMAT(a.aba052,'%H:%i') as aba052
  from bus_ba05 a
  where aaa996=1
  #if(aba030)
  AND a.aba030=#para(aba030)
  #end
   #if(aba055)
  AND a.aba055=#para(aba055)
  #end
  order by aba051 asc
#end

#sql("getBusAa02SelectList")
  select a.aaa020 as id, concat(a.aaa002,'(',a.aaa007,')') as name ,b.aaa001 as busId
    from bus_aa02 a left join bus_ca02 b
    on a.aaa020=b.aaa020
    where a.aaa996=1
#end

#sql("getCa05ListByAba050")
  select
    a.aca050,
    a.aba050,
    a.aaa020,
    a.aaa001,
    b.aaa002 as driver,
    c.aaa005 as number,
    a.aca052,
    a.aca053,
    c.aaa007,
    DATE_FORMAT(d.aba051,'%H:%i') as start,
    IFNULL((select aba031 from bus_ba03 b,bus_ba05 c where c.aba030=b.aba030 and c.aba050=a.aba050),'') as stop
    from bus_ca05 a,bus_aa02 b,bus_aa01 c,bus_ba05 d
    where a.aba050=d.aba050
    and a.aaa020=b.aaa020
    and a.aaa001=c.aaa001
    and a.aaa996=1
    #if(aba050)
      and a.aba050=#para(aba050)
    #end
    #if(date)
      and a.aca051=#para(date)
    #end
#end

#sql("getBusInfoByAca050")
  select
     a.aca050
	,a.aca051
    ,a.aba050
    ,a.aca052 as mobile
    ,d.aaa002
    ,d.aaa005
    ,d.aba020
	,g.aaa002 as driver
	,g.aaa007 as driver_phone
    ,DATE_FORMAT(b.aba051,'%H:%i') as aba051
    ,DATE_FORMAT(b.aba052,'%H:%i') as aba052
    ,e.aba003,e.aba004 as col,e.aba005 as row,e.aaa995
    ,(select aba071 from bus_ba07 where aba070=f.aba007) as aba007
    ,(select aba071 from bus_ba07 where aba070=f.aba008) as aba008
    ,f.aba020 as busType
    ,f.aca052
	,f.aca053
	,IFNULL(b.aaa999,f.aba031) as stop
    from bus_ca05 a,bus_ba05 b,bus_aa01 d,bus_ba02 e,bus_ba03 f,bus_aa02 g
    where a.aba050=b.aba050
    and a.aaa001=d.aaa001
    and d.aba020=e.aba020
    and f.aba030=b.aba030
	and a.aaa020=g.aaa020
    #if(aca050)
    AND a.aca050=#para(aca050)
    #end
#end

#sql("checkCa03ByAca050")
  select * from bus_ca03 where aca050=#para(aca050)
#end

#sql("getCa05ListForDriver")
  select
     a.aca050
	,a.aca051
    ,a.aba050
    ,d.aaa002
    ,d.aaa005
    ,d.aba020
	,g.aaa002 as driver
	,DATE_FORMAT(a.aca051,'%Y-%m-%d') as date
    ,DATE_FORMAT(b.aba051,'%H:%i') as aba051
    ,DATE_FORMAT(b.aba052,'%H:%i') as aba052
    ,(select aba071 from bus_ba07 where aba070=f.aba007) as aba007
    ,(select aba071 from bus_ba07 where aba070=f.aba008) as aba008
    from bus_ca05 a,bus_ba05 b,bus_aa01 d,bus_ba03 f,bus_aa02 g
    where a.aba050=b.aba050
    and a.aaa001=d.aaa001
    and a.aaa996=1
    and f.aba030=b.aba030
		and a.aaa020=g.aaa020
		#if(aaa007)
		and g.aaa007=#para(aaa007)
		#end
		#if(date)
		and aca051>=#para(date)
		#end
		order by aca051 asc,aba051 asc
#end

#sql("getInfoByAca030")
select
  a.aca030
  ,a.aba041
  ,(select aaa005 from bus_aa99 where aaa002='aca035' and aaa004=a.aca035) as aca035
  ,a.aca044
  ,(select aaa005 from bus_aa99 where aaa002='aca044' and aaa004=a.aca044) as aca044_dsc
  ,b.aca043
  ,b.aca041
  from bus_ca03 a left join bus_ca04 b
	on a.aca031=b.aca041
	and a.aca044=b.aca044
	where 1=1
  #if(aca030)
  and a.aca030=#para(aca030)
  #end
#end

#sql("getCa05Statistic")
  select res.count,DATE_FORMAT(res.date,'%m-%d') as date from (
  SELECT @cdate:=ADDDATE(str_to_date(#para(start),'%Y-%m-%d'),INTERVAL @d:=@d+1 DAY) AS date
  ,(select count(*) as count from bus_ca05 where aca051= @cdate
    #if(aaa020!="0")
    and aaa020=#para(aaa020)
    #end
  ) as count
  FROM bus_ca05 ,(SELECT @d := -1) temp
  ) res
WHERE  date <=str_to_date(#para(end),'%Y-%m-%d')
ORDER BY @cdate asc
#end

#sql("getCa03Statistic")
  select count(*) as count,'本科生' as name,1 as aca044,IFNULL(round(count(*)*100/(select count(*) from bus_ca03 where aba032 between str_to_date(#para(start),'%Y-%m-%d') and str_to_date(#para(end),'%Y-%m-%d'))),0) as per  from bus_ca03 where
  aca044=1
  #if(start)
  and aba032 between str_to_date(#para(start),'%Y-%m-%d') and str_to_date(#para(end),'%Y-%m-%d')
  #end
  union all
  select count(*) as count,'研究生' as name,2 as aca044,IFNULL(round(count(*)*100/(select count(*) from bus_ca03 where aba032 between str_to_date(#para(start),'%Y-%m-%d') and str_to_date(#para(end),'%Y-%m-%d'))),0) as per from bus_ca03 where
  aca044=2
  #if(start)
  and aba032 between str_to_date(#para(start),'%Y-%m-%d') and str_to_date(#para(end),'%Y-%m-%d')
  #end
  union all
  select count(*) as count,'教职工' as name,3 as aca044,IFNULL(round(count(*)*100/(select count(*) from bus_ca03 where aba032 between str_to_date(#para(start),'%Y-%m-%d') and str_to_date(#para(end),'%Y-%m-%d'))),0) as per  from bus_ca03 where
  aca044=3
  #if(start)
  and aba032 between str_to_date(#para(start),'%Y-%m-%d') and str_to_date(#para(end),'%Y-%m-%d')
  #end
#end

#sql("getCa01List")
 select a.*,
  (select aaa005 from bus_aa99 where aaa002='aaa996' and a.aaa996=aaa004) as aaa996_desc
  from bus_ca01 a
  where 1=1
  #if(search_param)
    and (a.aca011 like concat('%',#para(search_param),'%') or a.aaa999 like concat('%',#para(search_param),'%'))
  #end
  #if(aca010)
  and a.aca010=#para(aca010)
  #end
  order by a.aca010 DESC
#end

#sql("getCa01ListForPhone")
 select a.aca010 as messageId
        ,a.aaa999 as messageTitle
        ,a.aca011 as content
        ,a.aca012 as publishTime
        ,a.aaa997 as publisher
        from bus_ca01 a
        where a.aaa996=1
      #if(search_param)
        and (a.aca011 like concat('%',#para(search_param),'%') or a.aaa999 like concat('%',#para(search_param),'%'))
      #end
      #if(aca010)
      and a.aca010=#para(aca010)
      #end
      #if(messageId)
      and a.aca010=#para(messageId)
      #end
      order by a.aca010 DESC
      limit 0,2
#end

#sql("getCa03EvaluateList")
select count(*) as count,'五星' as name,IFNULL(round(count(*)*100/(select count(*) from bus_ca03)),0) as per from bus_ca03
where aca032=5
#if(aca033)
 and aca033=#para(aca033)
#end
union all
select count(*) as count,'四星' as name,IFNULL(round(count(*)*100/(select count(*) from bus_ca03)),0) as per from bus_ca03
where aca032=4
#if(aca033)
 and aca033=#para(aca033)
#end
union all
select count(*) as count,'三星' as name,IFNULL(round(count(*)*100/(select count(*) from bus_ca03)),0) as per from bus_ca03
where aca032=3
#if(aca033)
 and aca033=#para(aca033)
#end
union all
select count(*) as count,'二星' as name,IFNULL(round(count(*)*100/(select count(*) from bus_ca03)),0) as per from bus_ca03
where aca032=2
#if(aca033)
 and aca033=#para(aca033)
#end
union all
select count(*) as count,'一星' as name ,IFNULL(round(count(*)*100/(select count(*) from bus_ca03)),0) as per from bus_ca03
where aca032=1
#if(aca033)
 and aca033=#para(aca033)
#end
#end

#sql("getAPICodeList")
 select aaa004 as id,aaa005 as name from bus_aa99 where aaa996=1 and aaa002=#para(type)
 order  by aaa004 asc
#end

#sql("getCa03ListForCancel")
  select * from bus_ca03 where aca050=#para(aca050)
#end

#sql("cancelBus")
  update bus_ca03 set
  aaa996=#para(aaa996),
  aca035=#para(aca035),
  aaa999=#para(aaa999),
  aaa997=#para(aaa997),
  aaa998=#para(aaa998)
  where aca050=#para(aca050)
#end

#sql("updateBusCa05")
  update bus_ca05 set
  aaa996=#para(aaa996),
  aaa997=#para(aaa997),
  aaa998=#para(aaa998),
  aaa999=#para(aaa999)
  where aca050=#para(aca050)
#end

#sql("getMinutesDiff")
  select TIMESTAMPDIFF(MINUTE,#para(dateTimeStr),CONCAT(a.aca051,' ',b.aba051))-0 as diff
  from bus_ca05 a,bus_ba05 b
  where a.aba050=b.aba050
  #if(aca050)
  and aca050=#para(aca050)
  #end
#end

#sql("getRoutList")
    select
      a.aba030 as routId,
      (select aba071 from bus_ba07 where aba070=a.aba007) as start,
      (select aba071 from bus_ba07 where aba070=a.aba008) as end
      from bus_ba03 a
        where 1=1
        #if(type=='student')
            and a.aca052=1
        #end
        #if(type=='teacher')
            and a.aca053=1
        #end
    order by aaa995 asc,routId desc
#end

#sql("getTimeList")
  select
  a.aba050 as timeId,
  DATE_FORMAT(a.aba051,'%H:%i') as startTime
  from bus_ba05 a
  where a.aaa996=1
  and a.aba030=#para(routId)
  and aba055=#para(aba055)
  and TIMESTAMPDIFF(MINUTE,#para(now),str_to_date(CONCAT(#para(dateStr),a.aba051),'%Y-%m-%d %H:%i:%S'))>-10
  order by a.aba051 asc
#end

#sql("getDriverList")
select
  a.aaa020 as driverId
  ,a.aaa002 as driverName
  ,a.aaa007 as phone
  from bus_aa02 a,bus_ca02 b
  where a.aaa020=b.aaa020
#end

#sql("getAa04list")
  select
  a.*
  ,(select aaa005 from bus_aa99 where aaa996=1 and aaa004=a.aaa996 and aaa002='aaa996') as aaa996_dsc
  from bus_aa04 a
  where 1=1
  #if(search_param)
    and (a.aaa041 like CONCAT('%',#para(search_param),'%')
    or a.aaa042 like CONCAT('%',#para(search_param),'%')
    or a.aaa043 like CONCAT('%',#para(search_param),'%')
    )
  #end
#end

#sql("checkCa02BindInfo")
  select a.aca001,a.aaa020,a.aaa001
  from bus_ca02 a,bus_aa01 b
  where a.aaa001=b.aaa001
  and b.aaa996=1
  and a.aaa020=#para(aaa020)
#end

#sql("getInfoByAba050")
  select
  DATE_FORMAT(a.aba051,'%H:%i') as startTime,
  (select aba071 from bus_ba07 where aba070=b.aba007) as startPoint,
  (select aba071 from bus_ba07 where aba070=b.aba008) as endPoint
  from bus_ba05 a,bus_ba03 b
  where a.aba030=b.aba030
  and a.aaa996=1
  and b.aaa996=1
  and a.aba050=#para(aba050)
#end

#sql("getCa06List")
 SELECT * FROM bus_ca06 WHERE 1=1
 #if(begin)
 and aca061>=#para(begin)
 #end
 #if(end)
 and aca061<=#para(end)
 #end
 ORDER BY ACA061 DESC
#end

#sql("getCa04List")
 select
  ca04.*
  ,(select aaa005 from bus_aa99 where aaa996=1 and aaa002='aca044' and aaa004=ca04.aca044 ) as aca044_desc
  ,(select aaa005 from bus_aa99 where aaa996=1 and aaa002='aaa996' and aaa004=ca04.aaa996 ) as aca996_desc
   from bus_ca04 ca04
  where 1=1
  #if(search_param)
    and (ca04.aca043 like CONCAT('%',#para(search_param),'%') or ca04.aca041 like CONCAT('%',#para(search_param),'%') )
  #end
  #if(aaa996)
   and ca04.aaa996=#para(aaa996)
  #end
  #if(aca044)
    and ca04.aca044=#para(aca044)
  #end
  #if(aca049)
    #if(max_count>0)
        #if(aca049=='yes')
        and ca04.aca049>=#para(max_count)
        #end
        #if(aca049=='no')
        and ca04.aca049<#para(max_count)
        #end
    #end
  #end
#end
#sql("getCa07List")
  select
  a.aca070
  ,a.aca071
  ,a.aaa997
  ,a.aaa998
  ,a.aaa999
  ,(select aaa005 from bus_aa99 where aaa996=1 and aaa002='aba055' and aaa004=a.aba055) as aba055
  ,(select aaa005 from bus_aa99 where aaa996=1 and aaa002='aaa996' and aaa004=a.aaa996) as aaa996
  from bus_ca07 a
  where 1=1
  order by a.aca071 desc
#end

#sql("getBusCa08List")
  select
  a.aca080
  ,a.aca081
  ,a.aca082
  ,a.aca083
  ,a.aca084
  ,a.aaa997
  ,a.aaa998
  ,a.aaa999
  ,(select aaa005 from bus_aa99 where aaa996=1 and aaa002='aaa996' and aaa004=a.aaa996) as aaa996
  ,(select aaa005 from bus_aa99 where aaa996=1 and aaa002='aca044' and aaa004=a.aca044) as aca044_desc
  from bus_ca08 a
  where 1=1
  #if(search_param)
  and (a.aca081 like CONCAT('%',#para(search_param),'%') or a.aca082 like CONCAT('%',#para(search_param),'%')
      or a.aca083 like CONCAT('%',#para(search_param),'%') or a.aca084 like CONCAT('%',#para(search_param),'%')
      )
  #end
  #if(aaa996)
  and a.aaa996=#para(aaa996)
  #end
  #if(aca081)
  and a.aca081=#para(aca081)
  #end
  #if(aca084)
  and a.aca084=#para(aca084)
  #end
  #if(aca044)
  and a.aca044=#para(aca044)
  #end
  order by aca044 asc,a.aca080 desc
#end

#sql("getSeatStatisticList")
    SELECT
    a.aca030 as aca030
    ,a.aca031 as gh
    ,b.aca051 as date
    ,DATE_FORMAT(c.aba051,'%H:%i') as time
    ,(SELECT CONCAT(aaa005,'（',aaa007,'座）') FROM bus_aa01 WHERE aaa001=b.aaa001) as bus_no
    ,(SELECT CONCAT(aaa002,'(',aaa007,')') FROM bus_aa02 WHERE aaa020=b.aaa020) as driver
    ,(SELECT aba071 FROM bus_ba07 WHERE aba070=e.aba007) as startPoint
    ,(SELECT aba071 FROM bus_ba07 WHERE aba070=e.aba008) as endPoint
    ,a.aba041 as seat_no
    ,a.aaa997 as person
    ,(SELECT aaa005 FROM bus_aa99 WHERE aaa002='aca044' AND aaa004=a.aca044 AND aaa996=1) as type
    ,(SELECT aaa005 FROM bus_aa99 WHERE aaa002='aca035' AND aaa004=a.aca035 AND aaa996=1) as pay_state
    FROM bus_ca03 a,bus_ca05 b,bus_ba05 c,bus_ba03 e
    WHERE a.aca050=b.aca050
    AND b.aba050=c.aba050
    AND c.aba030=e.aba030
    AND a.aaa996=1
    AND a.aaa997 is not null
    #if(start&&end)
    AND b.aca051 between #para(start) and #para(end)
    #end
    #if(line)
    AND e.aba030=#para(line)
    #end
    #if(time)
    AND c.aba050=#para(time)
    #end
    #if(search_param)
    AND (a.aaa997 like CONCAT('%',#para(search_param),'%') or (SELECT CONCAT(aaa005,'（',aaa007,'座）') FROM bus_aa01 WHERE aaa001=b.aaa001) like CONCAT('%',#para(search_param),'%'))
    #end
    order by b.aca051 asc,time asc,b.aca050 asc,seat_no asc
#end

#sql("getCa03ChooseNum")
    select count(*) as count
    from bus_ca03
    where aaa996=1
    and (aca035!=0 || aca035!=4)
    #if(aca050)
    and aca050=#para(aca050)
    #end
#end

#sql("getDispatcherPhone")
    select a.*
    from bus_aa04 a,bus_ca04 b
    where a.aaa042=b.aca041
    and b.aca042=#para(openid)
    order by a.aaa996 desc,b.aaa996 desc
#end

#sql("getCheckBusSeatAvailable")
    select a.*
    ,(select count(*) from bus_ca03 where aaa996=1 and aca035!=4 and aca050=a.aca050) as choose
    ,(select aaa007 from bus_aa01 where aaa001=a.aaa001) as total
    from bus_ca05 a
    where aaa996=1
    #if(aca051)
    and aca051=#para(aca051)
    #end
    #if(aba050)
    and aba050=#para(aba050)
    #end
    ORDER BY aca050 asc
#end

#sql("getSeatInfoByLine")
    select aca050,aba032,aba041,aca031,aca044 from bus_ca03
    where FIND_IN_SET(aca050,(
        select GROUP_CONCAT(a.aca050)
        from bus_ca05 a,(select aba050,aca051 from bus_ca05 where aca050=#para(aca050) and aaa996=1) res
        where a.aba050=res.aba050
        and a.aca051=res.aca051
        and a.aca050!=#para(aca050)
    ))>0
    and aca031=#para(aca031)
    and aca035!=0
    and aca035!=4
    and aaa996=1
    and aca044=#para(type)
#end

#sql("getStartTimeList")
    select DISTINCT(DATE_FORMAT(aba051,'%H:%i')) as starTime
    FROM bus_ba05
    where aba030 in (select aba030 from bus_ba03 where aca052=1 or aca053=1)
    ORDER BY starTime asc
#end

#sql("getConsoleTimeList")
    select
    a.aca050
    ,DATE_FORMAT(b.aba051,'%H:%i') as time
    ,(select count(*) from bus_ca03 where (aca044=1 or aca044=2) and aaa996=1 and aca035=1 and aca050=a.aca050) as studentChoose
    ,(select count(*) from bus_ca03 where aca044=3 and aaa996=1 and aca050=a.aca050) as teacherChoose
    ,(select count(*) from bus_ca03 where aca044=6 and aaa996=1 and aca050=a.aca050) as tempChoose
    ,(select count(*) from bus_ca03 where aca044=0 and aaa996=1 and aca050=a.aca050) as managerLock
    from bus_ca05 a,bus_ba05 b
    where a.aba050=b.aba050
    and a.aaa996=1
    and aca051 between #para(dateStart) and #para(dateEnd)
#end

#sql("getConsoleBusInfo")
    select
	(select count(*) from bus_ca05 where aaa996=1 and aca051 between #para(dateStart) and #para(dateEnd) ) as busNum
	,(select count(*) from bus_ca03 where aaa996=1 and aca035!=4 and aca035 != 0 and aba032 between #para(dateStart) and #para(dateEnd)) as peopleNum
    from dual
#end

#sql("getBusInitTaskList")
    select
    a.aca050
    ,b.aba051
    from bus_ca05 a,bus_ba05 b
    where a.aba050=b.aba050
    and a.aaa996=1
    and a.aca053=1
    and TIMESTAMPDIFF(SECOND,now(),CONCAT(a.aca051,' ',b.aba051))>=0
#end

#sql("getAllBus")
SELECT * FROM bus_aa01 where 1=1
#if(aaa007)
and aaa007 = #para(aaa007)
#end
#if(aba060)
and aba060 = #para(aba060)
#end
#if(maxPrice)
and aza001 <= #para(maxPrice)
#end
#if(minPrice)
and aza001 >= #para(minPrice)
#end

#end

#sql("getBookedBus")
SELECT
  aa01.aaa005
,checi.aba032
,checi.aba041
,checi.aca050 FROM (
  SELECT ca05.aaa001,ca03.aba032,ca03.aba041,ca03.aca050 FROM bus_ca03 ca03 LEFT JOIN bus_ca05 ca05 ON ca03.aca050 = ca05.aca050
  WHERE 1=1
  #if(date)
  and  DATE_FORMAT(ca03.aba032,'%Y-%m-%d')>=#para(date)
  #end
) checi
LEFT JOIN bus_aa01 aa01 ON checi.aaa001 = aa01.aaa001
#end


#sql("getBusOrderAa01List")
select ba01.aaa001,
ba01.aaa002,
ba01.aaa003,
ba01.aaa004,
ba01.aaa005,
ba01.aaa006,
ba01.aaa007,
bb02.aaa999,
bb02.aba002,
bb02.aba020,
ba01.aba060,
ba01.aaa008,
ba01.aaa009,
(select aaa005 from bus_aa99 where aaa002='aaa995' and aaa004=ba01.aba060) as aba060_desc
from bus_aa01 ba01
left join bus_ba02 bb02 on bb02.aba020=ba01.aba020
where ba01.aaa996=1
#if(aba060)
and ba01.aba060=#para(aba060)
#end
#if(search_param)
and (ba01.aaa003 like concat('%',#para(search_param),'%') or ba01.aaa005 like concat('%',#para(search_param),'%'))
#end
group by ba01.aaa001 desc
#end

#sql("getBusCa03List")
select * from  bus_ca03
#end

#sql("getBusOrderList")
select * from  bus_order
#end

#sql("getBusBa02All")
select * from  bus_ba02
#end

#sql("getToBeReviewed")
SELECT * FROM bus_order WHERE 1=1
#if(aca031)
and aca031=#para(openid)
#end
and aza206 = 0
and aca050 = 1
#end

#sql("getOrdersInProgress")
SELECT * FROM bus_order WHERE 1=1
#if(aca031)
and aca031=#para(openid)
#end
and aaa996 = 1
and aca036 = 1
and aca050 = 1
#end

#sql("getOverOrder")
SELECT * FROM bus_order WHERE 1=1
#if(aca031)
and aca031=#para(openid)
#end
and aaa996 = 2
and aca036 = 2
and aca050 = 1
#end

#sql("getBusCa04ByOpenid")
SELECT * FROM bus_ca04 WHERE 1=1
#if(aca042)
and aca042=#para(aca042)
#end
limit 1
#end

#sql("findOrderByDriver")
SELECT bo.*,ba01.aaa002 licensePlate,ba02.aaa002 driverName FROM (
SELECT * FROM bus_order WHERE 1=1
and aca050 = 1
#if(aza208)
and aza208=#para(aza208)
#end
and aaa996 = 0
and aza206 = 1
) bo LEFT
JOIN bus_aa01 ba01 on bo.aza201 = ba01.aaa001
JOIN bus_aa02 ba02 on bo.aza208 = ba02.aaa020
#end

#sql("findOrderProcess")
SELECT bo.*,ba01.aaa002 licensePlate,ba02.aaa002 driverName FROM (
SELECT * FROM bus_order WHERE 1=1
and aca050 = 1
#if(aza208)
and aza208=#para(aza208)
#end
and aaa996 = 1
and aza206 = 1
) bo LEFT
JOIN bus_aa01 ba01 on bo.aza201 = ba01.aaa001
JOIN bus_aa02 ba02 on bo.aza208 = ba02.aaa020
#end

#sql("findOrderOver")
SELECT bo.*,ba01.aaa002 licensePlate,ba02.aaa002 driverName FROM (
SELECT * FROM bus_order WHERE 1=1
#if(aza208)
and aza208=#para(aza208)
#end
and aaa996 = 2
and aca036 = 2
and aca050 = 1
) bo LEFT
JOIN bus_aa01 ba01 on bo.aza201 = ba01.aaa001
JOIN bus_aa02 ba02 on bo.aza208 = ba02.aaa020
#end

-- select * from (select * from bus_ca04 where aca042 = ?) bc left join bus_aa02 ba on bc.aca046 = ba.aaa004

#sql("getToBeReviewedManage")
select bo.*,ba.aaa002,ba.aaa007 from bus_order bo LEFT JOIN bus_aa02 ba ON bo.aza208=ba.aaa020 where bo.aza206 = 0 and bo.aca050 = 1
#end


#sql("findOrderBySimple")
select * from bus_order where
1=1
and aca050 = 1
#if(aza211)
and aza211=#para(aza211)
#end
and aza206 > 0
#end

#sql("getApprovedOrder")
SELECT bo.*,ba01.aaa002 licensePlate,ba02.aaa002 driverName FROM (
select * from bus_order where 1=1
#if(aca031)
and aca031=#para(aca031)
#end
and aza206 = 1
and aca050 = 1
order by aca036
) bo LEFT
JOIN bus_aa01 ba01 on bo.aza201 = ba01.aaa001
JOIN bus_aa02 ba02 on bo.aza208 = ba02.aaa020
#end

#sql("getDriverIdList")
SELECT aaa020,aaa002 FROM bus_aa02
#end

#sql("busIdList")
SELECT aaa001,aaa002 FROM bus_aa01
#end

#sql("findAllBusType")
SELECT * from bus_ba02
#end

#sql("getBusAa02List1")
SELECT * from bus_aa02
#end


#sql("findMyEvaluate")
SELECT bo.aca032,bo.aca033,bo.aca034,ba01.aaa002 licensePlate,ba02.aaa002 driverName FROM (
select * from bus_order where 1=1
#if(aca031)
and aca031=#para(aca031)
#end
and aza206 = 1
and aca050 = 1
and aca032 is not NULL
order by aca036
) bo LEFT
JOIN bus_aa01 ba01 on bo.aza201 = ba01.aaa001
JOIN bus_aa02 ba02 on bo.aza208 = ba02.aaa020
#end

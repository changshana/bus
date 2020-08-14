#sql("getSysUserList")
  select * from sys_user
#end

#sql("updateUserPassword")
  update sys_user set password=#para(password) where user_id=#para(user_id)
#end

#sql("getUserByName")
select count(1) as count from sys_user
 where login_name = #para(login_name)
 #if(user_id)
  and user_id!=#para(user_id)
 #end
#end


#sql("findUserPermList")

SELECT base1.module_id,
       base1.module_name,
       base1.parent_module_id,
       base1.page,
       base2.icon
  FROM (SELECT x.module_id, x.module_name, x.parent_module_id, x.page
          FROM sys_module x,
               (SELECT m.module_id,
                       m.module_name,
                       m.parent_module_id,
                       n.perm_id,
                       n.perm_name
                  FROM sys_module m, sys_perm n
                 WHERE m.module_id = n.module_id
                   AND m.status = '1'
									 AND m.parent_module_id is not null
                   AND n.perm_id IN (SELECT b.perm_id
                                       FROM sys_user a, sys_user_perm b
                                      WHERE a.user_id = b.user_id
                                        AND b.perm_value > 0
                                        AND a.user_id=#para(user_id))) y
         WHERE y.parent_module_id = x.module_id
           AND x. status = '1'
					 AND x.plat_id=#para(plat_id)
        UNION
        SELECT x.module_id, x.module_name, x.parent_module_id, x.page
          FROM sys_module x,
               (SELECT m.module_id,
                       m.module_name,
                       m.parent_module_id,
                       n.perm_id,
                       n.perm_name,
											(select plat_id from sys_module where module_id=m.parent_module_id) as plat_id
                  FROM sys_module m, sys_perm n
                 WHERE m.module_id = n.module_id
                   AND m.status = '1'
									 AND m.parent_module_id is not null
                   AND n.perm_id IN (SELECT b.perm_id
                                       FROM sys_user a, sys_user_perm b
                                      WHERE a.user_id = b.user_id
                                        AND b.perm_value > 0
                                        AND a.user_id=#para(user_id))) y
         WHERE y.module_id = x.module_id
           AND x. status = '1'
					 AND y.plat_id=#para(plat_id)
        UNION
        SELECT x.module_id, x.module_name, x.parent_module_id, x.page
          FROM sys_module x,
               (SELECT m.module_id,
                       m.module_name,
                       m.parent_module_id,
                       n.perm_id,
                       n.perm_name
                  FROM sys_module m, sys_perm n
                 WHERE m.module_id = n.module_id
                   AND m.status = '1'
									 AND m.parent_module_id is not null
                   AND n.perm_id IN
                       (SELECT c.perm_id
                          FROM sys_user_role a, sys_role b, sys_role_perm c
                         WHERE a.role_id = b.role_id
                           AND b.role_id = c.role_id
													 AND b.plat_id=#para(plat_id)
                           AND c.perm_value > 0
                           AND a.user_id=#para(user_id))) y
         WHERE y.parent_module_id = x.module_id
           AND x. status = '1'
        UNION
        SELECT x.module_id, x.module_name, x.parent_module_id, x.page
          FROM sys_module x,
               (SELECT m.module_id,
                       m.module_name,
                       m.parent_module_id,
                       n.perm_id,
                       n.perm_name
                  FROM sys_module m, sys_perm n
                 WHERE m.module_id = n.module_id
                   AND m.status = '1'
									 AND m.parent_module_id is not null
                   AND n.perm_id IN
                       (SELECT c.perm_id
                          FROM sys_user_role a, sys_role b, sys_role_perm c
                         WHERE a.role_id = b.role_id
                           AND b.role_id = c.role_id
													 AND b.plat_id=#para(plat_id)
                           AND c.perm_value > 0
                           AND a.user_id=#para(user_id))) y
         WHERE y.module_id = x.module_id
           AND x. status = '1'
				) base1,
       sys_module base2
 WHERE base1.module_id = base2.module_id
 ORDER BY base2.order_code

#end




#sql("findUserList")
  select o.*,getOrgNameById(o.site_id) as site_name from ( select s.*,
                          (select GROUP_CONCAT(y.role_name SEPARATOR ',') from sys_user_role x,sys_role y where x.user_id=s.user_id and x.role_id=y.role_id) as user_role_name,
                          (select count(1) from sys_user_role x,sys_role y where x.user_id=s.user_id and x.role_id=y.role_id) as user_role_count,
                          (select count(1) from
                            (select c.perm_id,e.module_id,e.parent_module_id,e.module_name,a.user_id
                              from sys_user_role a, sys_role b, sys_role_perm c,sys_perm d,sys_module e
                              where a.role_id = b.role_id
                              and b.role_id = c.role_id
                              and c.perm_value > 0
                              and d.perm_id=c.perm_id
                              and e.module_id=d.module_id
                              and e.`status`=1

                              UNION
                              select c.perm_id,e.module_id,e.parent_module_id,e.module_name,a.user_id
                              from sys_user a, sys_user_perm c,sys_perm d,sys_module e
                              where a.user_id=c.user_id
                              and c.perm_value > 0
                              and d.perm_id=c.perm_id
                              and e.module_id=d.module_id
                              and e.`status`=1
                            ) r
                              where r.user_id=s.user_id
                          ) as user_perm_count
                      FROM `sys_user` s
                      where 1=1
        #if(status)
          and s.status=#para(status)
        #end
        #if(plat_id)
          and #para(plat_id)=s.plat_ids
        #end
        ) o
        #if(search_param)
          where o.login_name like concat('%',#para(search_param),'%') or o.user_name like concat('%',#para(search_param),'%') or o.user_role_name like concat('%',#para(search_param),'%')
        #end
    ORDER BY o.create_time desc
#end




#sql("findAllPlatMsg")
select
       concat('%',a.plat_name,'%') as name,
       (select count(1) from sys_role where plat_id=a.plat_id) as role_count,
       (select count(1) from sys_user where FIND_IN_SET(a.plat_id,plat_ids)>0 and status=1) as value,
       (select count(1) from sys_module where status=1 and plat_id=a.plat_id and parent_module_id is NULL ) as pm_count,
       (select count(1) from sys_module where status=1 and plat_id=a.plat_id and parent_module_id is not NULL ) as cm_count
  from sys_plat a
  where status=1
  order by value DESC
#end
#sql("findAllPlatMsgSortRole")
select
       concat('%',a.plat_name,'%') as name,
       (select count(1) from sys_role where plat_id=a.plat_id) as role_count,
       (select count(1) from sys_user where FIND_IN_SET(a.plat_id,plat_ids)>0 and status=1) as value,
       (select count(1) from sys_module where status=1 and plat_id=a.plat_id and parent_module_id is NULL ) as pm_count,
       (select count(1) from sys_module where status=1 and plat_id=a.plat_id and parent_module_id is not NULL ) as cm_count
  from sys_plat a
  order by role_count DESC
#end

#sql("findAllRoleAndUser")
select
   (select count(1) from sys_user where status=1) as user_count,
   (select count(1) from sys_role) as role_count
  from  dual
#end



#sql("findFastMenu")
select
       a.*,b.module_name,b.page
  from fast_menu a,sys_module b
 where a.module_id=b.module_id
   and a.plat_id=b.plat_id
   and b.status=1
 #if(plat_id)
    and #para(plat_id)=a.plat_id
 #end
 #if(user_id)
    and #para(user_id)=a.user_id
 #end

#end





#sql("getPubCountry")
  select * from pub_country
  where 1=1
  #if(country_name)
    and country_name=#para(country_name)
  #end
  #if(country_id)
    and country_id=#para(country_id)
  #end
#end

#sql("getPubNation")
  select * from pub_nation
  where 1=1
  #if(nation_name)
    and nation_name=#para(nation_name)
  #end
  #if(nation_id)
    and nation_id=#para(nation_id)
  #end
#end

#sql("getPubProvince")
  select * from pub_province
#end

#sql("getPubCity")
  select * from pub_city
  where 1=1
  #if(province_code)
    and #para(province_code)=province_code
 #end
#end

#sql("getPubTown")
  select * from pub_town
  where 1=1
  #if(city_code)
    and #para(city_code)=city_code
 #end
#end


#sql("findMsgByIdCard")
  select * from #(table_name)
  where 1=1
  #if(identity_card)
    and #para(identity_card)=identity_card
  #end
  #if(table_id)
    and #(table_id)=#para(id)
  #end
#end




#sql("getUserPerm")
select
  IFNULL((select n.perm_value from sys_user m,sys_user_perm n,sys_perm o
           where m.user_id=#para(user_id)
             and n.perm_id=o.perm_id
             and o.perm_code=#para(perm_code)
             and m.user_id=n.user_id),0) as perm_value
from dual
#end

#sql("getRolePerm")
select
    IFNULL((select GROUP_CONCAT(c.perm_value SEPARATOR ',') from sys_user a,sys_user_role b,sys_role_perm c,sys_perm e
             where a.user_id=b.user_id
             and b.role_id=c.role_id
             and c.perm_id=e.perm_id
             and a.user_id= #para(user_id)
             and e.perm_code=#para(perm_code)),0) as perm_value
from dual
#end


#sql("getPermList")
  select * FROM sys_perm
   where 1=1
   #if(module_id)
     and module_id=#para(module_id)
   #end
    order by perm_id desc
#end

#sql("getTopOrgTree")
  select * FROM site_info
  where parent_site_id is NULL
    #if(plat_id)
      and plat_id=#para(plat_id)
    #end
#end

#sql("getOrgTreeByParent")
  select * FROM site_info
  where parent_site_id = #para(parent_site_id)
#end

#sql("checkSiteName")
  select * from site_info
  where 1=1
    #if(site_name)
      and site_name=#para(site_name)
    #end
    #if(site_code)
      and site_code=#para(site_code)
    #end
    #if(site_id)
      and site_id!=#para(site_id)
    #end
    #if(plat_id)
      and plat_id=#para(plat_id)
    #end
#end

#sql("updateSitePlatId")
  update site_info child,site_info parent set child.plat_id=parent.plat_id
  where child.parent_site_id=parent.site_id
    and child.plat_id is null
#end

#sql("getSiteMsg")
  select a.*,(select site_name from site_info where site_id=a.parent_site_id) as parent_site_name FROM site_info a
  where a.site_id = #para(site_id)
#end

#sql("getUserSiteChilds")
  select getOrgChilds(#para(siteId)) as childIds from dual
#end

/*获取码值列表*/
#sql("getCodeList")
select
*
FROM #(code_table)
where code_type =#para(code_type)
     and status=1
     order by code_value asc
#end


#sql("getUserWithRoleList")
  SELECT
    a.*,
    c.*,
    GROUP_CONCAT(c.role_name) as role_names,
    concat(',',fake_id,',') as aaa080s
  FROM
    sys_user a,
    sys_user_role b,
   sys_role c
  WHERE
    a.user_id = b.user_id
    and b.role_id=c.role_id
    and c.plat_id=#para(plat_id)
    #if(role_id)
      and c.role_id=#para(role_id)
    #end
    GROUP BY a.user_id
#end
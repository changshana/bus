package com.mht.common;

import com.jfinal.config.*;
import com.jfinal.core.Const;
import com.jfinal.core.JFinal;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.DbKit;
import com.jfinal.plugin.cron4j.Cron4jPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;
import com.jfinal.template.source.ClassPathSourceFactory;
import com.mht.bus.*;
import com.mht.bus.util.BusScheduleUtil;
import com.mht.bus.util.BusStaticUtil;
import com.mht.common.interceptor.ParameterInterceptor;
import com.mht.common.model._MappingKit;
import com.mht.file.FileController;
import com.mht.index.IndexController;
import com.mht.system.CodeManageController;
import com.mht.system.SystemController;

/**
 * API引导式配置
 */
public class AppConfig extends JFinalConfig {

    /**
     * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
     * <p>
     * 使用本方法启动过第一次以后，会在开发工具的 debug、run config 中自动生成
     * 一条启动配置，可对该自动生成的配置再添加额外的配置项，例如 VM argument 可配置为：
     * -XX:PermSize=64M -XX:MaxPermSize=256M
     */
    public static void main(String[] args) {

        /**
         * 特别注意：Eclipse 之下建议的启动方式
         */
//		JFinal.start("src/main/webapp", 8080, "/", 5);

//        HanLP.Config.enableDebug();//初始化中文分词词典
//        HanLP.segment("你好，欢迎使用HanLP汉语处理包！接下来请从其他Demo中体验HanLP丰富的功能~");
        /**
         * 特别注意：IDEA 之下建议的启动方式，仅比 eclipse 之下少了最后一个参数
         */
        JFinal.start("src/main/webapp", 80, "/");
    }

    /**
     * 配置常量
     */
    public void configConstant(Constants me) {
        // 加载少量必要配置，随后可用PropKit.get(...)获取值
        PropKit.use("config.properties");
        me.setDevMode(PropKit.getBoolean("devMode", false));
        me.setEncoding(Const.DEFAULT_ENCODING);
        //最大上传限制100M，JFinal默认最大10M。
        me.setMaxPostSize(1024 * 1024 * 100);
        //me.setRestful(true);
        try {
            me.setBaseUploadPath("upload");
            me.setBaseDownloadPath("upload");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 配置路由
     */
    public void configRoute(Routes me) {
        me.addInterceptor(new ParameterInterceptor());
        me.setBaseViewPath("/lp");
        me.add("/", IndexController.class, "index");
        me.add("/system", SystemController.class);
        me.add("/file", FileController.class);
        me.add("/common", CommonController.class);
        me.add("/code", CodeManageController.class);
        me.add("/bus", BusController.class,"bus");
        me.add("/busAPI", BusAPIController.class,"bus");
        me.add("/busOrder", BusOrderController.class,"bus");
        me.add("/busWx", BusWxController.class, "bus");
        me.add("/bus/statistics", BusStatistics.class, "bus/statistics");
    }

    public void configEngine(Engine me) {
        me.addSharedFunction("/lp/common/sysCommon.html");
        me.addSharedFunction("/lp/common/common.html");
        me.addSharedFunction("/lp/common/busCommon.html");
    }

    /**
     * 配置插件
     */
    public void configPlugin(Plugins me) {
        // 配置C3p0数据库连接池插件
        DruidPlugin druidPlugin = createDruidPlugin();
        me.add(druidPlugin);

        // 配置ActiveRecord插件
        ActiveRecordPlugin arp = new ActiveRecordPlugin(DbKit.MAIN_CONFIG_NAME, druidPlugin);
        arp.setShowSql(true);
        arp.getEngine().setSourceFactory(new ClassPathSourceFactory());
        arp.addSqlTemplate("sql/common.sql");

        // 所有映射在 MappingKit 中自动化搞定
        _MappingKit.mapping(arp);
        me.add(arp);

        //配置数据共享数据库插件
        DruidPlugin share=createShareDruidPlugin();
        me.add(share);

        //配置共享数据库的ActiveRecord插件
        ActiveRecordPlugin arpShare = new ActiveRecordPlugin("share", share);
        arpShare.setShowSql(false);
        arpShare.getEngine().setSourceFactory(new ClassPathSourceFactory());
        me.add(arpShare);

    }


    public static DruidPlugin createDruidPlugin() {
        return new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
    }

    public static DruidPlugin createShareDruidPlugin() {
        return new DruidPlugin(PropKit.get("shareJdbcUrl"), PropKit.get("shareUser"), PropKit.get("sharePwd").trim());
    }

    /**
     * 配置全局拦截器
     */
    public void configInterceptor(Interceptors me) {
        me.add(new ParameterInterceptor());
        me.add(new SessionInViewInterceptor());
    }

    /**
     * 配置处理器
     */
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("base_path"));
    }

    @Override
    public void afterJFinalStart(){
        //启动时添加校车定时任务到校车调度线程池
//        BusStaticUtil.addBusLockedRefreshTask();
        //启动时添加未完成的校车任务到校车调度线程池
//        BusStaticUtil.initBusCheck();
    }

    @Override
    public void beforeJFinalStop(){
        System.out.println("O-=-=-=-=-=-=-=-=-=-=-=-=-=-执行定时任务容器关闭任务=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=O");
        BusScheduleUtil.getInstance().shutdown();
    }

}

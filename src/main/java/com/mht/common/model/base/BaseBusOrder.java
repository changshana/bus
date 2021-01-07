package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_order:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusOrder<M extends BaseBusOrder<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca030(java.lang.Integer aca030) {
		set("aca030", aca030);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca030() {
		return getInt("aca030");
	}

	/**
	*设置座位号（弃用）改为用户id 
	*/
	public M setAba041(java.lang.Integer aba041) {
		set("aba041", aba041);
		return (M)this;
	}

	/**
	*获取座位号（弃用）改为用户id 
	*/
	public java.lang.Integer getAba041() {
		return getInt("aba041");
	}

	/**
	*设置人员ID (弃用) 改为openid 
	*/
	public M setAca031(java.lang.String aca031) {
		set("aca031", aca031);
		return (M)this;
	}

	/**
	*获取人员ID (弃用) 改为openid 
	*/
	public java.lang.String getAca031() {
		return getStr("aca031");
	}

	/**
	*设置人员类型(1.校内用户；2.校外用户；3.驾驶员；4.管理员；) 
	*/
	public M setAca044(java.lang.Integer aca044) {
		set("aca044", aca044);
		return (M)this;
	}

	/**
	*获取人员类型(1.校内用户；2.校外用户；3.驾驶员；4.管理员；) 
	*/
	public java.lang.Integer getAca044() {
		return getInt("aca044");
	}

	/**
	*设置改为订单是否被取消（0取消，1使用），2为管理员同意订单后未发车，取消的订单，3为管理员审核通过的取消的订单 
	*/
	public M setAca050(java.lang.Integer aca050) {
		set("aca050", aca050);
		return (M)this;
	}

	/**
	*获取改为订单是否被取消（0取消，1使用），2为管理员同意订单后未发车，取消的订单，3为管理员审核通过的取消的订单 
	*/
	public java.lang.Integer getAca050() {
		return getInt("aca050");
	}

	/**
	*设置日期(发车时间) 
	*/
	public M setAba032(java.util.Date aba032) {
		set("aba032", aba032);
		return (M)this;
	}

	/**
	*获取日期(发车时间) 
	*/
	public java.util.Date getAba032() {
		return get("aba032");
	}

	/**
	*设置预计归还时间 
	*/
	public M setAba033(java.util.Date aba033) {
		set("aba033", aba033);
		return (M)this;
	}

	/**
	*获取预计归还时间 
	*/
	public java.util.Date getAba033() {
		return get("aba033");
	}

	/**
	*设置评价星级 
	*/
	public M setAca032(java.lang.Integer aca032) {
		set("aca032", aca032);
		return (M)this;
	}

	/**
	*获取评价星级 
	*/
	public java.lang.Integer getAca032() {
		return getInt("aca032");
	}

	/**
	*设置评价类型 
	*/
	public M setAca033(java.lang.Integer aca033) {
		set("aca033", aca033);
		return (M)this;
	}

	/**
	*获取评价类型 
	*/
	public java.lang.Integer getAca033() {
		return getInt("aca033");
	}

	/**
	*设置评价备注 
	*/
	public M setAca034(java.lang.String aca034) {
		set("aca034", aca034);
		return (M)this;
	}

	/**
	*获取评价备注 
	*/
	public java.lang.String getAca034() {
		return getStr("aca034");
	}

	/**
	*设置支付状态 0为未支付，1为已支付 
	*/
	public M setAca035(java.lang.Integer aca035) {
		set("aca035", aca035);
		return (M)this;
	}

	/**
	*获取支付状态 0为未支付，1为已支付 
	*/
	public java.lang.Integer getAca035() {
		return getInt("aca035");
	}

	/**
	*设置乘坐状态（0为未乘坐，1为正在乘坐，2为乘坐结束） 
	*/
	public M setAca036(java.lang.Integer aca036) {
		set("aca036", aca036);
		return (M)this;
	}

	/**
	*获取乘坐状态（0为未乘坐，1为正在乘坐，2为乘坐结束） 
	*/
	public java.lang.Integer getAca036() {
		return getInt("aca036");
	}

	/**
	*设置商户订单号 
	*/
	public M setOutTradeNo(java.lang.String outTradeNo) {
		set("out_trade_no", outTradeNo);
		return (M)this;
	}

	/**
	*获取商户订单号 
	*/
	public java.lang.String getOutTradeNo() {
		return getStr("out_trade_no");
	}

	/**
	*设置开车状态（0为等待发车，1为正在行驶，2为行程结束） 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取开车状态（0为等待发车，1为正在行驶，2为行程结束） 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置创建人 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getAaa997() {
		return getStr("aaa997");
	}

	/**
	*设置创建时间 
	*/
	public M setAaa998(java.util.Date aaa998) {
		set("aaa998", aaa998);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getAaa998() {
		return get("aaa998");
	}

	/**
	*设置备注 
	*/
	public M setAaa999(java.lang.String aaa999) {
		set("aaa999", aaa999);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getAaa999() {
		return getStr("aaa999");
	}

	/**
	*设置车辆id 
	*/
	public M setAza201(java.lang.Integer aza201) {
		set("aza201", aza201);
		return (M)this;
	}

	/**
	*获取车辆id 
	*/
	public java.lang.Integer getAza201() {
		return getInt("aza201");
	}

	/**
	*设置车型id 
	*/
	public M setAza207(java.lang.Integer aza207) {
		set("aza207", aza207);
		return (M)this;
	}

	/**
	*获取车型id 
	*/
	public java.lang.Integer getAza207() {
		return getInt("aza207");
	}

	/**
	*设置驾驶员id 
	*/
	public M setAza208(java.lang.Integer aza208) {
		set("aza208", aza208);
		return (M)this;
	}

	/**
	*获取驾驶员id 
	*/
	public java.lang.Integer getAza208() {
		return getInt("aza208");
	}

	/**
	*设置预估费用（订单未结束前是预估费用，结束后是实际费用） 
	*/
	public M setAza202(java.math.BigDecimal aza202) {
		set("aza202", aza202);
		return (M)this;
	}

	/**
	*获取预估费用（订单未结束前是预估费用，结束后是实际费用） 
	*/
	public java.math.BigDecimal getAza202() {
		return get("aza202");
	}

	/**
	*设置里程（单位为公里，可精确到小数点后两位）订单未结束前是预估里程，结束后是实际里程 
	*/
	public M setAza203(java.math.BigDecimal aza203) {
		set("aza203", aza203);
		return (M)this;
	}

	/**
	*获取里程（单位为公里，可精确到小数点后两位）订单未结束前是预估里程，结束后是实际里程 
	*/
	public java.math.BigDecimal getAza203() {
		return get("aza203");
	}

	/**
	*设置起点（地点名称+经纬度） 
	*/
	public M setAza204(java.lang.String aza204) {
		set("aza204", aza204);
		return (M)this;
	}

	/**
	*获取起点（地点名称+经纬度） 
	*/
	public java.lang.String getAza204() {
		return getStr("aza204");
	}

	/**
	*设置终点（地点名称+经纬度） 
	*/
	public M setAza205(java.lang.String aza205) {
		set("aza205", aza205);
		return (M)this;
	}

	/**
	*获取终点（地点名称+经纬度） 
	*/
	public java.lang.String getAza205() {
		return getStr("aza205");
	}

	/**
	*设置订单状态（0为待审核，1为审核通过，2为不通过） 
	*/
	public M setAza206(java.lang.Integer aza206) {
		set("aza206", aza206);
		return (M)this;
	}

	/**
	*获取订单状态（0为待审核，1为审核通过，2为不通过） 
	*/
	public java.lang.Integer getAza206() {
		return getInt("aza206");
	}

	/**
	*设置预估时长（单位为分钟，订单结束后改为真实时长） 
	*/
	public M setAza209(java.lang.Integer aza209) {
		set("aza209", aza209);
		return (M)this;
	}

	/**
	*获取预估时长（单位为分钟，订单结束后改为真实时长） 
	*/
	public java.lang.Integer getAza209() {
		return getInt("aza209");
	}

	/**
	*设置驾驶员确认是否收到订单（0为未收到，1为收到） 
	*/
	public M setAza210(java.lang.Integer aza210) {
		set("aza210", aza210);
		return (M)this;
	}

	/**
	*获取驾驶员确认是否收到订单（0为未收到，1为收到） 
	*/
	public java.lang.Integer getAza210() {
		return getInt("aza210");
	}

	/**
	*设置操作订单的管理员的账户id 
	*/
	public M setAza211(java.lang.Integer aza211) {
		set("aza211", aza211);
		return (M)this;
	}

	/**
	*获取操作订单的管理员的账户id 
	*/
	public java.lang.Integer getAza211() {
		return getInt("aza211");
	}

	/**
	*设置起点驾驶员表里程数 
	*/
	public M setAza212(java.math.BigDecimal aza212) {
		set("aza212", aza212);
		return (M)this;
	}

	/**
	*获取起点驾驶员表里程数 
	*/
	public java.math.BigDecimal getAza212() {
		return get("aza212");
	}

	/**
	*设置终点驾驶员表里程数 
	*/
	public M setAza213(java.math.BigDecimal aza213) {
		set("aza213", aza213);
		return (M)this;
	}

	/**
	*获取终点驾驶员表里程数 
	*/
	public java.math.BigDecimal getAza213() {
		return get("aza213");
	}

	/**
	*设置实际发车时间 
	*/
	public M setAza214(java.lang.String aza214) {
		set("aza214", aza214);
		return (M)this;
	}

	/**
	*获取实际发车时间 
	*/
	public java.lang.String getAza214() {
		return getStr("aza214");
	}

	/**
	*设置实际到达时间 
	*/
	public M setAza215(java.lang.String aza215) {
		set("aza215", aza215);
		return (M)this;
	}

	/**
	*获取实际到达时间 
	*/
	public java.lang.String getAza215() {
		return getStr("aza215");
	}

	/**
	*设置实际时长 
	*/
	public M setAza216(java.lang.Integer aza216) {
		set("aza216", aza216);
		return (M)this;
	}

	/**
	*获取实际时长 
	*/
	public java.lang.Integer getAza216() {
		return getInt("aza216");
	}

	/**
	*设置实际费用 
	*/
	public M setAza217(java.math.BigDecimal aza217) {
		set("aza217", aza217);
		return (M)this;
	}

	/**
	*获取实际费用 
	*/
	public java.math.BigDecimal getAza217() {
		return get("aza217");
	}

	/**
	*设置实际里程 
	*/
	public M setAza218(java.math.BigDecimal aza218) {
		set("aza218", aza218);
		return (M)this;
	}

	/**
	*获取实际里程 
	*/
	public java.math.BigDecimal getAza218() {
		return get("aza218");
	}

	/**
	*设置0为个人用车，1为公车 
	*/
	public M setAza219(java.lang.Integer aza219) {
		set("aza219", aza219);
		return (M)this;
	}

	/**
	*获取0为个人用车，1为公车 
	*/
	public java.lang.Integer getAza219() {
		return getInt("aza219");
	}

	/**
	*设置预约乘车人数 
	*/
	public M setAza220(java.lang.String aza220) {
		set("aza220", aza220);
		return (M)this;
	}

	/**
	*获取预约乘车人数 
	*/
	public java.lang.String getAza220() {
		return getStr("aza220");
	}

	/**
	*设置预约联系人电话 
	*/
	public M setAza221(java.lang.String aza221) {
		set("aza221", aza221);
		return (M)this;
	}

	/**
	*获取预约联系人电话 
	*/
	public java.lang.String getAza221() {
		return getStr("aza221");
	}

	/**
	*设置是否为紧急用车（0为紧急用车，1为正常用车） 
	*/
	public M setAza222(java.lang.Integer aza222) {
		set("aza222", aza222);
		return (M)this;
	}

	/**
	*获取是否为紧急用车（0为紧急用车，1为正常用车） 
	*/
	public java.lang.Integer getAza222() {
		return getInt("aza222");
	}

	/**
	*设置审核通过未发车的订单的取消理由 
	*/
	public M setAza223(java.lang.String aza223) {
		set("aza223", aza223);
		return (M)this;
	}

	/**
	*获取审核通过未发车的订单的取消理由 
	*/
	public java.lang.String getAza223() {
		return getStr("aza223");
	}

	/**
	*设置单双程  1为单程，2为往返 
	*/
	public M setAza224(java.lang.Integer aza224) {
		set("aza224", aza224);
		return (M)this;
	}

	/**
	*获取单双程  1为单程，2为往返 
	*/
	public java.lang.Integer getAza224() {
		return getInt("aza224");
	}

}

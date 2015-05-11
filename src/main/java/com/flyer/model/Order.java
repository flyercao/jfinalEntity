package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Order extends Model<Order>{
	public static final Order dao = new Order();
	

	public  String getEmployeeId(){
		return get("EMPLOYEE_ID");
	}
	
	/**
	* @Description: 雇员ID
	*/
	public void setEmployeeId(String value){
		set("EMPLOYEE_ID",value);
	}
	
	public  Date getDealTime(){
		return get("DEAL_TIME");
	}
	
	/**
	* @Description: 成交时间
	*/
	public void setDealTime(Date value){
		set("DEAL_TIME",value);
	}
	
	public  BigDecimal getActualSalary(){
		return get("ACTUAL_SALARY");
	}
	
	/**
	* @Description: 实发薪水
	*/
	public void setActualSalary(BigDecimal value){
		set("ACTUAL_SALARY",value);
	}
	
	public  Integer getJobId(){
		return get("JOB_ID");
	}
	
	/**
	* @Description: 工作ID
	*/
	public void setJobId(Integer value){
		set("JOB_ID",value);
	}
	
	public  Byte getStatus(){
		return get("STATUS");
	}
	
	/**
	* @Description: 订单状态(0创建，1成交，2签到，3确认签到，4付款，5确认付款，6取消，7雇员退出)
	*/
	public void setStatus(Byte value){
		set("STATUS",value);
	}
	
	public  Integer getHours(){
		return get("HOURS");
	}
	
	/**
	* @Description: 结束时间
	*/
	public void setHours(Integer value){
		set("HOURS",value);
	}
	
	public  Date getEndTime(){
		return get("END_TIME");
	}
	
	public void setEndTime(Date value){
		set("END_TIME",value);
	}
	
	public  String getEmployeeName(){
		return get("EMPLOYEE_NAME");
	}
	
	/**
	* @Description: 雇员名称
	*/
	public void setEmployeeName(String value){
		set("EMPLOYEE_NAME",value);
	}
	
	public  Date getStartTime(){
		return get("START_TIME");
	}
	
	/**
	* @Description: 开始时间
	*/
	public void setStartTime(Date value){
		set("START_TIME",value);
	}
	
	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  String getEmployerName(){
		return get("EMPLOYER_NAME");
	}
	
	/**
	* @Description: 雇主名称
	*/
	public void setEmployerName(String value){
		set("EMPLOYER_NAME",value);
	}
	
	public  String getEmployerId(){
		return get("EMPLOYER_ID");
	}
	
	/**
	* @Description: 雇主ID
	*/
	public void setEmployerId(String value){
		set("EMPLOYER_ID",value);
	}
	
	public  BigDecimal getExpectedSalary(){
		return get("EXPECTED_SALARY");
	}
	
	/**
	* @Description: 预计薪水
	*/
	public void setExpectedSalary(BigDecimal value){
		set("EXPECTED_SALARY",value);
	}
	
	public  BigDecimal getHourlyWage(){
		return get("HOURLY_WAGE");
	}
	
	/**
	* @Description: 时薪
	*/
	public void setHourlyWage(BigDecimal value){
		set("HOURLY_WAGE",value);
	}
	

}

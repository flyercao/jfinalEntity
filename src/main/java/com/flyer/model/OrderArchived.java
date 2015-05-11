package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class OrderArchived extends Model<OrderArchived>{
	public static final OrderArchived dao = new OrderArchived();
	

	public  Long getEmployeeId(){
		return get("EMPLOYEE_ID");
	}
	
	public void setEmployeeId(Long value){
		set("EMPLOYEE_ID",value);
	}
	
	public  Date getDealTime(){
		return get("DEAL_TIME");
	}
	
	public void setDealTime(Date value){
		set("DEAL_TIME",value);
	}
	
	public  BigDecimal getActualSalary(){
		return get("ACTUAL_SALARY");
	}
	
	public void setActualSalary(BigDecimal value){
		set("ACTUAL_SALARY",value);
	}
	
	public  Long getJobId(){
		return get("JOB_ID");
	}
	
	public void setJobId(Long value){
		set("JOB_ID",value);
	}
	
	public  Byte getStatus(){
		return get("STATUS");
	}
	
	public void setStatus(Byte value){
		set("STATUS",value);
	}
	
	public  String getEmployeeName(){
		return get("EMPLOYEE_NAME");
	}
	
	public void setEmployeeName(String value){
		set("EMPLOYEE_NAME",value);
	}
	
	public  Date getStartTime(){
		return get("START_TIME");
	}
	
	public void setStartTime(Date value){
		set("START_TIME",value);
	}
	
	public  Long getId(){
		return get("ID");
	}
	
	public void setId(Long value){
		set("ID",value);
	}
	
	public  String getEmployerName(){
		return get("EMPLOYER_NAME");
	}
	
	public void setEmployerName(String value){
		set("EMPLOYER_NAME",value);
	}
	
	public  Long getEmployerId(){
		return get("EMPLOYER_ID");
	}
	
	public void setEmployerId(Long value){
		set("EMPLOYER_ID",value);
	}
	
	public  Date getFinishTime(){
		return get("FINISH_TIME");
	}
	
	public void setFinishTime(Date value){
		set("FINISH_TIME",value);
	}
	
	public  BigDecimal getExpectedSalary(){
		return get("EXPECTED_SALARY");
	}
	
	public void setExpectedSalary(BigDecimal value){
		set("EXPECTED_SALARY",value);
	}
	
	public  BigDecimal getHourlyWage(){
		return get("HOURLY_WAGE");
	}
	
	public void setHourlyWage(BigDecimal value){
		set("HOURLY_WAGE",value);
	}
	

}

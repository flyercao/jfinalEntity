package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class JobApply extends Model<JobApply>{
	public static final JobApply dao = new JobApply();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  String getEmployeeId(){
		return get("EMPLOYEE_ID");
	}
	
	/**
	* @Description: 雇员ID
	*/
	public void setEmployeeId(String value){
		set("EMPLOYEE_ID",value);
	}
	
	public  Date getApplyTime(){
		return get("APPLY_TIME");
	}
	
	/**
	* @Description: 申请时间
	*/
	public void setApplyTime(Date value){
		set("APPLY_TIME",value);
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
	* @Description: 申请的状态(1创建，2取消，3同意，4拒绝，5过期)
	*/
	public void setStatus(Byte value){
		set("STATUS",value);
	}
	

}

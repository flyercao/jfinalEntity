package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class JobInvite extends Model<JobInvite>{
	public static final JobInvite dao = new JobInvite();
	

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
	
	public  String getInviter(){
		return get("INVITER");
	}
	
	/**
	* @Description: 邀请人
	*/
	public void setInviter(String value){
		set("INVITER",value);
	}
	
	public  Date getInviteTime(){
		return get("INVITE_TIME");
	}
	
	/**
	* @Description: 邀请时间
	*/
	public void setInviteTime(Date value){
		set("INVITE_TIME",value);
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
	* @Description: 邀请单状态(0创建，1取消，2同意，3拒绝，4过期)
	*/
	public void setStatus(Byte value){
		set("STATUS",value);
	}
	

}

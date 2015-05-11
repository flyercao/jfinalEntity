package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Employee extends Model<Employee>{
	public static final Employee dao = new Employee();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  String getSystemUid(){
		return get("SYSTEM_UID");
	}
	
	/**
	* @Description: 系统唯一用户标示
	*/
	public void setSystemUid(String value){
		set("SYSTEM_UID",value);
	}
	
	public  String getLastName(){
		return get("LAST_NAME");
	}
	
	/**
	* @Description: 姓
	*/
	public void setLastName(String value){
		set("LAST_NAME",value);
	}
	
	public  Date getBirthday(){
		return get("BIRTHDAY");
	}
	
	/**
	* @Description: 出生日期
	*/
	public void setBirthday(Date value){
		set("BIRTHDAY",value);
	}
	
	public  Date getJobNowTime(){
		return get("JOB_NOW_TIME");
	}
	
	/**
	* @Description: 点击正在找工作的时间
	*/
	public void setJobNowTime(Date value){
		set("JOB_NOW_TIME",value);
	}
	
	public  Float getScore(){
		return get("SCORE");
	}
	
	/**
	* @Description: 评分
	*/
	public void setScore(Float value){
		set("SCORE",value);
	}
	
	public  Float getRequiredSalary(){
		return get("REQUIRED_SALARY");
	}
	
	/**
	* @Description: 要求的时薪
	*/
	public void setRequiredSalary(Float value){
		set("REQUIRED_SALARY",value);
	}
	
	public  String getGender(){
		return get("GENDER");
	}
	
	/**
	* @Description: 性别。'1',男，'2'，女
	*/
	public void setGender(String value){
		set("GENDER",value);
	}
	
	public  Float getLongitude(){
		return get("LONGITUDE");
	}
	
	/**
	* @Description: 经度
	*/
	public void setLongitude(Float value){
		set("LONGITUDE",value);
	}
	
	public  Float getLatitude(){
		return get("LATITUDE");
	}
	
	/**
	* @Description: 纬度
	*/
	public void setLatitude(Float value){
		set("LATITUDE",value);
	}
	
	public  String getFirstName(){
		return get("FIRST_NAME");
	}
	
	/**
	* @Description: 名字
	*/
	public void setFirstName(String value){
		set("FIRST_NAME",value);
	}
	
	public  String getAvatar(){
		return get("AVATAR");
	}
	
	/**
	* @Description: 头像url
	*/
	public void setAvatar(String value){
		set("AVATAR",value);
	}
	
	public  Float getWorkYears(){
		return get("WORK_YEARS");
	}
	
	/**
	* @Description: 工作年限
	*/
	public void setWorkYears(Float value){
		set("WORK_YEARS",value);
	}
	
	public  String getBrief(){
		return get("BRIEF");
	}
	
	/**
	* @Description: 简介
	*/
	public void setBrief(String value){
		set("BRIEF",value);
	}
	

}

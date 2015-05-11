package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Job extends Model<Job>{
	public static final Job dao = new Job();
	

	public  String getSystemUid(){
		return get("SYSTEM_UID");
	}
	
	public void setSystemUid(String value){
		set("SYSTEM_UID",value);
	}
	
	public  String getPhone(){
		return get("PHONE");
	}
	
	public void setPhone(String value){
		set("PHONE",value);
	}
	
	public  Byte getStatus(){
		return get("STATUS");
	}
	
	public void setStatus(Byte value){
		set("STATUS",value);
	}
	
	public  Float getHours(){
		return get("HOURS");
	}
	
	public void setHours(Float value){
		set("HOURS",value);
	}
	
	public  String getJobContent(){
		return get("JOB_CONTENT");
	}
	
	public void setJobContent(String value){
		set("JOB_CONTENT",value);
	}
	
	public  Integer getCategoryId(){
		return get("CATEGORY_ID");
	}
	
	public void setCategoryId(Integer value){
		set("CATEGORY_ID",value);
	}
	
	public  Date getEndTime(){
		return get("END_TIME");
	}
	
	public void setEndTime(Date value){
		set("END_TIME",value);
	}
	
	public  String getContact(){
		return get("CONTACT");
	}
	
	public void setContact(String value){
		set("CONTACT",value);
	}
	
	public  Integer getZoneId(){
		return get("ZONE_ID");
	}
	
	public void setZoneId(Integer value){
		set("ZONE_ID",value);
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
	
	public  Date getCreateAt(){
		return get("CREATE_AT");
	}
	
	public void setCreateAt(Date value){
		set("CREATE_AT",value);
	}
	
	public  Integer getNum(){
		return get("NUM");
	}
	
	public void setNum(Integer value){
		set("NUM",value);
	}
	
	public  String getAddress(){
		return get("ADDRESS");
	}
	
	public void setAddress(String value){
		set("ADDRESS",value);
	}
	
	public  Double getLongitude(){
		return get("LONGITUDE");
	}
	
	public void setLongitude(Double value){
		set("LONGITUDE",value);
	}
	
	public  Float getSalary(){
		return get("SALARY");
	}
	
	public void setSalary(Float value){
		set("SALARY",value);
	}
	
	public  Double getLatitude(){
		return get("LATITUDE");
	}
	
	public void setLatitude(Double value){
		set("LATITUDE",value);
	}
	

}

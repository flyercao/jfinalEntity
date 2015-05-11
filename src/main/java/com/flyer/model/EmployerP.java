package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class EmployerP extends Model<EmployerP>{
	public static final EmployerP dao = new EmployerP();
	

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
	
	public  String getPhone(){
		return get("PHONE");
	}
	
	/**
	* @Description: 电话号码
	*/
	public void setPhone(String value){
		set("PHONE",value);
	}
	
	public  String getAddress(){
		return get("ADDRESS");
	}
	
	/**
	* @Description: 通信地址
	*/
	public void setAddress(String value){
		set("ADDRESS",value);
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
	

}

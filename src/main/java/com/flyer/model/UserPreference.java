package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class UserPreference extends Model<UserPreference>{
	public static final UserPreference dao = new UserPreference();
	

	public  Long getId(){
		return get("ID");
	}
	
	public void setId(Long value){
		set("ID",value);
	}
	
	public  String getCurrentRole(){
		return get("CURRENT_ROLE");
	}
	
	/**
	* @Description: 用户当前的角色，1，找工者；2，招工者
	*/
	public void setCurrentRole(String value){
		set("CURRENT_ROLE",value);
	}
	
	public  String getSystemUid(){
		return get("SYSTEM_UID");
	}
	
	/**
	* @Description: 系统自动生成的用户ID
	*/
	public void setSystemUid(String value){
		set("SYSTEM_UID",value);
	}
	

}

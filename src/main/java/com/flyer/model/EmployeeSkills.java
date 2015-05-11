package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class EmployeeSkills extends Model<EmployeeSkills>{
	public static final EmployeeSkills dao = new EmployeeSkills();
	

	public  Integer getSkillId(){
		return get("SKILL_ID");
	}
	
	/**
	* @Description: 技能ID
	*/
	public void setSkillId(Integer value){
		set("SKILL_ID",value);
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
	

}

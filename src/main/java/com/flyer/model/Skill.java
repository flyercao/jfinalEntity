package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Skill extends Model<Skill>{
	public static final Skill dao = new Skill();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  String getName(){
		return get("NAME");
	}
	
	/**
	* @Description: 技能名称
	*/
	public void setName(String value){
		set("NAME",value);
	}
	

}

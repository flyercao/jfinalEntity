package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class JobCategory extends Model<JobCategory>{
	public static final JobCategory dao = new JobCategory();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  Integer getParentId(){
		return get("PARENT_ID");
	}
	
	public void setParentId(Integer value){
		set("PARENT_ID",value);
	}
	
	public  String getLevel(){
		return get("LEVEL");
	}
	
	public void setLevel(String value){
		set("LEVEL",value);
	}
	
	public  String getName(){
		return get("NAME");
	}
	
	public void setName(String value){
		set("NAME",value);
	}
	

}

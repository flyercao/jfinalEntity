package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Test extends Model<Test>{
	public static final Test dao = new Test();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  String getPassword(){
		return get("password");
	}
	
	public void setPassword(String value){
		set("password",value);
	}
	
	public  String getName(){
		return get("name");
	}
	
	public void setName(String value){
		set("name",value);
	}
	

}

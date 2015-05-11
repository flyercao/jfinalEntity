package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class EmployeeZones extends Model<EmployeeZones>{
	public static final EmployeeZones dao = new EmployeeZones();
	

	public  Integer getZoneId(){
		return get("ZONE_ID");
	}
	
	public void setZoneId(Integer value){
		set("ZONE_ID",value);
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

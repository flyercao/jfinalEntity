package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Zone extends Model<Zone>{
	public static final Zone dao = new Zone();
	

	public  Integer getId(){
		return get("ID");
	}
	
	/**
	* @Description: 自动编号
	*/
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  Integer getParentId(){
		return get("PARENT_ID");
	}
	
	/**
	* @Description: 上级区域ID
	*/
	public void setParentId(Integer value){
		set("PARENT_ID",value);
	}
	
	public  Float getCenterLongitude(){
		return get("CENTER_LONGITUDE");
	}
	
	/**
	* @Description: 区域中心的地理位置坐标经度
	*/
	public void setCenterLongitude(Float value){
		set("CENTER_LONGITUDE",value);
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
	
	/**
	* @Description: 名字
	*/
	public void setName(String value){
		set("NAME",value);
	}
	
	public  Float getCenterLatitude(){
		return get("CENTER_LATITUDE");
	}
	
	/**
	* @Description: 区域中心的地理位置坐标纬度
	*/
	public void setCenterLatitude(Float value){
		set("CENTER_LATITUDE",value);
	}
	
	public  Integer getScopeRadius(){
		return get("SCOPE_RADIUS");
	}
	
	/**
	* @Description: 区域范围的半径
	*/
	public void setScopeRadius(Integer value){
		set("SCOPE_RADIUS",value);
	}
	

}

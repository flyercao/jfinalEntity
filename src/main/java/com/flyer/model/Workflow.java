package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Workflow extends Model<Workflow>{
	public static final Workflow dao = new Workflow();
	

	public  Integer getActionby(){
		return get("ACTIONBY");
	}
	
	public void setActionby(Integer value){
		set("ACTIONBY",value);
	}
	
	public  Integer getEvaluate(){
		return get("EVALUATE");
	}
	
	public void setEvaluate(Integer value){
		set("EVALUATE",value);
	}
	
	public  Integer getCancel(){
		return get("CANCEL");
	}
	
	public void setCancel(Integer value){
		set("CANCEL",value);
	}
	
	public  Integer getQuit(){
		return get("QUIT");
	}
	
	public void setQuit(Integer value){
		set("QUIT",value);
	}
	
	public  Integer getCreate(){
		return get("CREATE");
	}
	
	public void setCreate(Integer value){
		set("CREATE",value);
	}
	
	public  Integer getId(){
		return get("ID");
	}
	
	/**
	* @Description: 订单流程表
	*/
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  Integer getSignin(){
		return get("SIGNIN");
	}
	
	public void setSignin(Integer value){
		set("SIGNIN",value);
	}
	
	public  Integer getBreakcontract(){
		return get("BREAKCONTRACT");
	}
	
	public void setBreakcontract(Integer value){
		set("BREAKCONTRACT",value);
	}
	
	public  Integer getDeal(){
		return get("DEAL");
	}
	
	public void setDeal(Integer value){
		set("DEAL",value);
	}
	
	public  Integer getConfirmpay(){
		return get("CONFIRMPAY");
	}
	
	public void setConfirmpay(Integer value){
		set("CONFIRMPAY",value);
	}
	
	public  String getAction(){
		return get("ACTION");
	}
	
	public void setAction(String value){
		set("ACTION",value);
	}
	
	public  Integer getPay(){
		return get("PAY");
	}
	
	public void setPay(Integer value){
		set("PAY",value);
	}
	
	public  Integer getConfirmsign(){
		return get("CONFIRMSIGN");
	}
	
	public void setConfirmsign(Integer value){
		set("CONFIRMSIGN",value);
	}
	
	public  Integer getActionnumber(){
		return get("ACTIONNUMBER");
	}
	
	public void setActionnumber(Integer value){
		set("ACTIONNUMBER",value);
	}
	

}

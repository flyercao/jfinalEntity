package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class CommentScore extends Model<CommentScore>{
	public static final CommentScore dao = new CommentScore();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  Integer getTotal(){
		return get("TOTAL");
	}
	
	public void setTotal(Integer value){
		set("TOTAL",value);
	}
	
	public  String getSystemUid(){
		return get("SYSTEM_UID");
	}
	
	public void setSystemUid(String value){
		set("SYSTEM_UID",value);
	}
	
	public  Float getScore(){
		return get("SCORE");
	}
	
	public void setScore(Float value){
		set("SCORE",value);
	}
	
	public  Integer getUncheck(){
		return get("UNCHECK");
	}
	
	public void setUncheck(Integer value){
		set("UNCHECK",value);
	}
	
	public  Integer getItemId(){
		return get("ITEM_ID");
	}
	
	public void setItemId(Integer value){
		set("ITEM_ID",value);
	}
	
	public  Integer getChecked(){
		return get("CHECKED");
	}
	
	public void setChecked(Integer value){
		set("CHECKED",value);
	}
	

}

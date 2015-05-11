package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class CommentItem extends Model<CommentItem>{
	public static final CommentItem dao = new CommentItem();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  Integer getCategory(){
		return get("CATEGORY");
	}
	
	/**
	* @Description: 类别，1雇员，2雇主，0打星
	*/
	public void setCategory(Integer value){
		set("CATEGORY",value);
	}
	
	public  String getName(){
		return get("NAME");
	}
	
	public void setName(String value){
		set("NAME",value);
	}
	

}

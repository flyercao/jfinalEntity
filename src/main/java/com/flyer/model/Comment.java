package com.flyer.model;

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class Comment extends Model<Comment>{
	public static final Comment dao = new Comment();
	

	public  Integer getId(){
		return get("ID");
	}
	
	public void setId(Integer value){
		set("ID",value);
	}
	
	public  String getCommenterUid(){
		return get("COMMENTER_UID");
	}
	
	public void setCommenterUid(String value){
		set("COMMENTER_UID",value);
	}
	
	public  Integer getJobId(){
		return get("JOB_ID");
	}
	
	public void setJobId(Integer value){
		set("JOB_ID",value);
	}
	
	public  Integer getReceiverUid(){
		return get("RECEIVER_UID");
	}
	
	public void setReceiverUid(Integer value){
		set("RECEIVER_UID",value);
	}
	
	public  Integer getItemId(){
		return get("ITEM_ID");
	}
	
	/**
	* @Description: 打分项目ID
	*/
	public void setItemId(Integer value){
		set("ITEM_ID",value);
	}
	
	public  Byte getChecked(){
		return get("CHECKED");
	}
	
	public void setChecked(Byte value){
		set("CHECKED",value);
	}
	
	public  Byte getScrore(){
		return get("SCRORE");
	}
	
	public void setScrore(Byte value){
		set("SCRORE",value);
	}
	

}

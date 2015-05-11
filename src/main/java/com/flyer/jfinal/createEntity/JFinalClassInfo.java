package com.flyer.jfinal.createEntity;

import java.util.Map;

/**
 * 
* @ClassName: MyModel 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Flyer_cao
* @date 2015年5月11日 下午4:54:27 
*
 */
public class JFinalClassInfo {
	private String packageName;
	private Map<String,String> columnsNames;
	private String className;
	private Map<String,JFinalAttrInfo> attributes;

	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	public final Map<String, String> getColumnsNames() {
		return columnsNames;
	}
	public final void setColumnsNames(Map<String, String> columnsNames) {
		this.columnsNames = columnsNames;
	}
	public final String getClassName() {
		return className;
	}
	public final void setClassName(String className) {
		this.className = className;
	}
	public final Map<String, JFinalAttrInfo> getAttributes() {
		return attributes;
	}
	public final void setAttributes(Map<String, JFinalAttrInfo> attributes) {
		this.attributes = attributes;
	}

	
}

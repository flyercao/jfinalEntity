package com.flyer.jfinal.createEntity;

public class JFinalAttrInfo {
	private String attribute;
	private String column;
	private String type;
	private int length;
	private String remark;
	
	public final String getAttribute() {
		return attribute;
	}
	public final void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public final String getColumn() {
		return column;
	}
	public final void setColumn(String column) {
		this.column = column;
	}
	public final String getType() {
		return type;
	}
	public final void setType(String type) {
		this.type = type;
	}

	public final int getLength() {
		return length;
	}
	public final void setLength(int length) {
		this.length = length;
	}
	public final String getRemark() {
		return remark;
	}
	public final void setRemark(String remark) {
		this.remark = remark;
	}

	

}

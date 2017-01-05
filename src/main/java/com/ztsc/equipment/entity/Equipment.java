package com.ztsc.equipment.entity;

/**
 * 设备实体类
 * 
 * @author
 * 
 */
public class Equipment {

	private String deciceId; // 设备号

	private String address; // 地点信息

	private String directionCode; // 方向编号

	public String getDeciceId() {
		return deciceId;
	}

	public void setDeciceId(String deciceId) {
		this.deciceId = deciceId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDirectionCode() {
		return directionCode;
	}

	public void setDirectionCode(String directionCode) {
		this.directionCode = directionCode;
	}

}

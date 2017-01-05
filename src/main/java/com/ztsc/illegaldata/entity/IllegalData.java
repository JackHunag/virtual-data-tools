package com.ztsc.illegaldata.entity;

import java.util.Date;

/**
 * 违法数据实体类
 * 
 * @author hsssf
 * 
 */
public class IllegalData {

	private String deviceId; //设备号

	private Date catchTime; //当前时间

	private int directionCode; //方向编号

	private int laneNo; //车道号

	private int redLightTime; //红灯持续时间

	private int limitSpeed; //限速值

	private int speed; //违法类型

	private int illegalCode; //车标

	private int carLogo; //车身颜色

	private int securityCode; //防伪码

	private String plateNo; //车牌号

	private int plateColor; //车牌颜色

	private int plateType; //车牌类型

	private String address; //地点信息

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Date getCatchTime() {
		return catchTime;
	}

	public void setCatchTime(Date catchTime) {
		this.catchTime = catchTime;
	}

	public int getDirectionCode() {
		return directionCode;
	}

	public void setDirectionCode(int directionCode) {
		this.directionCode = directionCode;
	}

	public int getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}

	public int getRedLightTime() {
		return redLightTime;
	}

	public void setRedLightTime(int redLightTime) {
		this.redLightTime = redLightTime;
	}

	public int getLimitSpeed() {
		return limitSpeed;
	}

	public void setLimitSpeed(int limitSpeed) {
		this.limitSpeed = limitSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIllegalCode() {
		return illegalCode;
	}

	public void setIllegalCode(int illegalCode) {
		this.illegalCode = illegalCode;
	}

	public int getCarLogo() {
		return carLogo;
	}

	public void setCarLogo(int carLogo) {
		this.carLogo = carLogo;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public int getPlateColor() {
		return plateColor;
	}

	public void setPlateColor(int plateColor) {
		this.plateColor = plateColor;
	}

	public int getPlateType() {
		return plateType;
	}

	public void setPlateType(int plateType) {
		this.plateType = plateType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

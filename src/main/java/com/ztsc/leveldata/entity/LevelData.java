package com.ztsc.leveldata.entity;

import java.util.Date;

/**
 * 卡口数据实体类
 * 
 * @author
 * 
 */
public class LevelData {

	private int recoredId; // 记录号

	private int alarmType; // 违法类型

	private int deviceId; // 设备号

	private int directionCode; // 方向编号

	private String plateNo; // 车牌号码

	private Date catchTime; // 时间

	private int laneNo; // 车道

	private int speed; // 车速值

	private int limitSpeed; // 限速值

	private String featurePic; // 卡口数据图片描述信息

	private String panoramaPic; // 卡口数据图片概括信息

	private int plateColor; // 车牌颜色

	private String address; // 地点信息

	public int getRecoredId() {
		return recoredId;
	}

	public void setRecoredId(int recoredId) {
		this.recoredId = recoredId;
	}

	public int getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(int alarmType) {
		this.alarmType = alarmType;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getDirectionCode() {
		return directionCode;
	}

	public void setDirectionCode(int directionCode) {
		this.directionCode = directionCode;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public Date getCatchTime() {
		return catchTime;
	}

	public void setCatchTime(Date catchTime) {
		this.catchTime = catchTime;
	}

	public int getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLimitSpeed() {
		return limitSpeed;
	}

	public void setLimitSpeed(int limitSpeed) {
		this.limitSpeed = limitSpeed;
	}

	public String getFeaturePic() {
		return featurePic;
	}

	public void setFeaturePic(String featurePic) {
		this.featurePic = featurePic;
	}

	public String getPanoramaPic() {
		return panoramaPic;
	}

	public void setPanoramaPic(String panoramaPic) {
		this.panoramaPic = panoramaPic;
	}

	public int getPlateColor() {
		return plateColor;
	}

	public void setPlateColor(int plateColor) {
		this.plateColor = plateColor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

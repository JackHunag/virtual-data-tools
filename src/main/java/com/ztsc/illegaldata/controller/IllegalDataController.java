package com.ztsc.illegaldata.controller;

import java.io.File;

import com.ztsc.illegaldata.entity.IllegalData;

/**
 * 违法数据的控制类
 * 
 * @author
 * 
 */
public class IllegalDataController {

	/**
	 * 启动违法数据模块
	 * 
	 */
	public void runIllegalDataTask() {

	}

	/***
	 * 
	 * 组装水印信息
	 * 
	 * @param illegalData
	 *            违法数据实体类
	 * @return
	 */
	public String assembleIllegalInfo(IllegalData illegalData) {
		return null;

	}

	/**
	 * 提供违法图片和视频
	 * 
	 * @param image
	 *            违法图片和视频 文件
	 * @param fileNmae
	 *            文件名前缀
	 */
	public void createIllegalResoure(File image, String fileName) {

	}

	/**
	 * 保存违法数据
	 * 
	 * @param illegalData
	 *            违法数据实体类
	 */
	public void saveIllegalData(IllegalData illegalData) {

	}

	/**
	 * 生成文件命名前缀
	 * 
	 * @param illegalData
	 *            违法数据实体类
	 * @return
	 */
	public String createFileNmae(IllegalData illegalData) {
		return null;

	}
}

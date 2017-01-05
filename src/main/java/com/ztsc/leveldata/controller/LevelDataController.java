package com.ztsc.leveldata.controller;

import java.io.File;

import com.ztsc.leveldata.entity.LevelData;

/**
 * 违法数据的控制类
 * 
 * @author
 * 
 */
public class LevelDataController {

	/**
	 * 启动卡口数据模块
	 */
	public void runLevelDataTask() {

	}

	/**
	 * 生成过车消息 - xml字符串数据
	 * 
	 * @param levelData
	 *            卡口数据实体类
	 * @return xml字符串数据
	 */
	public String writeXml(LevelData levelData) {
		return null;

	}

	/**
	 * 组装水印信息
	 * 
	 * @param levelData
	 *            卡口数据实体类
	 * @return 水印信息
	 */
	public String assembleLevelInfo(LevelData levelData) {
		return null;

	}

	/**
	 * 提供卡口图片（合成卡口数据水印图）
	 * 
	 * @param image
	 *            卡开过车图片
	 * @param fileName
	 *            文件名前缀
	 */
	public void createLevelPhoto(File image, String fileName) {

	}

	/**
	 * 保存卡口数据
	 */
	public void saveLevelData() {

	}

	/**
	 * 生成文件命名前缀
	 * 
	 * @return 文件名前缀字符串
	 */
	public String createFileNmae() {
		return null;

	}

	/**
	 * 解析xml字符串
	 * 
	 * @return 卡口数据实体类
	 */
	public LevelData readXmlString() {
		return null;

	}
}

package com.ztsc.leveldata.dao;

import com.ztsc.leveldata.entity.LevelData;

/**
 * 处理卡口数据接口类
 * 
 * @author
 * 
 */
public interface LevelDataDao {

	/**
	 * 插入过车消息数据
	 * 
	 * @param levelData
	 *            卡口数据实体类
	 * @return 影响的行数
	 */
	public int insertLevelData(LevelData levelData);

}

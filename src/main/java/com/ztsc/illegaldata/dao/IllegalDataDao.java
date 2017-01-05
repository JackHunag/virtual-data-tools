package com.ztsc.illegaldata.dao;

import com.ztsc.illegaldata.entity.IllegalData;

/**
 * 处理违法数据接口类
 * 
 * @author
 * 
 */

public interface IllegalDataDao {

	/**
	 * 插入违法数据
	 * 
	 * @return 影响的行数
	 */
	public int insertIllegalData(IllegalData illegalData);
}

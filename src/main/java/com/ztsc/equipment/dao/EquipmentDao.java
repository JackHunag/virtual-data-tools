package com.ztsc.equipment.dao;

import com.ztsc.equipment.entity.Equipment;

/**
 * 处理设备类接口
 * 
 * @author
 * 
 */
public interface EquipmentDao {

	/**
	 * 插入设备信息数据
	 * 
	 * @return 影响的行数
	 */
	public int insertEquipment();

	/**
	 * 通过设备号查询设备详情
	 * 
	 * @param driverId
	 *            设备号
	 * @return 设备详情信息
	 */
	public Equipment findEquipmentById(String driverId);
}

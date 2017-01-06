package com.ztsc.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.ztsc.leveldata.controller.LevelDataController;
import com.ztsc.leveldata.entity.LevelData;

public class TestLevelData {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		 LevelDataController levelDataController = new LevelDataController();
		   LevelData levelData = new LevelData();
		   levelData.setCatchTime(new Date());
		   levelData.setPlateNo("粤 Y348F9");
		   levelData.setPlateColor(0);
		   levelData.setPlateType(1);
		   levelData.setAddress("狮山大学城");
		   levelData.setLaneNo(2);
		 String levelInfo = levelDataController.assembleLevelInfo(levelData);
		 
		   
		 System.out.println(levelInfo);
		 
	}

}

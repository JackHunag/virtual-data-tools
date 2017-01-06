package com.ztsc.test;

import java.io.File;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.ztsc.common.util.ImageUtils;
import com.ztsc.leveldata.controller.LevelDataController;
import com.ztsc.leveldata.entity.LevelData;

public class TestLevelController {

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
		String levelInfo  = levelDataController.assembleLevelInfo(levelData);

		LevelData levelData1 = new LevelData();
		
		levelData1.setCatchTime(new Date());
		levelData1.setDirectionCode(0);
		levelData1.setLaneNo(1);
		levelData1.setLimitSpeed(30);
		levelData1.setSpeed(3);
		levelData1.setAlarmType(2);
		levelData1.setPlateNo("粤 Y348F9");
		levelData1.setPlateColor(3);
		String fileNmae = levelDataController.createFileNmae(levelData1);
		File image = ImageUtils.getBlankImage();


	 ImageUtils.save(ImageUtils.markImage(image, levelInfo),
			 fileNmae, "image\\ghgffh");
	}

}

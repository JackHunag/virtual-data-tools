package com.ztsc.test;

import org.junit.Before;
import org.junit.Test;

import com.ztsc.illegaldata.entity.IllegalData;
import com.ztsc.leveldata.entity.LevelData;
import com.ztsc.virtualdata.VirtualDataUtils;

public class TestVirtualdata {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

		VirtualDataUtils virtualDataUtils = new VirtualDataUtils();
		
		IllegalData randomIllegalData = virtualDataUtils.randomIllegalData();
		
		LevelData randomLevelData = virtualDataUtils.randomLevelData();
		
		
		if (randomLevelData != null) {

			System.out.println(randomLevelData.toString());
		} else {
			System.out.println("随机生成数据失败");
		}
		
		if (randomIllegalData != null) {

			System.out.println(randomIllegalData.toString());
		} else {
			System.out.println("随机生成数据失败");
		}

	}

}

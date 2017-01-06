package com.ztsc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ztsc.illegaldata.entity.IllegalData;
import com.ztsc.virtualdata.VirtualDataUtils;

public class TestRandomData {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

      VirtualDataUtils virtualDataUtils = new VirtualDataUtils();
      
      IllegalData data = virtualDataUtils.randomIllegalData();
      
       System.out.println(data.toString());
	}

}

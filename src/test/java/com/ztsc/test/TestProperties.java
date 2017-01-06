package com.ztsc.test;


import org.junit.Before;
import org.junit.Test;

import com.ztsc.common.util.PropertiesUtil;

public class TestProperties {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		PropertiesUtil propertiesUtil = new PropertiesUtil("config.properties");
		
		String property = propertiesUtil.getProperty("bayonet");
		
		System.out.println(property);
		
		
	
		
		
		 
	}

}

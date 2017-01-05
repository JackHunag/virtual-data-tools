package com.ztsc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ztsc.VirtualDataTools;

public class TestRun {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		VirtualDataTools virtualDataTools = new VirtualDataTools();
		
		virtualDataTools.run();
	}

}

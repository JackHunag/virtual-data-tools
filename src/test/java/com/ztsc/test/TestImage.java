package com.ztsc.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.ztsc.common.util.ImageUtils;

public class TestImage {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

		File image = ImageUtils.getBlankImage();
//
	File markImage = ImageUtils.markImage(image, "sc");

		String save = ImageUtils.save(ImageUtils.markImage(image, "fdfdgdhd"), "images.jpeg", "IllegalData\\pic");
//		
//		
//		
//		System.out.println(save);
		
	}

}

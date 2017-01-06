package com.ztsc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ztsc.leveldata.controller.LevelDataController;
import com.ztsc.leveldata.entity.LevelData;

public class TestXml {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

		LevelDataController controller = new LevelDataController();

		String xmlString = "<message> "
				+ "<head> "
				+ "<code>DS1005</code> "
				+ " <version>2.0.0.0</version> "
				+ "</head>"
				+ " <body>"
				+ " <content> "
				+ "<recordId>0</recordId> "
				+ "<alarmType>0</alarmType>"
				+ "<deviceId>11058</deviceId> "
				+ "<directionCode>3</directionCode>"
				+ "<plateNo>粤 Y348F9</plateNo> "
				+ "<plateColor>0</plateColor> "
				+ "<catchTime>20161208100638</catchTime>"
				+ " <laneNo>2</laneNo>"
				+ " <speed>0</speed> "
				+ "<limitSpeed>0</limitSpeed> "
				+ "<featurePic> <![CDATA[R11058T201612081006380D3L02I000V000A0&粤 Y348F9@@@@&0.K.H.jpg]]> </featurePic> "
				+ "<panoramaPic> <![CDATA[R11058T201612081006380D3L02I000V000A0&粤 Y348F9@@@@&0.K.H.jpg]]>  </panoramaPic> "
				+ " </content> " + " </body> " + "</message>";

		 LevelData levelData = controller.readXmlString(xmlString);
		 
		 System.out.println("-------------------------------------------");
		 
		 String writeXml = controller.writeXml(levelData);
		
		 
		 
	}

}

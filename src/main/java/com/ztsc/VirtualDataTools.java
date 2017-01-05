
package com.ztsc;

import com.ztsc.common.util.PropertiesUtil;



/**
 * @author hsssf
 *
 */
public class VirtualDataTools {

	
	public void run() {
		 
		PropertiesUtil propertiesUtil = new PropertiesUtil("config.properties");
		
		String peccancy_data = propertiesUtil.getProperty("peccancy_data");
		String watermark = propertiesUtil.getProperty("watermark");
		String bayonet = propertiesUtil.getProperty("bayonet");
		
		    if(peccancy_data.contains("true")){
		    	 System.out.println("peccancy_data");
		    	 
		    	 propertiesUtil.setProperty("peccancy_data", "false");
		    }
		   

		    if(watermark.contains("true")){
		    	System.out.println("watermark");
		    }
		    
            if(bayonet.contains("true")){
            	System.out.println("bayonet");
		    }
	}
}

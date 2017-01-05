package com.ztsc.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties工具类
 * 
 * @author
 * 
 */
public class PropertiesUtil {

	private static Properties env = new Properties();
	private static String fileProperties;
	private static String path = System.getProperty("user.dir")
			+ "/src/main/resources/config/";


	// 参数实例化类时 fileProperties为要读的文件名
	public PropertiesUtil(String fileProperties) {
		this.fileProperties = fileProperties;

		FileInputStream in = null;
		try {
			in = new FileInputStream(path + fileProperties);
			env.load(in);
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	/**
	 * 取属性值
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		return env.getProperty(key);
	}

	/**
	 * 设置属性值
	 * 
	 * @param key
	 * @param value
	 */
	public static void setProperty(String key, String value) {
        
		
		File file = new File(path + fileProperties);
		FileOutputStream outStream;
		try {
			outStream = new FileOutputStream(file);
			env.setProperty(key, value);
			// 写入properties文件
			env.store(outStream, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

}

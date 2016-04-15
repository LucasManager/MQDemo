package com.apl.convert.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	/**
	 * 
	 * @return prop
	 */
	public static Properties getProperties(String name) {
		Properties prop = new Properties();
		InputStream in;
		try {
			in = new BufferedInputStream(new FileInputStream(name));
			prop.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}

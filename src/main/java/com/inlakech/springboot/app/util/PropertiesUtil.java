package com.inlakech.springboot.app.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	private Properties prop;
	
	public PropertiesUtil(){
		readPropertiesFile();
	}
	
	public void readPropertiesFile() {
		prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("./src/test/resources/config.properties");

			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public String getProperty(String name) {
		return prop.getProperty(name);
	}
}
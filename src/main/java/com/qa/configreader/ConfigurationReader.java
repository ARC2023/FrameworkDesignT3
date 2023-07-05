package com.qa.configreader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties prop;

	public Properties setUpPropertiesFile() {

		prop = new Properties();

		try {
			FileInputStream in = new FileInputStream(
					"C:\\Users\\glend\\eclipse-workspace\\CucumberFrameworkTesting3\\src\\main\\resources\\configuration\\config.properties");

			prop.load(in);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return prop;
	}
	
	public static ConfigurationReader getInstance() {
		
		return new ConfigurationReader();
	}
	

}

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
			System.out.println("File inserted into Stream");
			prop.load(in);
			System.out.println("Properties file loaded for use");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return prop;
	}
	
	public static ConfigurationReader getInstance() {
		
		return new ConfigurationReader();
	}
	

	public static String getConfigProp(String propValue) {
		ConfigurationReader cg = new ConfigurationReader();
		Properties prope =	cg.setUpPropertiesFile();
		String value=prope.getProperty(propValue);
		return value;
		
		
		//return getInstance().setUpPropertiesFile().getProperty(propValue);
		
	}
	
	
}

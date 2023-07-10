package com.qa.driverhandling;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.configreader.ConfigurationReader;

public class Driverhandler {
	

	public static WebDriver driver ;

	public WebDriver launchBrowser(String browser, String URL) {

		System.out.println("Browser value is: " + browser);

		switch (browser) {

		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			option.setExperimentalOption("excludeSwitches",
					Arrays.asList("disable-popup-blocking", "enable-automation"));
			System.out.println("Chrome Options set");
			driver=new ChromeDriver(option);
			System.out.println("Browser launched");
			driver.manage().deleteAllCookies();
			driver.get(URL);
			System.out.println("URL Loaded");
			break;

		case "firefox":

			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.get(URL);
			break;

		case "edge":

			driver=new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.get(URL);
			break;
		default:
			System.out.println("Entered browser doient match any Case");
			break;
		}

		return driver;

	}

	

	public static  void quitDriver() {
		driver.quit();
	}
	
	
	public static Driverhandler getInstance() {

		return new Driverhandler();
	}

}

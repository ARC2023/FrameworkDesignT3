package com.qa.driverhandling;

import java.util.Arrays;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.configreader.ConfigurationReader;

public class Driverhandler {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public WebDriver launchBrowser(String browser, String URL) {

		System.out.println("Browser value is: " + browser);
		switch (browser) {

		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			option.setExperimentalOption("excludeSwitches",
					Arrays.asList("disable-popup-blocking", "enable-automation"));
			driver.set(new ChromeDriver(option));
			getDriver().manage().deleteAllCookies();
			getDriver().get(URL);
			break;

		case "firefox":

			driver.set(new FirefoxDriver());
			break;

		case "edge":

			driver.set(new EdgeDriver());
			break;
		default:
			System.out.println("Entered browser doient match any Case");
			break;
		}

		return getDriver();

	}

	public static synchronized WebDriver getDriver() {
		return driver.get();
	}

	
public static Driverhandler getInstance() {
		
		return new Driverhandler();
	}
	
}

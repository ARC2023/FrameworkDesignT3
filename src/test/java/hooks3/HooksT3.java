package hooks3;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.configreader.ConfigurationReader;
import com.qa.driverhandling.Driverhandler;
import io.cucumber.java.*;
import screenshotutils.ScreenShot;

public class HooksT3 {
	

	public String browser;
	public String URL;
	public static String folderName;
	WebDriver driver;
	
	
	@Before(order=0)
	public void setUpProp(Scenario sc) {
		folderName=	sc.getName();
		ConfigurationReader.getInstance().setUpPropertiesFile();
		browser=ConfigurationReader.prop.getProperty("browser");
		URL=ConfigurationReader.prop.getProperty("URL");
		
	}
	
	@Before(order=1)
	public void setUpDriver() {
		
		driver=Driverhandler.getInstance().launchBrowser(browser, URL);
		
	}

	
	@After(order=1)
	public void setCounter() {
		
		ScreenShot.counter=1;
		
	}
	

	@After(order=0)
	public void tearDown(Scenario sc) throws IOException {
		
		if(sc.isFailed()) {
			System.out.println(sc.getStatus());
			ScreenShot.takeScreenShotOnFailure();
			try {
				// this method invokes screenshot upon failure
				ScreenShot.takeScreenShotOnFailure();
				/* This code is to attach the failure page screenshot to report */
				String screenshotName = sc.getName().replaceAll(" ", "_");
				byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				sc.attach(sourcePath, "image/png", screenshotName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println(sc.getStatus());
		}
		Driverhandler.quitDriver();
	}
	
	
	
}

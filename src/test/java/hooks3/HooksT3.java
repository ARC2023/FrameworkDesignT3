package hooks3;

import java.io.IOException;

import com.qa.configreader.ConfigurationReader;
import com.qa.driverhandling.Driverhandler;
import io.cucumber.java.*;
import screenshotutils.ScreenShot;

public class HooksT3 {
	

	public String browser;
	public String URL;
	public static String folderName;
	
	
	@Before(order=0)
	public void setUpProp(Scenario sc) {
		folderName=	sc.getName();
		ConfigurationReader.getInstance().setUpPropertiesFile();
		browser=ConfigurationReader.prop.getProperty("browser");
		URL=ConfigurationReader.prop.getProperty("URL");
		
	}
	
	@Before(order=1)
	public void setUpDriver() {
		
		Driverhandler.getInstance().launchBrowser(browser, URL);
		
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
			
		}
		else {
			System.out.println(sc.getStatus());
		}
		Driverhandler.quitDriver();
	}
	
	
	
}

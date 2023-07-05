package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.configreader.ConfigurationReader;
import com.qa.driverhandling.Driverhandler;

import io.cucumber.java.*;

public class HooksT3 {

	
	public static Properties prop;
	public static WebDriver driver;
	public String browser;
	public String URL;
	
	@Before(order=0)
	public void setUpProp() {
			
		prop=ConfigurationReader.getInstance().setUpPropertiesFile();
	}
	
	@Before(order=1)
	public void setUpDriver() {
		
		browser=prop.getProperty("browser");
		URL=prop.getProperty("URL");
		driver=Driverhandler.getInstance().launchBrowser(browser, URL);
	}

	
	
	
}

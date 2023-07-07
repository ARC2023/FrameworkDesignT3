package hooks3;

import com.qa.configreader.ConfigurationReader;
import com.qa.driverhandling.Driverhandler;
import io.cucumber.java.*;

public class HooksT3 {
	

	public String browser;
	public String URL;
	
	@Before(order=0)
	public void setUpProp() {
			
		ConfigurationReader.getInstance().setUpPropertiesFile();
		browser=ConfigurationReader.prop.getProperty("browser");
		URL=ConfigurationReader.prop.getProperty("URL");
		
	}
	
	@Before(order=1)
	public void setUpDriver() {
		
		Driverhandler.getInstance().launchBrowser(browser, URL);
		
	}

	
	
	
}

package stepdefinition;

import io.cucumber.java.en.*;
import screenshotutils.ScreenShot;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.qa.configreader.ConfigurationReader;
import com.qa.commonpages.CommonPages;

public class CommonMethods {

	CommonPages common = new CommonPages();
	String logo;
	String UN;
	String PW;

	@Given("User lands on Sign In page of SL")
	public void user_lands_on_sign_in_page_of_sl() throws IOException {

		logo = ConfigurationReader.getConfigProp("HomeLogoLabel");
		Assert.assertEquals(logo, common.getHomeLogoText());
		ScreenShot.takeScreenShot();
	}

	@When("User enters UserName")
	public void user_enters_user_name() throws IOException {
		UN = ConfigurationReader.getConfigProp("UserName");
		common.sendUserNameValue(UN);
		ScreenShot.takeScreenShot();
	}

	@When("User enters Password")
	public void user_enters_password() throws IOException {
		PW = ConfigurationReader.getConfigProp("PassWord");
		common.sendPassWordValue(PW);
		ScreenShot.takeScreenShot();
	}

	@Then("User is logged in to home page of sauce labs")
	public void user_is_logged_in_to_home_page_of_sauce_labs() throws Exception {
		common.clickLogInBtn();
		Thread.sleep(2000);
		ScreenShot.takeScreenShot();
	}

	@Then("Fail The scenario")
	public void fail_the_scenario() throws Exception {
		
		//throw new Exception("Failing");
	}

}

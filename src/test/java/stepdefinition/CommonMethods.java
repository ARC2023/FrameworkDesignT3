package stepdefinition;

import io.cucumber.java.en.*;

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
	public void user_lands_on_sign_in_page_of_sl() {

		logo = ConfigurationReader.getConfigProp("HomeLogoLabel");
		Assert.assertEquals(logo, common.getHomeLogoText());

	}

	@When("User enters UserName")
	public void user_enters_user_name() {
		UN=ConfigurationReader.getConfigProp("UserName");
		common.sendUserNameValue(UN);
	}

	@When("User enters Password")
	public void user_enters_password() {
		PW=ConfigurationReader.getConfigProp("PassWord");
		common.sendPassWordValue(PW);
	}

	@Then("User is logged in to home page of sauce labs")
	public void user_is_logged_in_to_home_page_of_sauce_labs() {
		common.clickLogInBtn();
	}

}

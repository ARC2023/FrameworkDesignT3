package com.qa.commonpages;

import org.openqa.selenium.By;
import com.qa.driverhandling.Driverhandler;

public class CommonPages extends Driverhandler {

	private By HomeLogo = By.xpath("//div[text()='Swag Labs']");
	private By userNameTxtbox = By.id("user-name");
	private By passWordTxtbox = By.id("password");
	private By logInBtn = By.id("login-button");

	public String getHomeLogoText() {

		System.out.println(getDriver().findElement(HomeLogo).getText());
		return getDriver().findElement(HomeLogo).getText();

	}

	public void sendUserNameValue(String value) {

		getDriver().findElement(userNameTxtbox).sendKeys(value);

	}

	public void sendPassWordValue(String value) {

		getDriver().findElement(passWordTxtbox).sendKeys(value);

	}

	public void clickLogInBtn() {

		getDriver().findElement(logInBtn).click();
	}
}

package com.qa.commonpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driverhandling.Driverhandler;

public class CommonPages extends Driverhandler {

	/*
	 * private By HomeLogo = By.xpath("//div[text()='Swag Labs']"); private By
	 * userNameTxtbox = By.id("user-name"); private By passWordTxtbox =
	 * By.id("password"); private By logInBtn = By.id("login-button");
	 */

	@FindBy(xpath = "//div[text()='Swag Labs']")
	private WebElement HomeLogo;

	@FindBy(id = "user-name")
	private WebElement userNameTxtbox;

	@FindBy(id = "password")
	private WebElement passWordTxtbox;

	@FindBy(id = "login-button")
	private WebElement logInBtn;

	public CommonPages() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String getHomeLogoText() {

		return HomeLogo.getText();
		
		//System.out.println(driver.findElement(HomeLogo).getText());
		//return driver.findElement(HomeLogo).getText();

	}

	public void sendUserNameValue(String value) {

		//driver.findElement(userNameTxtbox).sendKeys(value);
		userNameTxtbox.sendKeys(value);
		
	}

	public void sendPassWordValue(String value) {

		//driver.findElement(passWordTxtbox).sendKeys(value);
		passWordTxtbox.sendKeys(value);
	}

	public void clickLogInBtn() {

		//driver.findElement(logInBtn).click();
		
		logInBtn.click();
	}
}

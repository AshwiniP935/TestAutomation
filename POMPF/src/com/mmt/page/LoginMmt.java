package com.mmt.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginMmt {

	WebDriver driver;

	public LoginMmt(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "txtLogin")
	WebElement username;
	@FindBy(how = How.ID, using = "txtPassword")
	WebElement Password;
	@FindBy(how = How.ID, using = "submitBtn")
	WebElement Signin;

	public void login(String uname, String pwd) {
		username.sendKeys(uname);
		Password.sendKeys(pwd);
		Signin.click();
	}
}

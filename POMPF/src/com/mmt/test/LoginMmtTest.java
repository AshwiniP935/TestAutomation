package com.mmt.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mmt.page.LoginMmt;

import helper.BrowserOption;

public class LoginMmtTest {
	@Test
	public void verifyLogin()
	{
		WebDriver driver =BrowserOption.StartBrowser("IE", "http://localhost/login.html?autoLoginOff=1");
		LoginMmt loginob =PageFactory.initElements(driver, LoginMmt.class);
		
		loginob.login("admin","1234");
		
		
	}

}

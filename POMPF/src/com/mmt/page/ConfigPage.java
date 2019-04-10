package com.mmt.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfigPage {
	WebDriver driver;

	public ConfigPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(how = How.CLASS_NAME, using = "vms-nav-button-link text-overflow")
	WebElement ConfigTab;
	
	
	
	public void GoToConfigTab()
	{
		
		
	}
	
}

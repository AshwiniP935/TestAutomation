package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOption {

	static WebDriver  driver;
	public static WebDriver StartBrowser(String Browsername,String url)
	{
		if(Browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		else if (Browsername.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (Browsername.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("webdriver.ie.driver", "D://IEDriverServer_Win32_3.9.0//IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window(). maximize();
		driver.get(url);
		return driver;
	}
}

package com.dezlearn.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.dezlearn.lib.AppLib;
import com.dezlearn.pages.Ebay_Advanced_Search_Page;
import com.dezlearn.pages.Ebay_Home_Page;
import com.dezlearn.pages.Ebay_Search_Result_Page;

public class AbstractBaseTest {
	
	WebDriver driver;
	private AppLib app;
	
	@Parameters({"browser", "driverexe"})
	@BeforeMethod(alwaysRun=true)
	public void setUp(@Optional("Chrome") String browser,
			   @Optional("G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\") String exe) throws Exception
	{
		if (browser.equals("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", exe);
				driver = new ChromeDriver(); 	
		} else if (browser.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", exe);
			driver = new FirefoxDriver(); 	
		}
       
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        app = new AppLib(driver);
		
	}
	
    @AfterMethod(alwaysRun=true)
	public void teardown() {
	driver.close();
	}
    
    public AppLib App() {
    	return app;
    }

}

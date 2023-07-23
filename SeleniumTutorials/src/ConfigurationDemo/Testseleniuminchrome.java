package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ConfigReader;

public class Testseleniuminchrome 
{
	ConfigReader config;
	
	@BeforeTest
	public void setUp()
	{
	 config =new ConfigReader();
	 System.setProperty("webdriver.chrome.driver", config.getChromePath());
	 System.out.println("======SetUp Ready=====");
	}
	
	@Test
	public void testChrome() throws Exception
	
	{
		System.out.println("======Test Started=====");
		WebDriver driver=new ChromeDriver();
		driver.get(config.getApplicationUrl());
		driver.quit();
		System.out.println("======Test Closed=====");
	}

}

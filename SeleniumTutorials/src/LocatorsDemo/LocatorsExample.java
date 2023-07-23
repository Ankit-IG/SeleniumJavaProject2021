package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) 
	{

	//To set the webdriver property
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
		// Initialize the driver
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//Id Locator
		
		WebElement uname=driver.findElement(By.id("txtUsername"));
		
		uname.sendKeys("Admin");
		//name Locator--
		
		//By pass=By.name("txtPassword");
		
		//driver.findElement(pass).sendKeys("admin123");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//className -- Many times className wont be unique
		
		driver.findElement(By.className("textInputContainer")).click();
		
		//xPath--
		
		driver.findElement(By.xpath("//*[@id=\'txtUsername\']")).click();
		
		//CSS
		
		driver.findElement(By.cssSelector("#txtUsername")).click();
		
		
		
		
		
		
	}

}

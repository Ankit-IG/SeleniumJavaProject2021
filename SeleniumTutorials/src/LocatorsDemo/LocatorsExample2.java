package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample2 {

	public static void main(String[] args) 
	{

	//To set the webdriver property
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
		// Initialize the driver
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
	   // For last 3 locators--
		//6- linkText
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//7- partialLinkText--
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		
		//8- tagName
		//--for one element
		// driver.findElement(By.tagName("img"));
		
		//--for multiple elements
		System.out.println(driver.findElements(By.tagName("img")).size());
		
		
		
	}

}

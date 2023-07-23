package com.dezlearn.qa.udamyselenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement_LinkName_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.actitime.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Try Free")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		
		driver.findElement(By.id("first-name")).sendKeys("De ZINNIA");
		driver.findElement(By.id("last-name")).sendKeys("Learning");
		driver.findElement(By.id("email")).sendKeys("dezelearn@gmail.com");
		driver.findElement(By.id("company")).sendKeys("De ZINNIA Learning");
		//driver.findElement(By.id("start-trial-submit")).click();
		
	}

}

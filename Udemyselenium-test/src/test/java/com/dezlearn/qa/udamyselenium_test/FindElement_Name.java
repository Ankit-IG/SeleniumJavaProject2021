package com.dezlearn.qa.udamyselenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Name {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       /*
        * Find Element by Name
        * Find Element by Class
        * Using Partial Link text
        * Getting text From Web Element 
        */
		
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("Barbie Dolls");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Barbie Holiday")).click();
		
		Thread.sleep(2000);
		
		String ProductTitle = driver.findElement(By.id("productTitle")).getText();
		
		// String ProductPrice = driver.findElement(By.id("price")).getText();
		
		System.out.println("Product Title is : " + ProductTitle);
		// System.out.println("Product Price is : " + ProductPrice);
		
	}

}

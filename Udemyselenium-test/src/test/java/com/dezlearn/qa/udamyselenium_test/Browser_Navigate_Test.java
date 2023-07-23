package com.dezlearn.qa.udamyselenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigate_Test {

	public static void main(String[] args) {
		/*
		 * Get Method
		 * Navigate Methods - to()/back()/forward()/refresh()
		 */
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();


	}

}

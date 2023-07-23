package com.dezlearn.qa.udamyselenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Basics {

	public static void main(String[] args) {
		/*
		 * 1. Get Page URL
		 * 2. Get Page Title
		 * 3. Get Page Source
		 * 4. Get Page (Window) Handle
		 */

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
	

	}

}

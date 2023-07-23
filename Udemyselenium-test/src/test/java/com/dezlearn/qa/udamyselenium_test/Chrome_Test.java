package com.dezlearn.qa.udamyselenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.dezlearn.com");
        System.out.println(driver.getTitle());
      //  driver.quit();

	}

}

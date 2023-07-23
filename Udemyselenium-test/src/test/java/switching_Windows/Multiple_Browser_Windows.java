package switching_Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Browser_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
			
	        
	         driver.get("https://www.dezlearn.com/multiple-browser-windows/");
	 		
	 		driver.findElement(By.id("u_7_8")).click();
	 		
	 		Set<String> windows = driver.getWindowHandles();
	 		
	 		for(String window : windows) {
	 			System.out.println(window);
	 			driver.switchTo().window(window);
	 			System.out.println(driver.getCurrentUrl());
	 			System.out.println(driver.getTitle());
	 			System.out.println("-------------------");
	 			if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
	 				break;
	 			}
	 		}
	 		
	 		driver.findElement(By.id("email")).sendKeys("wfdjyegahkrsdf");
	 		driver.findElement(By.id("pass")).sendKeys("wqjvwhr");


	}

}

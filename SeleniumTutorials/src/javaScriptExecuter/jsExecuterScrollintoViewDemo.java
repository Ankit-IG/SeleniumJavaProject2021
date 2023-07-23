package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecuterScrollintoViewDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// load browser
		 
		  System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
		    WebDriver driver =new ChromeDriver();
		   
		 
		 // maximize browser
		  driver.manage().window().maximize();
		 
		 
		  // Open Application
		  driver.get("http://jqueryui.com");
		  
		 
		  // Wait for 5 second
		  Thread.sleep(5000);
		 
		 // This  will scroll page 400 pixel vertical
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  js.executeScript("scroll(0,400)");
	}

}

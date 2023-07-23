package iFrameDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class DemoFrames {
	
	public void testFrames()
	{
		

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("file:///C:/Users/Dell/Desktop/Demo.html");
	    
	    //Count of iFrames
	    
	     int elements = driver.findElements(By.tagName("iframe")).size();
	    
	    System.out.println("Total count is "+elements);
	   
	    
	    //By Id or Name
	    driver.switchTo().frame("frames");
	    
	    driver.findElement(By.xpath("//*[@id=\"genesis-mobile-nav-primary\"]")).click();
	    
	    driver.switchTo().defaultContent();
	    	
	    driver.findElement(By.xpath("/html/body/a")).click();
	    
	    
	    
		
		
		
		
	}
	
}

package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	    
	    Thread.sleep(5000);
	   //Initialize actions class
	    Actions act=new Actions(driver);
	    
	  
	   
	    WebElement src=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
	  
	    WebElement dest=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
	    
	    //Drag and Drop method
	    
	    act.dragAndDrop(src, dest).perform();
	    
	   
	 /*  act.clickAndHold(src)
	   .pause(Duration.ofSeconds(2))
	   .moveToElement(dest)
	   .pause(Duration.ofSeconds(2))
	   .release()
	   .build()
	   .perform();
	   
	   */

	}

}

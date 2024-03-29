package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://jqueryui.com/draggable/");
	    
	    Thread.sleep(5000);
	   //Initialize actions class
	    Actions act=new Actions(driver);
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	   
	    //WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
	  
	    
	    //Draggable method
	    
	    act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 300, 150).perform();
	    
	   
	

	}

}

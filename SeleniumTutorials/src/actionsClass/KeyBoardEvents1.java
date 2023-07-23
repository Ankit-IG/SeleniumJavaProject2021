package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	   //Initialize actions class
	    Actions act=new Actions(driver);
	    
	    driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Selenium");
	    
	    
	    //Keyboard Event
	    
	    act.sendKeys(Keys.TAB)
	    .pause(Duration.ofSeconds(2))
	    .sendKeys("Webdriver")
	    .sendKeys(Keys.TAB)
	    .pause(Duration.ofSeconds(2))
	    .sendKeys("9874563210")
	    .sendKeys(Keys.TAB)
	    .pause(Duration.ofSeconds(2))
	    .sendKeys("1234")
	    .build().perform();
	    
	    
	    
	   
	   
	      

	}

}

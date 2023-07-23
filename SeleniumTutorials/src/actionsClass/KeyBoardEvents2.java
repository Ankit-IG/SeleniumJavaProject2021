package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://the-internet.herokuapp.com/key_presses?");
	    
	   //Initialize actions class
	    Actions act=new Actions(driver);
	    
	    act.sendKeys(Keys.ENTER).perform();
	  
	    Thread.sleep(5000);
	    
	    if(driver.findElement(By.xpath("//p[text()='You entered: ENTER']")).getText().contains("ENTER"));
	    
	    {
	      System.out.println("Pressed Enter");    
	   
	   }
          driver.quit();
	}
}

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	    
	   //Initialize actions class
	    Actions act=new Actions(driver);
	    
	    //Right click
	    
	    act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[text()='Copy']")).click();
	    
	    Thread.sleep(2000);
	    
	   System.out.println(driver.switchTo().alert().getText());
	   
	   driver.switchTo().alert().accept();
	   
	   driver.quit();
	   
	      

	}

}

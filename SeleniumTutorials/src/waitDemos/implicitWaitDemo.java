package waitDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitDemo {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	  
	    driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS); 
       
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
   
     
       
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    //Implicit wait is put after get method
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.id("txtUsername")).sendKeys("Selenium");
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("Selenium");
	    
	    driver.findElement(By.id("Ankit")).sendKeys("Selenium");
	    
	    driver.quit();


	}

}

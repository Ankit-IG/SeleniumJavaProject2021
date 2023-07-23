package waitDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class setScriptTimeOut {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	  
	    driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS); 
       
       
       //We can use directly in below way
       
       // driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
       
      // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       
	    driver.get("https://www.goibibo.com/");
	    
	    System.out.println(driver.getTitle());

	}

}

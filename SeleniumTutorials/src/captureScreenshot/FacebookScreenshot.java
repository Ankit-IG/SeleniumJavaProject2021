package captureScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import library.Utility;


@Test
public class FacebookScreenshot {
	
	public void capturescreenshot() throws Exception
	{
	
	System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    Utility.captureScreenshot(driver, "BrowserStarted");
   
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Learn Automation");
    
    Utility.captureScreenshot(driver, "TypeUName");
    
    
   //This 4 lines code 
    /*TakesScreenshot ts=(TakesScreenshot)driver;
   
    File source=ts.getScreenshotAs(OutputType.FILE);
    
    FileHandler.copy(source, new File("./Screenshots/facebook.png")); 
       
    	System.out.println("Screenshot Taken");
    	*/
    
    driver.quit();
    
}
}
package alertWindowHandle;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertWindow {
	
	@Test
	public void handleWindow() throws Exception
	{

	System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
    WebDriver driver =new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://ksrtc.in/oprs-web/");
    
    driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
    
   // Thread.sleep(10000);
		
    //Alert alt=driver.switchTo().alert();
    
   // alt.accept();
    
  //String actual_msg=driver.switchTo().alert().getText();		
    
    //System.out.println("Alert message is "+actual_msg);
    
		//Other Method
    // Switching to Alert        
    Alert alert = driver.switchTo().alert();		
    		Thread.sleep(2000);
    // Capturing alert message.    
    String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
    System.out.println(alertMessage);	
    Thread.sleep(5000);
    		
    // Accepting alert		
    alert.accept();		
   
    //For validating message
    
    String exp_msg="Please select he place.";
    
    Assert.assertEquals(alertMessage,exp_msg);
		
		
		
	}		
		
}

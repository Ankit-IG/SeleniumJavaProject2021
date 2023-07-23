package verifyErrorMessages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) 
		throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://gmail.com/");

			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
			
			Thread.sleep(2000);
			
			String actual_error=driver.findElement(By.xpath("//*[@class='o6cuMc']")).getText();
			
	         String	exp_error="Enter an email or phone number";
	         
	         //Type 1
	         Assert.assertEquals(actual_error, exp_error);
	         
	         //Type 2
	        Assert.assertTrue(actual_error.contains("Enter an email or phone"));
	        
	        System.out.println("Test Completed");
	       
	}

}

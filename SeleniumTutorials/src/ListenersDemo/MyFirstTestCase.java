package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MyFirstTestCase {
	
	 @Test
	public void googleTiltleVerify()
	{

			System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	 
	 
	 @Test
	public void TiltleMatch() {
		 
		 System.out.println("Test 2 dummy");
		 Assert.assertTrue(false);
	 }

}

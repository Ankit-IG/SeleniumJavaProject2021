package verifyTitles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class VerifyApplicationTitle 
{

	public void verifyApplicationTitle()
	
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");

		driver.manage().window().maximize();
	
		String my_Title=driver.getTitle();
		//Actual Title
		System.out.println("Title is "+my_Title);
		
		//for validation
		 //String exp_Title= "Selenium Webdriver Tutorial - Selenium Tutorial for Beginners";
		 
         //Assert.assertEquals(my_Title, exp_Title);
		 
		Assert.assertTrue(my_Title.contains("Selenium Webdriver Tutorial"));
	     
         System.out.println("Test Completed-Page Verified");
	
	}
	
}

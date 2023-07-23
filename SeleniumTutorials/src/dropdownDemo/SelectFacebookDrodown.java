package dropdownDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDrodown {
	
	@Test
	public void selectDDvalues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement month_dropdown=driver.findElement(By.id("month"));
	
	Select month_dd=new Select(month_dropdown);
	
	//It will select march
	month_dd.selectByIndex(3);
	
	Thread.sleep(3000);
	
	//It will select Oct
	month_dd.selectByValue("10");
	
	Thread.sleep(3000);
	
	//It will select Aug 
	month_dd.selectByVisibleText("Aug"); //This method is case sensitive and highly recommended
	

	
	
	}

}

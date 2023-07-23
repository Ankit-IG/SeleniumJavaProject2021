package dropdownDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDrodown2 {
	
	@Test
	public void selectDDvalues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement month_dropdown=driver.findElement(By.id("month"));
	
	Select month_dd=new Select(month_dropdown);
	
	WebElement selected_value= month_dd.getFirstSelectedOption();
	//It will return month
	System.out.println("Before selection the selected value is "+selected_value.getText());
	
	
	//It will select march
	month_dd.selectByIndex(3);
	WebElement selected_value1= month_dd.getFirstSelectedOption();
	//It will return march
	System.out.println("Before selection the selected value is "+selected_value1.getText());
	
	
	
	
	}

}

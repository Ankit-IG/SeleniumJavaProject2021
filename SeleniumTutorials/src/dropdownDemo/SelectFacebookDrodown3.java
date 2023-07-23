package dropdownDemo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDrodown3 {
	
	@Test
	public void selectDDvalues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement month_dropdown=driver.findElement(By.id("month"));
	
	Select month_dd=new Select(month_dropdown);
	
	
	List<WebElement> month_list= month_dd.getOptions();
	int total_month= month_list.size();
	Assert.assertEquals(total_month, 13);
	
	System.out.println("Total number of Month is "+total_month);
	//enhance for loop
	
	for(WebElement ele:month_list)
	{
	String month_name= ele.getText();
	System.out.println("Monts are = "+month_name);
	}

}
}

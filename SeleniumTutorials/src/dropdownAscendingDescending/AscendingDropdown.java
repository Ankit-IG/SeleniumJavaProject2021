package dropdownAscendingDescending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class AscendingDropdown {

	//ArrayList> Collection
	//Dropdown- How to use dropdown
	//Collections- Class
	public  void selectDDvalues() {
		
			System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	
			driver.manage().window().maximize();
			
			 Select days=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
			 
			 List actualList = new ArrayList();
			
			 List<WebElement> myDays=days.getOptions();
			
			 //Capture all the values from dropdown 
			 for(WebElement ele:myDays)
				 {
			 String data=ele.getText();
			 actualList.add(data);
				 }
			 
		//Create temp list and sort them
		List temp = new ArrayList();
		temp.addAll(actualList);
		
		//By default ascending sorting
		
		Collections.sort(temp);
	
		Assert.assertTrue(actualList.equals(temp));
		
		}

}

package RadioButtonAndCheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
	//To set the webdriver property
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
		// Initialize the driver
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.dyn-web.com/tutorials/forms/examples/pizza.php");
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='size' and @type = 'radio']"));
		
		for(int i=0;i<radio.size();i++)
			
		{
			
			WebElement local_radio=radio.get(i);
			
			String value=local_radio.getAttribute("value");
			
			System.out.println("Values from radio buttons are =====>>"+value);
		
           if(value.equalsIgnoreCase("small"))
           {
			local_radio.click();
			break;
		}
         
	}
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<checkbox.size();i++)
		{
		WebElement ele=checkbox.get(i);
		String value=ele.getAttribute("value");
		
		if (value.equalsIgnoreCase("onions"))
		{
			ele.click();
			break;
		}
	}
		
		
	}	
}

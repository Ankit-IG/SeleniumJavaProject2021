package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.stqatools.com");

	 // Find element using locator and store into WebElement
	 WebElement elementToHover = driver.findElement(By.xpath("//span[text()='Programs']"));
	

	 
	  //WebElement subelementToHover = driver.findElement(By.id("//span[text()='Programs']"));
	 // Find element using locator and store into WebElement
	 WebElement elementToClick = driver.findElement(By.xpath("//span[text()='Java']"));

	 // Create object of Action class
	 Actions action = new Actions(driver);

	 // Perform moveToElement operation using action (object) on element.
	 action.moveToElement(elementToHover).perform();
	 
		Thread.sleep(2000);
		
       action.moveToElement(elementToClick).perform();
       
	   elementToClick.click();
	    
	    

	}

}

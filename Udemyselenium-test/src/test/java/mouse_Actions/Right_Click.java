package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement btn = driver.findElement(By.xpath("//span[text()= 'right click me']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(btn).perform();
		
		Thread.sleep(1000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.RETURN).perform();
		
		System.out.println("Pass");
		
	}

}

package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.actitime.com/");
		
		Actions action = new Actions(driver);
		
		WebElement clients = driver.findElement(By.linkText("Clients"));
		
		action.moveToElement(clients).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("IT")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());

	}

}

package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_Element {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		/*
		 * Automating resizable element
		 */
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.cssSelector("div.ui-icon-gripsmall-diagonal-se"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.clickAndHold(source).moveByOffset(30, 20).build().perform();

	}

}

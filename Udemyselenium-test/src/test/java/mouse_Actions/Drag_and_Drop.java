package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.switchTo().frame(0);
			
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			
			Actions action = new Actions(driver);
			
			//action.dragAndDrop(source, target).perform(); If it is not working then 
			
			action.clickAndHold(source).moveToElement(target).release(target).build().perform();
			
            
	}

}

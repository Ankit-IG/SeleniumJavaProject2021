package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multikey_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Automating Multi-key operations
		 */
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement first = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(1)"));
		WebElement third = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(3)"));
		WebElement fifth = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(5)"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).perform();
		action.click(first);
		action.click(third);
		action.click(fifth);
		action.keyUp(Keys.CONTROL).perform();
	}

}

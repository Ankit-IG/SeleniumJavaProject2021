package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.switchTo().frame(0);
		
		WebElement red = driver.findElement(By.cssSelector("div#red>span"));
		WebElement green = driver.findElement(By.cssSelector("div#green>span"));
		WebElement blue = driver.findElement(By.cssSelector("div#blue>span"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(red).moveByOffset(-20, 0).release(red).build().perform();
		Thread.sleep(1000);
		action.clickAndHold(green).moveByOffset(20, 0).release(green).build().perform();
		Thread.sleep(1000);
		action.clickAndHold(blue).moveByOffset(10, 0).release(blue).build().perform();

	}

}

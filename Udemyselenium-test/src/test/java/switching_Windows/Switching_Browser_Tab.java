package switching_Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Browser_Tab {

	public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver(); 
		
         driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Data Policy")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			}
		}
		
		driver.findElement(By.cssSelector("a.signup_btn")).click();
		
		driver.switchTo().window(parentWindow);

	}

}

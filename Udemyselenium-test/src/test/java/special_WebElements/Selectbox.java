package special_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Working with Selectbox.
		 * 1. How to 'Get Currently Selected Option'?
		 * 2. How to 'Select an Option'?
		 */
		
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().fullscreen();
		
		
		String x = driver.findElement(By.id("month")).getAttribute("value");
		String y = driver.findElement(By.id("day")).getAttribute("value");
		String z = driver.findElement(By.id("year")).getAttribute("value");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		List<WebElement> m = driver.findElements(By.cssSelector("select#month>option"));
		
		for(WebElement month:m) {
			if (month.getText().trim().equals("Dec")) {
				month.click();
				break;
			}
		}
		
		//driver.quit();
		
		
	}

}

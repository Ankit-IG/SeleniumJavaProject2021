package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws Exception {

		/*
		 * Working with iframes (Inline Frames)
		 * 
		 * 1. Working with iframes using 'index'
		 * 2. Working with iframes using 'id/name'
		 * 3. Working with iframes using 'WebElement'
		 */

		  System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.dezlearn.com/iframe-example/");
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframe2']"));
		
		//driver.switchTo().frame(1); //Using Index
		
		//driver.switchTo().frame("iframe1"); //Using ID
		
		//driver.switchTo().frame("demo_frame2"); //Using Name
		
		driver.switchTo().frame(frame1); //Using WebElement
		
		driver.findElement(By.id("u_5_6")).click();
		
		driver.switchTo().defaultContent();

	}

}

package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.dezlearn.com/iframe-example/");
		Thread.sleep(2000);
		

		driver.switchTo().frame("demo_parent_iframe");
		
		driver.switchTo().frame("demo_frame1");
		
		driver.findElement(By.id("u_5_6")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("u_5_5")).click();
		
		driver.switchTo().defaultContent();
		
	}

}

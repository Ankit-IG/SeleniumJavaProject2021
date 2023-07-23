package CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAttribute {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("i.hm-icon")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.partialLinkText("Echo & Alexa")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Echo Dot (3rd Gen)")).click();
			
			Thread.sleep(2000);
			
			String title= driver.findElement(By.cssSelector("span#productTitle")).getText();
			
			if (title.contains("Echo Dot (3rd Gen)")) {
				System.out.println("Pass");
				
			}
			else {
				System.out.println("Fail");
			}
			
    driver.close();
	}

}

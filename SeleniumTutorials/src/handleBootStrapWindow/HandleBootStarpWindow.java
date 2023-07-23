package handleBootStrapWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStarpWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    driver.get("https://www.goibibo.com/");
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	    
	    driver.switchTo().frame("authiframe");
	    
	    driver.findElement(By.xpath("//*[@id=\"authMobile\"]")).sendKeys("123456789");
	    
	

	}

}

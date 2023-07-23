package test_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.dezlearn.com/test-sync-example/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@id='ninja_forms_field_97']")).sendKeys("De Zinnia");
			driver.findElement(By.xpath("//input[@id='ninja_forms_field_98']")).sendKeys("Institutes");
			driver.findElement(By.xpath("//input[@id='ninja_forms_field_100']")).sendKeys("dezinnia@dezlearn.com");
			
			driver.findElement(By.id("u_5_6")).click();
			//Thread.sleep(10000);
			driver.findElement(By.linkText("Go to Next Page")).click();
	}

}

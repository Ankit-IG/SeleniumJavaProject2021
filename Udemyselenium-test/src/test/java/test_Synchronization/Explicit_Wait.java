package test_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.dezlearn.com/test-sync-example/");
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); --Implicit Wait
			//Explicit Wait
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.get("https://www.dezlearn.com/explicit-wait-example/");
			driver.findElement(By.xpath("//input[@id='nf-field-97']")).sendKeys("De Zinnia");
			driver.findElement(By.xpath("//input[@id='nf-field-98']")).sendKeys("Institutes");
			driver.findElement(By.xpath("//input[@id='nf-field-100']")).sendKeys("dezinnia@dezlearn.com");
			
			driver.findElement(By.id("u_5_6")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("u_5_7"))).click();

	}

}

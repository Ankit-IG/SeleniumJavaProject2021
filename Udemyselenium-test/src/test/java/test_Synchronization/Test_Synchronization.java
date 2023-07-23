package test_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Synchronization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 1. What is test synchronization?
		 * 2. Why is it required?
		 */
		
        System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.dezlearn.com/test-sync-example/");
		
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_97']")).sendKeys("De Zinnia");
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_98']")).sendKeys("Institutes");
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_100']")).sendKeys("dezinnia@dezlearn.com");
		
		driver.findElement(By.id("u_5_6")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Go to Next Page")).click();

	}

}

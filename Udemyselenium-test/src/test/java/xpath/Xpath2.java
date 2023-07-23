package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Syntax of xpath using Text-- //TagName[text()=""text]
		
		
        System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		/*
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("ZINNIA");
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("anki@gmail.com");
		
		*/
	}

}

package javaScript_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.dezlearn.com/javascript-alerts/");
			
     //  driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.id("p_alert3")).click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Mumbai");
		Thread.sleep(3000);
		System.out.println(a.getText());
		a.accept();
		driver.close();
	}

}

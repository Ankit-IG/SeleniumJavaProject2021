package javaScript_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.dezlearn.com/javascript-alerts/");
			
			driver.findElement(By.id("s_alert1")).click();
			Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
		
			driver.close();
	}

}

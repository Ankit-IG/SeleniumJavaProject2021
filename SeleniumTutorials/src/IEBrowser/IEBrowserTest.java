package IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver", "G:\\TOOLS\\Browsers Drivers\\IE Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
	}

}

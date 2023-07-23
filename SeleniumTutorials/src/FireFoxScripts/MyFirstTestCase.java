package FireFoxScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTestCase {

	public static void main(String[] args) {
		
		//Set the system property for gecko driver
		
		System.setProperty("webdriver.gecko.driver","G:\\TOOLS\\Browsers Drivers\\Gecko Driver\\geckodriver.exe");
		
		// Initialize browser driver
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit(); 

	}

}

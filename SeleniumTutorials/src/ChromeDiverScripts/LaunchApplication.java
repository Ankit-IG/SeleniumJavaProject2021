package ChromeDiverScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		//To set the webdriver property
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
		// Initialize the driver
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
        //driver.quit();
        
	}

}

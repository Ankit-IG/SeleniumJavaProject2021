package IEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeBrowserScripts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "G:\\TOOLS\\Browsers Drivers\\IE Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://learn-automation.com");
		System.out.println(driver.getTitle());
        //driver.quit();
        
		

	}

}

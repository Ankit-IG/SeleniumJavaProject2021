package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browsername) {
		
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","G:\\TOOLS\\Browsers Drivers\\Gecko Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "G:\\TOOLS\\Browsers Drivers\\IE Driver\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}
	
		
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
		

}

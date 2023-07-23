package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("LogDemo");

		PropertyConfigurator.configure("Log4j.Properties");
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		logger.info("Maiximize Window");
		
        driver.get("https://www.selenium.dev/downloads/");
        logger.info("Open Selenium site");
        
        System.out.println(driver.getTitle());
        logger.info("Print Title");
        driver.quit();

		
	}

}

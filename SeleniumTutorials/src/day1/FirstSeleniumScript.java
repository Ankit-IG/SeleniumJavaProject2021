package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        System.out.println(driver.getTitle());
        driver.quit();
	}

}

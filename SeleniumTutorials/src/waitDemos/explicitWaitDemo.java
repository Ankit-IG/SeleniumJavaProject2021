package waitDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitDemo {

	public static void main(String[] args) {
		// Start browser
		  System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");		
		  WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
				// Start application
				driver.get("http://learn-automation.com/explicit-wait-in-selenium-webdriver/");

				// Click on timer button to start
				driver.findElement(By.xpath("//*[@id=\"menu-item-3876\"]")).click();

				// Create object of WebDriverWait class and it will wait max of 20 seconds.
				// By default it will accepts in Seconds
				WebDriverWait wait = new WebDriverWait(driver, 1);

				// Here we will wait until element is not visible, if element is visible then it will return web element
				// or else it will throw exception
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='https://www.katalon.com/']")));

				// if element found then we will use- In this example I just called isDisplayed method
				boolean status = element.isDisplayed();

				// if else condition
				if (status) {
					System.out.println("===== WebDriver is visible======");
				} else {
					System.out.println("===== WebDriver is not visible======");
				}

	}

}

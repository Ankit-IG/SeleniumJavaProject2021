package get_Element_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Eement_Visible_Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		boolean isDisplayed = driver.findElement(By.id("u_0_b")).isDisplayed();
		boolean isEnabled = driver.findElement(By.id("u_0_b")).isEnabled();
		
		System.out.println(isDisplayed);
		System.out.println(isEnabled);
		
		driver.quit();

	}

}

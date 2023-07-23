package get_Element_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_get_Methods {


	/*
	 * Basic Get Methods
	 * 1. Get Attribute
	 * 2. Get Text
	 * 3. Get Tag Name
	 */
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.facebook.com/");
					
					String att1 = driver.findElement(By.id("u_0_c")).getAttribute("ghda");
					String att2 = driver.findElement(By.id("u_0_c")).getAttribute("aria-label");
					String att3 = driver.findElement(By.id("u_0_c")).getTagName();
					String text = driver.findElement(By.id("u_0_u")).getText();
					
					System.out.println(att1);
					System.out.println(att2);
					System.out.println(att3);
					System.out.println(text);
					
					driver.quit();
					

	}

}

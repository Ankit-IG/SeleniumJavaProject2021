package switching_Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Popup_Windows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); 
			
	         driver.get("https://www.dezlearn.com/multiple-browser-windows/");
	 		
	 		 driver.findElement(By.id("u_7_8")).click();
	 		 
	 		String parentWindow = driver.getWindowHandle();
			
			Set<String> windows = driver.getWindowHandles();
			
			for(String window : windows) {
				if(!window.equals(parentWindow)) {
					driver.switchTo().window(window);
					driver.close();
					Thread.sleep(1000);
				}
			}
			
			driver.switchTo().window(parentWindow);

	 		
	}

}

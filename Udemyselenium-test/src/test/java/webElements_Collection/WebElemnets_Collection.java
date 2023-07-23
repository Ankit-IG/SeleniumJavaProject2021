package webElements_Collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemnets_Collection {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.cssSelector("a"));
		//List<WebElement> links= driver.findElements(By.cssSelector("a.main-menu_link"));-- for only main menu links
		for(WebElement link : links) {
			String text = link.getText();
			if ( !text.trim().isEmpty()) {
		
			System.out.println(link.getText());
			System.out.println("-----------------");
		}
		}

	}

}

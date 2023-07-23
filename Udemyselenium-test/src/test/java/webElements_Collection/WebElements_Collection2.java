package webElements_Collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Collection2 {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.goodreads.com/");
					driver.manage().window().maximize();
					
					List<WebElement> books= driver.findElements(By.cssSelector("img[src$='.jpg'][alt]"));
					
					System.out.println(books.size());
					
					for(WebElement book : books) {
						System.out.println(book.getAttribute("alt"));
						System.out.println("---------------------");
					}
					driver.close();
	}

}

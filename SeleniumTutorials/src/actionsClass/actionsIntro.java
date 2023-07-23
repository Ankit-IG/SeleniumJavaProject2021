package actionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsIntro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	    
	    Actions act=new Actions(driver);
	    
	}

}

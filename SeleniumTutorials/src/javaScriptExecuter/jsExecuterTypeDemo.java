package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecuterTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://login.yahoo.com/");
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	    WebElement email=driver.findElement(By.name("username"));
	    
        js.executeScript("arguments[0].value='random@gmail.com'", email);
        
        WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"persistent\"]"));
        
        js.executeScript("arguments[0].click()", checkbox);
	    
	    
	}

}

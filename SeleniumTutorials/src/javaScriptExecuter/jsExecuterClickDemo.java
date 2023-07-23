package javaScriptExecuter;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecuterClickDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://login.yahoo.com/");
	    
	    //By normal way
	    
	      driver.findElement(By.name("username")).sendKeys("random@gmail.com");
	      
	      Thread.sleep(2000);
	    
	   // driver.findElement(By.xpath("//*[@id=\"persistent\"]")).click(); (It will not run bcz checkbox is not find due to disabled or inactive)
	      
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      
	      js.executeScript("document.getElementById('persistent').click()");
	    
	    
	    //By JavascriptExecuter
	    
	    /*
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	    WebElement email=driver.findElement(By.name("username"));
	    
        js.executeScript("arguments[0].value='random@gmail.com'", email);
        
        WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"persistent\"]"));
        
        js.executeScript("arguments[0].click()", checkbox);
	    */
	    
	}

}

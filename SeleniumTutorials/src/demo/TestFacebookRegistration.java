package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\NewChrome\\chromedriver.exe");
		//To initialize the driver
		WebDriver driver=new ChromeDriver();
		
	// to get the URL
        driver.get("https://www.facebook.com/");
        
     // To maximize the window
        driver.manage().window().maximize();
        
        //To find element                                        //Type text on textbox
        
        driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Test Selenium");
        
        driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
        
        //To select Drop-downs
      
        Select Sel1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        
        Sel1.selectByVisibleText("May");
       
        Select Sel2=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        
        Sel2.selectByValue("24");
        
        Select Sel3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        
        Sel3.selectByIndex(6);
        
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
        
        driver.navigate().back();
        
         
         
         //driver.quit();
	}
	

}

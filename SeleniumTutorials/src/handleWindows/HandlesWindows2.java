package handleWindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesWindows2 {

	public static void main(String[] args)throws InterruptedException 
	{
	
		

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //Load app
	    driver.get("https://www.naukri.com/");
	    
	 
	     
	    // It will return the parent window name as a String
	    String parent=driver.getWindowHandle();
	     
	    // This will return the number of windows opened by Webdriver and will return Set of Strings
	    Set<String>allWindows=driver.getWindowHandles();
	     
	    
	    //Other way
	    
	    ArrayList<String> tabs=new ArrayList<>(allWindows);
	    
	    driver.switchTo().window(tabs.get(2));
	    driver.close();
	    
	    driver.switchTo().window(tabs.get(1));
	    driver.close();
	    
	    driver.switchTo().window(tabs.get(0));
	   
	     
	    System.out.println("Parent Window title is "+driver.getTitle());

	}

}

package handleWindows;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesWindows1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
			
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //Load app
	    driver.get("https://www.naukri.com/");
	    
	 
	     
	    // It will return the parent window name as a String
	    String parent=driver.getWindowHandle();
	     
	    // This will return the number of windows opened by Webdriver and will return Set of Strings
	    Set<String>allWindows=driver.getWindowHandles();
	     
	 int count=allWindows.size();
	 System.out.println("Total number count is "+count);
	 
	 
	 for(String child:allWindows)
	 {
	     
	    // Here we will compare if parent window is not equal to child window then we will close
	     
	    if(!parent.equalsIgnoreCase(child))
	    {
	    driver.switchTo().window(child);
	     
	    System.out.println(driver.switchTo().window(child).getTitle());
	     
	    Thread.sleep(3000);
	    
	    driver.close();
	    }
	     
	    }
	    // once all pop up closed now switch to parent window
	    driver.switchTo().window(parent);
	     
	    System.out.println("Parent Window tiltle is "+driver.getTitle());

	}

}

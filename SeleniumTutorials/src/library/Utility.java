package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
		 try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			   
			    File source=ts.getScreenshotAs(OutputType.FILE);
			    
			    FileHandler.copy(source, new File("./Screenshots/"+screenshotName+".png")); 
			       
			    	System.out.println("Screenshot Taken");
		} 
		 catch (Exception e) 
		 
		 {
		   System.out.println("Exception while taking screenshot "+e.getMessage());
	       
		 }
		
		
		
		
	}

}

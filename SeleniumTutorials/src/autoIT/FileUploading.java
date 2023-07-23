package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		
		// Initialize the driver
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//driver.get("file:///C:/Users/Dell/Desktop/fileupload.html");
		driver.get("http://www.tinyupload.com/");
		
		//driver.findElement(By.name("resumeupload")).sendKeys("C:\\Users\\Dell\\Desktop\\fileupload.html");	
	
		driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\Dell\\Desktop\\fileupload.html");
		Thread.sleep(2000);
	
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\AutoIT\\FileUpload.exe");
		
		//driver.quit(); 





	}

}

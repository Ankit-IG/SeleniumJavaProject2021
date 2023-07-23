package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;


public class TestSeleniumBlog 
{
  
	@Test
	public void testConfig() throws Exception {
	
		//Specify the path
		File src=new File("./Configuration/Config.property");
		
		//Read the file in inputstream by the conversion
		FileInputStream fis = new FileInputStream(src);
		
		//Create object of properties class to read the property file
		Properties pro= new Properties();
		
		//To load the file
		pro.load(fis);
		
		String chromepath= pro.getProperty("ChromeDriver");
		
		System.out.println("Chrome path is ==="+chromepath);
	}
	
}

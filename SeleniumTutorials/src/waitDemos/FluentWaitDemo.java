package waitDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Start browser
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome Driver for version 83\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

		// Maximize browser

		 driver.manage().window().maximize();

		// Start the application 

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// Click on timer so clock will start

		 driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();



		// Create object of FluentWait class and pass web driver as input
		@Deprecated
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);



		 // It should poll webelement after every single second

		pollingEvery(1, TimeUnit.SECONDS);



		// Max time for wait- If conditions are not met within this time frame then it will fail the script

	    withTimeout(10, TimeUnit.SECONDS);



	   // we are creating Function here which accept webdriver and output as WebElement-

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {



	 // apply method- which accept webdriver as input

	   public WebElement apply(WebDriver arg0) 
		{

	// find the element

	  WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));

		// Will capture the inner Text and will compare will WebDriver

		// If condition is true then it will return the element and wait will be over

		if (ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) 
		                      {

		System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));

	  return ele;

		 }

		// If condition is not true then it will return null and it will keep checking until condition is not true

		else {
		System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));

		return null; }

		      
		

		               }

		    });

		// If element is found then it will display the status
       System.out.println("Final visible status is >>>>> " + element.isDisplayed());

	}

	private static void withTimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

	private static void pollingEvery(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

}

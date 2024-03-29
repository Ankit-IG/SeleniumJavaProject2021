package special_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		/*
		 * Select date from a date picker
		 */
		String expMonth = "August 2021";
		String expDate = "15";
System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trivago.com/");
		
		driver.findElement(By.xpath("//button[@data-qa='calendar-checkin']")).click();
		String currMonth = driver.findElement(By.cssSelector("th.cal-heading-month")).getText();
		int c = 0;
		while(!currMonth.contains(expMonth)) {
			driver.findElement(By.cssSelector("button.cal-btn-next")).click();
			c++;
			Thread.sleep(1000);
			currMonth = driver.findElement(By.cssSelector("th.cal-heading-month")).getText();
			if (c == 12) {
				break;
			}
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("table.cal-month td"));
		
		for(WebElement date : dates) {
			String x = date.getText().trim();
			if(x.equals(expDate)) {
				date.click();
				break;
			}
		}
	}

}

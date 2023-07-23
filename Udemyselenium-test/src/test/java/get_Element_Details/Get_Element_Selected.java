package get_Element_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Selected {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.ebay.com/sch/ebayadvsearch");
			driver.manage().window().fullscreen();
			
			boolean rc1 = driver.findElement(By.xpath("//input[@id='LH_LPickup']")).isSelected();
			driver.findElement(By.xpath("//input[@id='LH_LPickup']")).click();
			boolean rc2 = driver.findElement(By.xpath("//input[@id='LH_LPickup']")).isSelected();
			System.out.println(rc1);
			System.out.println(rc2);
			
			boolean rc3 = driver.findElement(By.xpath("//input[@id='LH_PrefLocRadio']")).isSelected();
			driver.findElement(By.xpath("//input[@id='LH_PrefLocRadio']")).click();
			boolean rc4 = driver.findElement(By.xpath("//input[@id='LH_PrefLocRadio']")).isSelected();
			System.out.println(rc3);
			System.out.println(rc4);


	}

}

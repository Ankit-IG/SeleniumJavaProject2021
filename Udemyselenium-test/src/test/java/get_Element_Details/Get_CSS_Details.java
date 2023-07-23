package get_Element_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CSS_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Get CSS Value (http://www.stylinwithcss.com/resources_css_properties.php)
		 * 1. Get Background Color (background-color)
		 * 2. Get Color (color)
		 * 3. Get Font Size (font-size)
		 * 4. Get Font / Font Family (font / font-family)
		 * 5. Get Height (height)
		 * 6. Get Width (width)
		 */
		System.setProperty("webdriver.chrome.driver", "G:\\TOOLS\\Browsers Drivers\\Chrome drivers\\Latest\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String color = driver.findElement(By.id("u_0_b")).getCssValue("color");
		String bgColor = driver.findElement(By.id("u_0_b")).getCssValue("background-color");
		String font = driver.findElement(By.id("u_0_b")).getCssValue("font");
		String font_size = driver.findElement(By.id("u_0_b")).getCssValue("font-size");
		String foint_family = driver.findElement(By.id("u_0_b")).getCssValue("font-family");
		String height = driver.findElement(By.id("u_0_b")).getCssValue("height");
		String width = driver.findElement(By.id("u_0_b")).getCssValue("width");
		
		System.out.println("color:" + color);
		System.out.println("bgColor:" + bgColor);
		System.out.println("font:" + font);
		System.out.println("font_size:" + font_size);
		System.out.println("foint_family:" + foint_family);
		System.out.println("height:" + height);
		System.out.println("width:" + width);
		
		driver.quit();
	}

}

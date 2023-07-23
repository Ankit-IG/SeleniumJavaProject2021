package com.dezlearn.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.dezlearn.elements.Ebay_Home_Page_Elements;
import com.dezlearn.pages.Ebay_Home_Page;

public class EbayHome_Sanity extends AbstractBaseTest {

	//Assert.assertFalse(condition, "desc");
	//Assert.assertNull(object, message);
	//Assert.assertNotNul(object, message);
	//Assert.assertNotEquals(actual1, actual2, "desc");
	//Assert.assertEquals(actual1, Expected, "desc");
	//Assert.assertTrue(condition, message);
  
	
	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("Before class settings done");
		System.out.println("EbayHome_sanity exceution starts");
	}
	
	@AfterClass
	public void afterClassSetup() {
		System.out.println("After class settings done");
		System.out.println("EbayHome_sanity exceution Ends");
	}
	
	
	
  @Test(groups = {"P0"})
  public void empty_search_test() throws Exception {
	  
	  //Selenium code starts here
	  App().Flow().navigateToUrl(App().Pages().homePage().getPageUrl());
	  
		
		String expectedUrl= "https://www.ebay.com/n/all-categories";
		String expectedTitle= "Shop by Category | eBay";
		
		Assert.assertTrue(App().Pages().homePage().isSearchButtonEnabled(), "Verify Search button Enabled");
		//Assert.assertFalse(condition, "desc");
		//Assert.assertNull(object, message);
		//Assert.assertNotNul(object, message);
		
		App().Pages().homePage().clickSearchButton();

		String newUrl = App().Flow().getCurrentPageUrl();
		String newTitle = App().Flow().getCurrentPageTitle();
		
		System.out.println(newUrl);
		System.out.println(newTitle);
		
		Assert.assertEquals(newUrl, expectedUrl, "Verified Url");//Intentionally failure
		Assert.assertEquals(newTitle, expectedTitle, "Verified Url");
	
		//driver.close();
	}
  
  @Test(groups = {"P2", "P3"})
  
 public void empty_search_test_softassert() throws Exception {
	
	  App().Flow().navigateToUrl(App().Pages().homePage().getPageUrl());
		
		
	  SoftAssert sa = new SoftAssert();
	  //Selenium code starts here
	  
		
		String expectedUrl= "https://www.ebay.com/n/all-categories";
		String expectedTitle= "Shop by Category | eBay";
		
		sa.assertTrue(App().Pages().homePage().isSearchButtonEnabled(), "Verify Search button Enabled");
	
		
		App().Pages().homePage().clickSearchButton();
		
		String newUrl = App().Flow().getCurrentPageUrl();
		String newTitle = App().Flow().getCurrentPageTitle();
		
		
		System.out.println(newUrl);
		System.out.println(newTitle);
		
		sa.assertEquals(newUrl, expectedUrl, "Verified Url");
		sa.assertEquals(newTitle, expectedTitle, "Verified Url");
	
		//driver.close();
		
		sa.assertAll();
  }
}

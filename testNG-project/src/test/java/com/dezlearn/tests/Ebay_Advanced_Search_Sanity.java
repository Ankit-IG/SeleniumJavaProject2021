package com.dezlearn.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.dezlearn.elements.Ebay_Advanced_Search_Page_Elements;
import com.dezlearn.elements.Ebay_Search_Result_Page_Elements;
import com.dezlearn.pages.Ebay_Advanced_Search_Page;
import com.dezlearn.pages.Ebay_Search_Result_Page;

public class Ebay_Advanced_Search_Sanity extends AbstractBaseTest {
	
	
	//Ebay_Advanced_Search_Page_Elements advSearchElements;
	//Ebay_Search_Result_Page_Elements searchresultElements;
	

	//Assert.assertFalse(condition, "description");
	//Assert.assertNull(object, message);
	//Assert.assertNotNul(object, message);
	//Assert.assertNotEquals(actual1, actual2, "description");
	//Assert.assertEquals(actual1, Expected, "description");
	//Assert.assertTrue(condition, message);
  
	
	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("Before class settings done");
		System.out.println("EbayAdvanced_sanity exceution starts");
	}
	
	@AfterClass
	public void afterClassSetup() {
		System.out.println("After class settings done");
		System.out.println("EbayAdvanced_sanity exceution Ends");
	}
	
	
	
  @Test(groups = {"P0","P1"})
  public void empty_search_test() throws Exception {
	  
	  //Selenium code starts here
	  
	  App().Flow().navigateToUrl(App().Pages().advSearchPage().getPageUrl());
		
		
		String expectedUrl= "https://www.ebay.com/n/all-categories";
		String expectedTitle= "Shop by Category | eBay";
		
		
		Assert.assertTrue(App().Pages().advSearchPage().isAdvSearchButtonEnabled(), "Verify Search button Enabled");
		//Assert.assertFalse(condition, "description");
		//Assert.assertNull(object, message);
		//Assert.assertNotNul(object, message);
		
		App().Pages().advSearchPage().clickAdvSearchButton();
	
		
		
		String newUrl = App().Flow().getCurrentPageUrl();
		String newTitle = App().Flow().getCurrentPageTitle();
		System.out.println(newUrl);
		System.out.println(newTitle);
	
		Assert.assertEquals(newUrl, expectedUrl, "Verified Url");//Intentionally failure
		Assert.assertEquals(newTitle, expectedTitle, "Verified Url");
	
		//driver.close();
	}
  
  @Test(groups = {"P0", "P1"})
  
 public void empty_search_test_softassert() throws Exception {
	  App().Flow().navigateToUrl(App().Pages().advSearchPage().getPageUrl());
	
		
	  SoftAssert sa = new SoftAssert();
	  //Selenium code starts here
	  
	  	String expectedUrl= "https://www.ebay.com/n/all-categories";
		String expectedTitle= "Shop by Category | eBay";
		
		
		sa.assertTrue(App().Pages().advSearchPage().isAdvSearchButtonEnabled(), "Verify Search button Enabled");
		//Assert.assertFalse(condition, "desc");
		//Assert.assertNull(object, message);
		//Assert.assertNotNul(object, message);
		
		App().Pages().advSearchPage().clickAdvSearchButton();
		
		
		
		String newUrl = App().Flow().getCurrentPageUrl();
		String newTitle = App().Flow().getCurrentPageTitle();
		
		System.out.println(newUrl);
		System.out.println(newTitle);
		
		sa.assertEquals(newUrl, expectedUrl, "Verified Url");//Intentionally failure
		sa.assertEquals(newTitle, expectedTitle, "Verified Url");
		sa.assertAll();
  }
		@Test(groups = {"P2", "P1"})
		public void category_option_in_ascending_order_test() throws Exception
		{
			App().Flow().navigateToUrl("https://www.ebay.com/sch/ebayadvsearch");
			
		
			List<WebElement> category_options = App().Pages().advSearchPage().getAllCatOptions();
			List<String> arr1 = new ArrayList<String>();
			
			for (WebElement option : category_options) {
				arr1.add(option.getText());
			}
			
			List<String> arr2= new 	ArrayList<String>(arr1);
			Collections.sort(arr2);
			System.out.println("Actual List : "+arr1);
			System.out.println("Sorted List : "+arr2);
			Assert.assertTrue(arr1.equals(arr2), "Verify category itmes sorted");
			
		}
		
		@Test(groups = {"P0"})
		public void ebay_logo_link_navigates_home_page_test() throws Exception{
			
			driver.get(App().Pages().advSearchPage().getPageUrl());
			
			String expectedURL= "https://www.ebay.com/";
			String expectedTitle= "Electronics, Cars, Fashion, Collectibles, Coupans and more | eBay";
			
			App().Pages().advSearchPage().clickOnEbayLogo();
			
			String newUrl = App().Flow().getCurrentPageUrl();
			String newTitle = App().Flow().getCurrentPageTitle();
			
			System.out.println(newUrl);
			System.out.println(newTitle);
			
			Assert.assertEquals(newUrl, expectedURL, "Verify url of new page");
			Assert.assertEquals(newTitle, expectedTitle, "Verify the Title of new page");
		}
		
		@Test(groups = {"P3", "P1"})
		public void advanced_search_keywords_test() throws Exception{
			
			App().Flow().navigateToUrl(App().Pages().advSearchPage().getPageUrl());
				
			String keyword1 = "unlocked";
			String keyword2 = "ios";
			String searchString = keyword1 + " " + keyword2;

			App().Pages().advSearchPage().enterSearchStringInKeywordFields(searchString);
			App().Pages().advSearchPage().clickAdvSearchButton();
		

	
			String firstResultTitle= App().Pages().searchResultPage().getfirstResultTiltle();
			
			Assert.assertTrue(firstResultTitle.toLowerCase().contains(keyword1), "Result Title Contains First Keyword " + keyword1);
			Assert.assertTrue(firstResultTitle.toLowerCase().contains(keyword2), "Result Title Contains Second Keyword " + keyword2);
			
		}


}

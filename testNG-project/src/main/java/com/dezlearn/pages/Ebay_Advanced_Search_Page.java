package com.dezlearn.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dezlearn.elements.Ebay_Advanced_Search_Page_Elements;
import com.dezlearn.elements.Ebay_Search_Result_Page_Elements;

public class Ebay_Advanced_Search_Page<WebElements> {

    String pageUrl = "https://www.ebay.com/sch/ebayadvsearch";
	WebDriver driver;
	Ebay_Advanced_Search_Page_Elements advSearchElements;
	Ebay_Search_Result_Page_Elements searchresultElements;
	
	public Ebay_Advanced_Search_Page(WebDriver driver) {
		this.driver = driver;
		advSearchElements = new Ebay_Advanced_Search_Page_Elements(driver);
		searchresultElements = new Ebay_Search_Result_Page_Elements(driver);
	}
		
		/**
		 * Is Advanced Search Button Enabled
		 */
		
		public boolean isAdvSearchButtonEnabled() {
			return advSearchElements.advSearchBtn.isEnabled();
		}
		
       /**
        * Get All Catagory Dropdown options
        */
     
		public List<WebElement> getAllCatOptions(){
			return advSearchElements.allCatSelectBoxOptions;
		}
		
		/**
		 * Click on Ebay Logo
		 */
		
		public void clickOnEbayLogo() {
			advSearchElements.eBayLogo.click();		
			
		}
		
		/**
		 * Enter search string in keyword field
		 */
		
		public void enterSearchStringInKeywordFields(String srcString) {
			
			advSearchElements.KeyWordsField.sendKeys(srcString);
		}

		/**
		 * Click Advanced Search Button
		 */
		
		public void clickAdvSearchButton() {
			advSearchElements.advSearchBtn.click();
		}
		
		/**
		 * Get Page url
		 */
		
		public String getPageUrl() {
			return pageUrl;
		}
}

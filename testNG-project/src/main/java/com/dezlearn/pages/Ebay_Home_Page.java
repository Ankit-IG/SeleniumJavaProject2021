package com.dezlearn.pages;

import org.openqa.selenium.WebDriver;

import com.dezlearn.elements.Ebay_Home_Page_Elements;

public class Ebay_Home_Page {

	String pageUrl= "https://www.ebay.com/";
	WebDriver driver;
	Ebay_Home_Page_Elements homePageElements;
	
	public Ebay_Home_Page(WebDriver driver) {
		
		this.driver = driver;
		homePageElements = new Ebay_Home_Page_Elements(driver);
		}
	
	/**
	 * Click on search button
	 */
	
	public void clickSearchButton() {
		homePageElements.searchBtn.click();
	}
	
	/**
	 * Is Search Button Enabled
	 * 
	 */
	
	public boolean isSearchButtonEnabled() {
		return homePageElements.searchBtn.isEnabled();
	}
	
	/**
	 * Get Page url
	 */
	
	public String getPageUrl() {
		return pageUrl;
	}
	
}

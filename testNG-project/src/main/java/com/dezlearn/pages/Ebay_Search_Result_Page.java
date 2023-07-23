package com.dezlearn.pages;

import org.openqa.selenium.WebDriver;


import com.dezlearn.elements.Ebay_Search_Result_Page_Elements;

public class Ebay_Search_Result_Page {

	WebDriver driver;

	Ebay_Search_Result_Page_Elements searchresultElements;
	
	public Ebay_Search_Result_Page(WebDriver driver) {
		this.driver = driver;
		
		searchresultElements = new Ebay_Search_Result_Page_Elements(driver);
	}
	
	/**
	 * Get first Result Title
	 */
	
	public String getfirstResultTiltle() {
		return searchresultElements.firstResult.getText().trim();
	}
}

package com.dezlearn.lib;

import org.openqa.selenium.WebDriver;

import com.dezlearn.pages.Ebay_Advanced_Search_Page;
import com.dezlearn.pages.Ebay_Home_Page;
import com.dezlearn.pages.Ebay_Search_Result_Page;

public class PageLib {
	
	WebDriver driver;
	private Ebay_Home_Page homePage;
	private Ebay_Advanced_Search_Page advSearchPage;
	private Ebay_Search_Result_Page searchResultPage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		homePage = new Ebay_Home_Page(this.driver);
		advSearchPage = new Ebay_Advanced_Search_Page(this.driver);
		searchResultPage = new Ebay_Search_Result_Page(this.driver);
	}
	
	public Ebay_Home_Page homePage() {
		return homePage;
	}
	
	public Ebay_Advanced_Search_Page advSearchPage() {
		return advSearchPage;
	}
	
	public Ebay_Search_Result_Page searchResultPage() {
		return searchResultPage;
	}

}

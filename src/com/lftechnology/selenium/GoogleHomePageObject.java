/**
 * 
 */
package com.lftechnology.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author bhuwan
 * 
 */
public class GoogleHomePageObject {

	/**
	 * Initialize all the objects in the page
	 * 
	 * @param driver
	 */
	public GoogleHomePageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	public WebElement textSearch;

	@FindBy(name = "btnG")
	public WebElement btnSearch;

	@FindBy(partialLinkText = "Selenium - Web Browser Automation")
	public WebElement clickSearchResult;

	/**
	 * Responsible for google search functionality. For this it simply type the search term to the search text field and click on the
	 * button.
	 * 
	 * @param searchTerm
	 */
	public void googleSearch(String searchTerm) {
		// search for the text selenium
		textSearch.sendKeys(searchTerm);

		// Click the search button
		btnSearch.click();
	}

	/**
	 * Responsible for clicking the search result specific text link.
	 */
	public void clickOnSearchResultLink() {
		clickSearchResult.click();
	}

}

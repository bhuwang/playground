/**
 * 
 */
package com.bhuwan.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author bhuwan
 * 
 */
public class GoogleSearchTest {

	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {

		// Open the web page
		driver.navigate().to("http://www.google.com");

		// get or initialize the objects for the page
		GoogleHomePageObject googlePage = new GoogleHomePageObject(driver);

		// Search term = Selenium
		googlePage.googleSearch("Selenium");

		// Click on the search result link
		googlePage.clickOnSearchResultLink();

		// wait for 5 sec.
		Thread.sleep(10000);

		SeleniumPageObject selPage = new SeleniumPageObject(driver);
		selPage.clickDownload();
		selPage.navigateHome();

		// Close the page
		driver.quit();

	}

}

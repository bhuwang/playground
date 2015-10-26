/**
 * 
 */
package com.bhuwan.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author bhuwan
 * 
 */
public class SeleniumPageObject {

	public SeleniumPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Download")
	public WebElement lnkDownload;

	@FindBy(linkText = "Browser Automation")
	public WebElement lnkHome;

	public void clickDownload() {
		lnkDownload.click();
	}

	public void navigateHome() {
		lnkHome.click();
	}

}

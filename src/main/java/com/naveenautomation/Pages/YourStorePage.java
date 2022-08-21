package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class YourStorePage extends TestBase {

	public YourStorePage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#top-links ul li:nth-of-type(2) span:first-of-type")
	private WebElement myAccountBtn;

	@FindBy(css = "#top-links ul.dropdown-menu li:last-of-type")
	private WebElement loginBtn;

	@FindBy(css = "#content div.row>div:first-of-type button:first-of-type")
	private WebElement macbookAddToCartBtn;

	@FindBy(css = "#content div.row>div:nth-of-type(2) button:first-of-type")
	private WebElement iphoneAddToCartBtn;

	@FindBy(css = "#top-links > ul > li:nth-of-type(5) > a")
	private WebElement checkOutBtn;

	public void clickMyAccountBtn() {
		myAccountBtn.click();
	}

	public AccountLoginPage clickloginBtn() {
		loginBtn.click();
		return new AccountLoginPage();
	}

	public void clickOnMacbookAddToCartBtn() {
		macbookAddToCartBtn.click();
	}

	public void clickOnIphoneAddToCartBtn() {
		iphoneAddToCartBtn.click();
	}

	public CheckoutPage clickOnCheckOutBtn() {
		clickOnIphoneAddToCartBtn();
		clickOnMacbookAddToCartBtn();
		checkOutBtn.click();
		return new CheckoutPage();
	}

}
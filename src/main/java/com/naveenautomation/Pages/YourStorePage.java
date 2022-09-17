package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class YourStorePage extends TestBase {

	public YourStorePage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "[title='My Account']")
	private WebElement myAccountBtn;

	@FindBy(css = "#top-links ul.dropdown-menu li:last-of-type")
	private WebElement loginBtn;

	@FindBy(css = "#top-links ul.dropdown-menu li:first-of-type")
	private WebElement registerBtn;

	@FindBy(css = "#content div.row>div:first-of-type button:first-of-type")
	private WebElement macbookAddToCartBtn;

//	@FindBy(css = "#content div.row>div:nth-of-type(2) button:first-of-type")
//	private WebElement iphoneAddToCartBtn;

	@FindBy(css = "#top-links > ul > li:nth-of-type(5) > a")
	private WebElement checkOutBtn;

	public void clickMyAccountBtn() {
		Utils.click(myAccountBtn);
	}

	public RegisterAccountPage clickOnRegisterBtn() {
		Utils.click(registerBtn);
		return new RegisterAccountPage();
	}

	public AccountLoginPage clickloginBtn() {
		Utils.click(loginBtn);
		return new AccountLoginPage();
	}

	public void clickOnMacbookAddToCartBtn() {
		Utils.click(macbookAddToCartBtn);
	}

//	public void clickOnIphoneAddToCartBtn() {
//		Utils.click(iphoneAddToCartBtn);
//	}

	public CheckoutPage clickOnCheckOutBtn() {
//		clickOnIphoneAddToCartBtn();
		clickOnMacbookAddToCartBtn();
		Utils.click(checkOutBtn);
		return new CheckoutPage();
	}

}
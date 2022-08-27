package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#account-account>ul>li:first-of-type>a>i")
	private WebElement homeBtn;

	@FindBy(css = "#content h2")
	private WebElement myaccountText;

	@FindBy(css = "#content>ul:first-of-type>li:nth-of-type(2)>a")
	private WebElement changePasswordBtn;

	@FindBy(css = "#content>ul:nth-of-type(2)>li:first-of-type>a")
	private WebElement viewMyOrderHistoryBtn;

	@FindBy(css = "#account-account>div:first-of-type")
	private WebElement successMessage;

	public YourStorePage clickHomeBtn() {
		homeBtn.click();
		return new YourStorePage();
	}

	public String getTextFromMyAccount() {
		return myaccountText.getText();
	}

	public ChangePasswordPage clickChangePasswordBtn() {
		changePasswordBtn.click();
		return new ChangePasswordPage();

	}

	public String successMessageForPasswordChange() {
		return successMessage.getText();
	}

	public OrderHistoryPage clickViewMyOrderHistoryBtn() {
		viewMyOrderHistoryBtn.click();
		return new OrderHistoryPage();

	}

}
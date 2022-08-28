package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		waitForDocumentCompleteState(10);
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
		Utils.click(homeBtn);
		return new YourStorePage();
	}

	public String getTextFromMyAccount() {
		return Utils.getText(myaccountText);
	}

	public ChangePasswordPage clickChangePasswordBtn() {
		Utils.click(changePasswordBtn);
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
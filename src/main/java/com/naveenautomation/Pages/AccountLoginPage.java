package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class AccountLoginPage extends TestBase {
	public AccountLoginPage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "input-email")
	private WebElement inputEmailField;

	@FindBy(id = "input-password")
	private WebElement enterPasswordField;

	@FindBy(css = "input[type='submit']")
	private WebElement submitBtn;

	public void enterEmail(String email) {
		Utils.sendKeys(inputEmailField, email);
	}

	public void enterPassword(String password) {
		Utils.sendKeys(enterPasswordField, password);
	}

	public MyAccountPage clickSubmitBtn() {
		Utils.submit(submitBtn);
		return new MyAccountPage();
	}

	public MyAccountPage login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		return clickSubmitBtn();
	}
}

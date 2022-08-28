package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class ChangePasswordPage extends TestBase {

	public ChangePasswordPage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#input-password")
	private WebElement newPassword;

	@FindBy(css = "#input-confirm")
	private WebElement confirmPassword;

	@FindBy(css = "input[class='btn btn-primary']")
	private WebElement continueBtn;

	public void enterNewPassword(String newPass) {
		Utils.sendKeys(newPassword, newPass);
	}

	public void enterConfirmPassword(String confirmPass) {
		Utils.sendKeys(confirmPassword, confirmPass);
	}

	public MyAccountPage clichContinueBtn(String newPass, String confirmPass) {
		enterNewPassword(newPass);
		enterConfirmPassword(confirmPass);
		Utils.click(continueBtn);
		return new MyAccountPage();
	}
}

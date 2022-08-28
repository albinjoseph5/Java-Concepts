package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class RegisterAccountPage extends TestBase {
	public RegisterAccountPage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#input-firstname")
	WebElement firstNameInputField;

	@FindBy(css = "#input-lastname")
	WebElement lastNameInputField;

	@FindBy(css = "#input-email")
	WebElement emailInputField;

	@FindBy(css = "#input-telephone")
	WebElement phoneNumberInputField;

	@FindBy(css = "#input-password")
	WebElement passwordInputField;

	@FindBy(css = "#input-confirm")
	WebElement confirmPasswordInputField;

	@FindBy(css = "#content div.buttons input:first-of-type")
	WebElement privacyPolicyCheckBox;

	@FindBy(css = "input.btn.btn-primary")
	WebElement continueBtn;

	public void enterfirstNameInputField(String firstName) {
		Utils.sendKeys(firstNameInputField, firstName);
	}

	public void enterLastNameInputField(String lastName) {
		Utils.sendKeys(lastNameInputField, lastName);
	}

	public void enterEmailInputField(String emailID) {
		Utils.sendKeys(emailInputField, emailID);
	}

	public void enterPhoneNumberInputField(String phoneNumber) {
		Utils.sendKeys(phoneNumberInputField, phoneNumber);
	}

	public void enterPasswordInputField(String password) {
		Utils.sendKeys(passwordInputField, password);
	}

	public void enterConfirmPasswordInputField(String confirmPassword) {
		Utils.sendKeys(confirmPasswordInputField, confirmPassword);
	}

	public void clickOnPrivacyPolicyCheckBox() {
		Utils.click(privacyPolicyCheckBox);
	}

	public YourAccountHasBeenCreatedPage clickOnContinueBtn(String firstName, String lastName, String emailID,
			String phonrNumber, String password, String confirmPassword) {
		enterfirstNameInputField(firstName);
		enterLastNameInputField(lastName);
		enterEmailInputField(emailID);
		enterPhoneNumberInputField(phonrNumber);
		enterPasswordInputField(password);
		enterConfirmPasswordInputField(confirmPassword);
		clickOnPrivacyPolicyCheckBox();
		Utils.submit(continueBtn);
		return new YourAccountHasBeenCreatedPage();
	}
}

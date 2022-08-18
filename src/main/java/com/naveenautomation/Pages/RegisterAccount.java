package com.naveenautomation.Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAccount {
	WebDriver driver;

	Random randomNumber = new Random();
	String randomEmailID;
	WebElement firstNameInputField = driver.findElement(By.cssSelector("#input-firstname"));
	WebElement lastNameInputField = driver.findElement(By.cssSelector("#input-lastname"));
	WebElement emailInputField = driver.findElement(By.cssSelector("#input-email"));
	WebElement phoneNumberInputField = driver.findElement(By.cssSelector("#input-telephone"));
	WebElement passwordInputField = driver.findElement(By.cssSelector("#input-password"));
	WebElement confirmPasswordInputField = driver.findElement(By.cssSelector("#input-confirm"));
	WebElement subscribeYesRadioBtn = driver.findElement(By.cssSelector("label.radio-inline:nth-of-type(1) input"));
	WebElement privacyPolicyCheckBox = driver.findElement(By.cssSelector("#content div.buttons input:first-of-type"));
	WebElement continueBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));

	public void enterfirstNameInputField() {
		firstNameInputField.sendKeys("User");
	}

	public void enterLastNameInputField() {
		lastNameInputField.sendKeys("Name");
	}

	public void enterEmailInputField() {
		randomEmailID = "user" + randomNumber.nextInt(5000) + "@gmail.com";
		emailInputField.sendKeys(randomEmailID);
	}

	public void enterPhoneNumberInputField() {
		phoneNumberInputField.sendKeys("1234567890");
	}

	public void enterPasswordInputField() {
		passwordInputField.sendKeys("Qwerty123");
	}

	public void enterConfirmPasswordInputField() {
		confirmPasswordInputField.sendKeys("Qwerty123");
	}

	public void clickOnSubscribeYesRadioBtn() {
		subscribeYesRadioBtn.click();
	}

	public void clickOnPrivacyPolicyCheckBox() {
		privacyPolicyCheckBox.click();
	}

	public void clickOnContinueBtn() {
		continueBtn.submit();
	}
}

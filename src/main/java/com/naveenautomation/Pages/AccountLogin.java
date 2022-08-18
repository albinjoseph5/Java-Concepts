package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLogin {
	WebDriver driver;

	WebElement loginEmailInputField = driver.findElement(By.id("input-email"));
	WebElement loginPasswordInputField = driver.findElement(By.id("input-password"));
	WebElement loginSubmitBtn = driver
			.findElement(By.cssSelector("#content div.col-sm-6:last-of-type div.well form>input"));

	public void enterLoginEmailInputField() {
		loginEmailInputField.sendKeys(new RegisterAccount().randomEmailID);
	}

	public void enterLoginPasswordInputField() {
		loginPasswordInputField.sendKeys("Qwerty123");
	}

	public void clickLoginSubmitBtn() {
		loginSubmitBtn.submit();
	}
}

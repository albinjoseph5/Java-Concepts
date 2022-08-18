package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {
	WebDriver driver;
	WebDriverWait wait;
	WebElement billingFirstNameInputField = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-payment-firstname")));
	WebElement billingLastNameInputField = driver.findElement(By.id("input-payment-lastname"));
	WebElement billingAddressInputField = driver.findElement(By.id("input-payment-address-1"));
	WebElement billingCityInputField = driver.findElement(By.id("input-payment-city"));
	WebElement billingPostalCodeInputField = driver.findElement(By.id("input-payment-postcode"));

	public void enterBillingFirstNameInputField() {
		billingFirstNameInputField.sendKeys("User");
	}

	public void enterBillingLastNameInputField() {
		billingLastNameInputField.sendKeys("User");
	}

	public void enterBillingAddressInputField() {
		billingAddressInputField.sendKeys("2 Mccowan Rd");
	}

	public void enterBillingCityInputField() {
		billingCityInputField.sendKeys("Markham");
	}

	public void enterBillingPostalCodeInputField() {
		billingPostalCodeInputField.sendKeys("M1T1P8");
	}

	public void selectCountry() {
		select(driver.findElement(By.id("input-payment-country")), "Canada");
	}

	public void selectZone() {
		select(driver.findElement(By.id("input-payment-zone")), "Ontario");
	}

	public void select(WebElement element, String selectedElement) {
		Select sc = new Select(element);
		wait.until(ExpectedConditions.textToBePresentInElement(element, selectedElement));
		sc.selectByVisibleText(selectedElement);

	}

	public void clickOnBillingContinueBtn() {
		driver.findElement(By.id("button-payment-address")).click();
	}

	public void clickOnDeliveryDetailsContinueBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
		driver.findElement(By.cssSelector("#button-shipping-address")).click();
	}

	public void clickOnDeliveryMethodContinueBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method"))).click();
	}

	public void clickOnPaymentMethodCheckbox() {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='checkbox']")));
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	}

	public void clickOnPaymentMethodContinueBtn() {
		driver.findElement(By.id("button-payment-method")).click();
	}

	public void clickOnConfirmBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm"))).click();
	}
	
}

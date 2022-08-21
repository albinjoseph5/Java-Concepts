package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.naveenautomation.Base.TestBase;

public class CheckoutPage extends TestBase {
	public CheckoutPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "button-payment-address")
	private WebElement billingDetailsContinueBtn;
	
	@FindBy(id = "button-shipping-address")
	private WebElement deliveryDetailsContinueBtn;
	
	@FindBy(id = "button-shipping-method")
	private WebElement deliveryMethodContinueBtn;

	@FindBy(css = "input[type='checkbox']")
	private WebElement paymentMethodCheckbox;
	
	@FindBy(id = "button-payment-method")
	private WebElement paymentMethodContinueBtn;
	
	@FindBy(id = "button-confirm")
	private WebElement confirmBtn;

	public void clickOnBillingContinueBtn() {
		billingDetailsContinueBtn.click();
	}

	public void clickOnDeliveryDetailsContinueBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(deliveryDetailsContinueBtn)).click();
	}

	public void clickOnDeliveryMethodContinueBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(deliveryMethodContinueBtn)).click();
	}

	public void clickOnPaymentMethodCheckbox() {
		wait.until(ExpectedConditions.elementToBeClickable(paymentMethodCheckbox)).click();
	}

	public void clickOnPaymentMethodContinueBtn() {
		paymentMethodContinueBtn.click();
	}

	public YourOrderHasBeenPlacedPage  clickOnConfirmBtn() {
		clickOnBillingContinueBtn();
		clickOnDeliveryDetailsContinueBtn();
		clickOnDeliveryMethodContinueBtn();
		clickOnPaymentMethodCheckbox();
		clickOnPaymentMethodContinueBtn();
		confirmBtn.click();
		return new YourOrderHasBeenPlacedPage();
	}

}

package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class CheckoutPage extends TestBase {
	public CheckoutPage() {
		waitForDocumentCompleteState(10);
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
		Utils.click(billingDetailsContinueBtn);
	}

	public void clickOnDeliveryDetailsContinueBtn() {
		Utils.click(deliveryDetailsContinueBtn);
	}

	public void clickOnDeliveryMethodContinueBtn() {
		Utils.click(deliveryMethodContinueBtn);
	}

	public void clickOnPaymentMethodCheckbox() {
		Utils.click(paymentMethodCheckbox);
	}

	public void clickOnPaymentMethodContinueBtn() {
		Utils.click(paymentMethodContinueBtn);
	}

	public YourOrderHasBeenPlacedPage clickOnConfirmBtn() {
		clickOnBillingContinueBtn();
		clickOnDeliveryDetailsContinueBtn();
		clickOnDeliveryMethodContinueBtn();
		clickOnPaymentMethodCheckbox();
		clickOnPaymentMethodContinueBtn();
		Utils.click(confirmBtn);
		return new YourOrderHasBeenPlacedPage();
	}

}

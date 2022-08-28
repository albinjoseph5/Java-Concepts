package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class YourOrderHasBeenPlacedPage extends TestBase {
	
	public YourOrderHasBeenPlacedPage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(css = "#content h1")
	private WebElement successMessage;


	public String successMessageDisplayed() {
		wait.until(ExpectedConditions.textToBePresentInElement(successMessage,"Your order has been placed!"));
		return Utils.getText(successMessage);
	}

}

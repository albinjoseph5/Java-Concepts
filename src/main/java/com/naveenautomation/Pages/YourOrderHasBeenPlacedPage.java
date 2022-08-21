package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomation.Base.TestBase;

public class YourOrderHasBeenPlacedPage extends TestBase {
	
	public YourOrderHasBeenPlacedPage() {
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(css = "#content h1")
	private WebElement successMessage;


	public String successMessageDisplayed() {
		wait.until(ExpectedConditions.textToBePresentInElement(successMessage,"Your order has been placed!"));
		return successMessage.getText();
	}

}

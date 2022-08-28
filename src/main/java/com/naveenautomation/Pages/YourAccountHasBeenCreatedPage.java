package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class YourAccountHasBeenCreatedPage extends TestBase {
	public YourAccountHasBeenCreatedPage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement registerSuccessMessage;

	public String getRegisterSuccessMessage() {
		return Utils.getText(registerSuccessMessage);
	}

}

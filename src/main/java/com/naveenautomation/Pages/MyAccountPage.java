package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#account-account>ul>li:first-of-type>a>i")
	private WebElement homeBtn;

	public YourStorePage clickHomeBtn() {
		homeBtn.click();
		return new YourStorePage();
	}

}
package com.naveenautomation.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.YourStorePage;

public class AccountLoginTest extends TestBase {
	YourStorePage yourStorePage;
	AccountLoginPage accountLogin;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		yourStorePage = new YourStorePage();

	}

	@Test
	public void verifyCustomerLogin() {
		yourStorePage.clickMyAccountBtn();
		accountLogin = yourStorePage.clickloginBtn();
		MyAccountPage myAccountPage = accountLogin.login("user16@gmail.com", "Qwerty123");
		Assert.assertEquals(myAccountPage.getTextFromMyAccount(), "My Account", "Title doesnot Match");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
}

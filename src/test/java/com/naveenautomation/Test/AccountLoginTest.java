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
	YourStorePage yp;
	AccountLoginPage accountLogin;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		yp = new YourStorePage();
		yp.clickMyAccountBtn();
		accountLogin = yp.clickloginBtn();
	}

	@Test
	public void verifyCustomerLogin() {
		MyAccountPage map = accountLogin.login("user11@gmail.com", "Qwerty123");
		Assert.assertEquals(map.getTextFromMyAccount(), "My Account", "Title doesnot Match");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
}

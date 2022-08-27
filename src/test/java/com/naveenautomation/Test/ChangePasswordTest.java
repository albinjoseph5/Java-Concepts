package com.naveenautomation.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.ChangePasswordPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.YourStorePage;

public class ChangePasswordTest extends TestBase {
	YourStorePage yp;
	AccountLoginPage accountLogin;
	MyAccountPage map;
	ChangePasswordPage cpp;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		yp = new YourStorePage();

	}

	@Test
	public void verifyChangePassword() {
		yp.clickMyAccountBtn();
		accountLogin = yp.clickloginBtn();
		map = accountLogin.login("user1@gmail.com", "Qwerty12345");
		cpp = map.clickChangePasswordBtn();
		map = cpp.clichContinueBtn("Qwerty12345", "Qwerty12345");
		Assert.assertEquals(map.successMessageForPasswordChange(),
				"Success: Your password has been successfully updated.");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
}

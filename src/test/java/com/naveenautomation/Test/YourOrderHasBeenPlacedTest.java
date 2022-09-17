package com.naveenautomation.Test;

import org.junit.Ignore;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.CheckoutPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.YourOrderHasBeenPlacedPage;
import com.naveenautomation.Pages.YourStorePage;

public class YourOrderHasBeenPlacedTest extends TestBase {

	YourStorePage yourStorePage;
	AccountLoginPage accountLogin;
	MyAccountPage myAccountPage;
	CheckoutPage checkout;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		yourStorePage = new YourStorePage();

	}

	@Test()@Ignore
	public void verifyCheckout() {
		yourStorePage.clickMyAccountBtn();
		accountLogin = yourStorePage.clickloginBtn();
		myAccountPage = accountLogin.login("user13@gmail.com", "Qwerty123");
		yourStorePage = myAccountPage.clickHomeBtn();
		checkout = yourStorePage.clickOnCheckOutBtn();
		YourOrderHasBeenPlacedPage orderPlaced = checkout.clickOnConfirmBtn();
//		Assert.assertEquals(orderPlaced.successMessageDisplayed(), "Your Account Has Been Created!",
//				"Success message doesnot match");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
}

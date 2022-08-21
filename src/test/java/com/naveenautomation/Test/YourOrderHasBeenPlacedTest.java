package com.naveenautomation.Test;

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

public class YourOrderHasBeenPlacedTest extends TestBase{
	
	YourStorePage yp;
	AccountLoginPage accountLogin;
	MyAccountPage map;
	CheckoutPage checkout;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		yp = new YourStorePage();
		yp.clickMyAccountBtn();
		accountLogin = yp.clickloginBtn();
		map = accountLogin.login("user10@gmail.com", "Qwerty123");
		yp=map.clickHomeBtn();
		checkout=yp.clickOnCheckOutBtn();
	}

	@Test
	public void verifyCheckout() {
		YourOrderHasBeenPlacedPage orderPlaced=checkout.clickOnConfirmBtn();
		Assert.assertEquals(orderPlaced.successMessageDisplayed(), "Your order has been placed!","Success message doesnot match");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
}

package com.naveenautomation.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.OrderHistoryPage;
import com.naveenautomation.Pages.OrderHistoryPage.Table_example;
import com.naveenautomation.Pages.YourStorePage;

public class OrderHistoryTest extends TestBase {
	YourStorePage yourStorePage;
	AccountLoginPage accountLogin;
	MyAccountPage myAccountPage;
	OrderHistoryPage orderHistoryPage;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		yourStorePage = new YourStorePage();

	}

	@Test
	public void verifyOrderHistoryTest() {
		yourStorePage.clickMyAccountBtn();
		accountLogin = yourStorePage.clickloginBtn();
		myAccountPage = accountLogin.login("user13@gmail.com", "Qwerty123");
		orderHistoryPage = myAccountPage.clickViewMyOrderHistoryBtn();
		Assert.assertEquals(orderHistoryPage.getTextfromLastDate("#1410", Table_example.DATE_ADDED), "25/08/2022",
				"Total doesn't match");
		Assert.assertEquals(orderHistoryPage.getTextfromLastTotal("#1410", Table_example.TOTAL), "$1,458.40",
				"Total doesn't match");

	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
}

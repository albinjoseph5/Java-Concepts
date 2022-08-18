package com.naveenautomation.Test;

import org.testng.Assert;

import com.naveenautomation.Pages.AccountLogout;

public class AccountLogoutTest {

	AccountLogout ac = new AccountLogout();

	public void TestingSuccessMessage() {
		Assert.assertEquals(ac.successMessageDisplayed(), "Your order has been placed!", "Text doesnot match");
	}
}

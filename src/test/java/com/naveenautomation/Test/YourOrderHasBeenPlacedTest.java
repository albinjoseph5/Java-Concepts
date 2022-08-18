package com.naveenautomation.Test;

import org.testng.Assert;

import com.naveenautomation.Pages.YourOrderHasBeenPlaced;

public class YourOrderHasBeenPlacedTest {

	YourOrderHasBeenPlaced yp = new YourOrderHasBeenPlaced();

	public void TestingSuccessMessage() {
		Assert.assertEquals(yp.successMessageDisplayed(), "Your order has been placed!", "Text doesnot match");
	}
}

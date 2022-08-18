package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAccountHasBeenCreated {
	WebDriver driver;
	WebElement myAccountBtn = driver.findElement(By.cssSelector("#top-links ul.list-inline>li:nth-of-type(2)>a"));
	WebElement logoutBtn = driver
			.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-of-type(5) > a"));

	public void clickONMyAccountBtn() {
		myAccountBtn.click();
	}

	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}
}

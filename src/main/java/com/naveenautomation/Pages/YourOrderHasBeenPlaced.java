package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourOrderHasBeenPlaced {
	WebDriver driver;
	WebDriverWait wait;

	WebElement myAccountBtn = driver.findElement(By.cssSelector("#top-links ul.list-inline>li:nth-of-type(2)>a"));
	WebElement logoutBtn = driver
			.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-of-type(5) > a"));

	public String successMessageDisplayed() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#content h1"),
				"Your order has been placed!"));
		return driver.findElement(By.cssSelector("#content h1")).getText();
	}

	public void clickOnMyAccountBtn() {
		myAccountBtn.click();
	}

	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}
}

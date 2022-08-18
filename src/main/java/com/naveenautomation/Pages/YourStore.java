package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourStore {
	WebDriver driver;

	WebElement macbookAddToCartBtn = driver
			.findElement(By.cssSelector("#content div.row>div:first-of-type button:first-of-type"));
	WebElement iphoneAddToCartBtn = driver
			.findElement(By.cssSelector("#content div.row>div:nth-of-type(2) button:first-of-type"));
	WebElement checkOutBtn = driver.findElement(By.cssSelector("#top-links > ul > li:nth-of-type(5) > a"));

	public void clickOnMacbookAddToCartBtn() {
		macbookAddToCartBtn.click();
	}

	public void clickOnIphoneAddToCartBtn() {
		iphoneAddToCartBtn.click();
	}

	public void clickOnCheckOutBtn() {
		checkOutBtn.click();
	}
}

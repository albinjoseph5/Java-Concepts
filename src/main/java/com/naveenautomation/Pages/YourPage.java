package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourPage {
	WebDriver driver;

	WebElement myAccountBtn = driver.findElement(By.cssSelector("#top-links ul.list-inline>li:nth-of-type(2)>a"));
	WebElement registerBtn = driver.findElement(By.cssSelector("#top-links ul.dropdown-menu>li:first-of-type>a"));

	public void clickOnMyAccountBtn() {
		myAccountBtn.click();
	}

	public void clickOnRegisterBtn() {
		registerBtn.click();
	}
}

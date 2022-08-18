package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountLogout {
	WebDriver driver;
	WebDriverWait wait;

	WebElement myAccountBtn = driver.findElement(By.cssSelector("#top-links ul.list-inline>li:nth-of-type(2)>a"));
	WebElement loginBtn = driver.findElement(By.cssSelector("#top-links ul.dropdown-menu>li:last-of-type>a"));

	public void clickONMyAccountBtn() {
		myAccountBtn.click();
	}

	public void clickOnLogInBtn() {
		loginBtn.click();
	}

	public String successMessageDisplayed() {
		return driver.findElement(By.cssSelector("#content h1")).getText();
	}
}

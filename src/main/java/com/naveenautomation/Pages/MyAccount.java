package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	WebDriver driver;
	WebElement homeBtn = driver.findElement(By.cssSelector("#account-account>ul>li:first-of-type a i"));

	public void clickOnhomeBtn() {
		homeBtn.click();
	}
}

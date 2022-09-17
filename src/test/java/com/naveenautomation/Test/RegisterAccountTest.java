package com.naveenautomation.Test;

import org.junit.Ignore;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Pages.RegisterAccountPage;
import com.naveenautomation.Pages.YourAccountHasBeenCreatedPage;
import com.naveenautomation.Pages.YourStorePage;
import com.naveenautomation.Utils.ExcelUtils;

public class RegisterAccountTest extends TestBase {
	YourStorePage yourStorePage;
	RegisterAccountPage registerAccountPage;
	YourAccountHasBeenCreatedPage yourAccountHasBeenCreatedPage;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		yourStorePage = new YourStorePage();

	}
	@Ignore
	@Test(dataProvider = "SignUpData")
	public void registerAccountTest(String firstName, String lastName, String emailID, String phonrNumber,
			String password, String confirmPassword) {
		yourStorePage.clickMyAccountBtn();
		registerAccountPage = yourStorePage.clickOnRegisterBtn();
		yourAccountHasBeenCreatedPage = registerAccountPage.clickOnContinueBtn(firstName, lastName, emailID,
				phonrNumber, password, confirmPassword);
		Assert.assertEquals(yourAccountHasBeenCreatedPage.getRegisterSuccessMessage(),
				"Your Account Has Been Created!");
	}

	@DataProvider(name = "SignUpData")
	String[][] dataProviderToLogin() throws Exception {
		String filePath = "C:\\Users\\tintu\\OneDrive\\Desktop\\Testing\\SignUp_Data.xlsx";
		int row = ExcelUtils.getRowsCount(filePath, "Sheet1");
		int col = ExcelUtils.getColumnCount(filePath, "Sheet1", row);

		String[][] logindata = new String[row][col];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {
				logindata[i - 1][j] = ExcelUtils.getCellData(filePath, "Sheet1", i, j);
			}
		}

		return logindata;

	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}

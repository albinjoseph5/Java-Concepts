package com.naveenautomation.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomation.Base.TestBase;

public class Utils extends TestBase {
	public static final int IMPLICIT_WAIT = 10;
	public static final int PAGE_LOAD_WAIT = 30;
	public static final int EXPLICIT_WAIT = 10;

//Taking screenshots
	public static void takeFailedTestScreenshots(String testCaseName) {

//		current date and time
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		save the screen shot
		File screenShotFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShotFile,
					new File("./FailedScreenShot\\" + "_" + testCaseName + "_" + timeStamp + ".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to save or take the screenshot" + testCaseName);
		}
	}

}

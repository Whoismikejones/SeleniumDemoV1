package com.SeleniumDemo.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SeleniumDemo.pageObjects.Home;
import com.SeleniumDemo.pageObjects.Login;
import com.SeleniumDemo.utilities.XLUtils;

public class TC_LoginDDT_003 extends BaseClass {
	// ****Negative scenarios

	@Test(dataProvider = "LoginData")
	public void loginDDT(String email, String pwd) throws Exception {
		Home hm = new Home(driver);
		Login lg = new Login(driver);
		// System.out.println(email + " " + pwd);
		logger.info("Url is opened");
		try {
			hm.clickLogin();
			Thread.sleep(2000);
			lg.setEmail(email);
			Thread.sleep(2000);
			lg.setPassword(pwd);
			Thread.sleep(2000);
			lg.clickLogin();
			Thread.sleep(2000);

			if (hm.AccountButtonPresent() == false) {

				System.out.println("User unable to logIn");
				Assert.assertTrue(true);
				driver.get("https://demo.nopcommerce.com/");
				logger.info("Test Passed");
			} else {

				System.out.println("User able to logIn");
				Assert.assertTrue(false);
				lg.clickLogOutButton();
				logger.warn("Test Failed");
				captureScreen(driver, "TC_LoginDDT_003");
			}
		} catch (Exception e) {
			logger.error("Exception encountered" + e.getMessage());
		}

	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/SeleniumDemo/testData/Login_Data_002.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");

		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {

			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0
			}

		}
		return logindata;
	}

}

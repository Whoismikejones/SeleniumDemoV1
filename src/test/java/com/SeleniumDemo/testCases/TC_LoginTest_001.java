package com.SeleniumDemo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);

		logger.info("Url is opened");
		try {
			if (driver.getTitle().equals("nopCommerce demo store")) {
				Assert.assertTrue(true);
				logger.info("Test Passed");

			} else {
				captureScreen(driver, "TC_LoginTest_001");
				Assert.assertTrue(false);
				logger.error("Test Failed");
			}
		} catch (Exception e) {
			logger.warn("Exception encountered");
		}
	}

}

package com.SeleniumDemo.testCases;

//import static org.testng.Assert.assertThrows;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumDemo.pageObjects.Home;
import com.SeleniumDemo.pageObjects.Register;
import com.SeleniumDemo.pageObjects.Registration_Result;

public class TC_LoginTest_004 extends BaseClass {

	@Test
	public void registerGuestDDT() throws Exception {
		Home hm = new Home(driver);
		Register rg = new Register(driver);
		Registration_Result rr = new Registration_Result(driver);

		try {
			logger.info("Url is opened");
			hm.clickRegister();
			Thread.sleep(1000);

			rg.maleRadioClick();
			Thread.sleep(1000);

			logger.info("Providing customer details");
			rg.enterFirstName("Test");
			Thread.sleep(1000);

			rg.enterLastName("Tester");
			Thread.sleep(1000);

			rg.selectDay(11);
			Thread.sleep(1000);

			rg.selectMonth(3);
			Thread.sleep(1000);

			rg.selectYear("1981");
			Thread.sleep(1000);

			rg.enterEmail(generateRandomEmail() + "@gmail.com");
			Thread.sleep(1000);

			rg.companyName("Company");
			Thread.sleep(1000);

			rg.enterAndConfirmPassword(generateRandomPassword());
			Thread.sleep(1000);

			rg.clickRegister();
			Thread.sleep(1000);

			String actualText = rr.registrationText();
			String loginConf = "Your registration completed";
			if (actualText.equals(loginConf)) {
				logger.info("Test Passed");
				Assert.assertTrue(true);
			} else {
				logger.warn("Test Failed");
				captureScreen(driver, "TC_LoginTest_004");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			logger.warn("Exception encountered");
		}

	}

	public String generateRandomEmail() {
		// CreateAString 6 random characters long
		String generatedEmail = RandomStringUtils.randomAlphabetic(6);

		return generatedEmail;
	}

	public String generateRandomPassword() {
		String generatedPassword = RandomStringUtils.randomAlphabetic(7);

		return generatedPassword;
	}

}

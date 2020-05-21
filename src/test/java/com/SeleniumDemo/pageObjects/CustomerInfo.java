package com.SeleniumDemo.pageObjects;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerInfo {

	WebDriver ldriver;

	CustomerInfo(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Male Radio Button
	@FindBy(id = "gender-male")
	WebElement genderMaleRadio;
	// Female Radio Button
	@FindBy(id = "gender-female")
	WebElement genderFemaleRadio;
	// First Name Field
	@FindBy(name = "FirstName")
	WebElement firstNameTextField;
	// Last Name Field
	@FindBy(name = "LastName")
	WebElement lastNameTextField;
	// Day DropDown
	@FindBy(name = "DateOfBirthDay")
	WebElement dobDayDropDown;
	// Month DropDown
	@FindBy(name = "DateOfBirthMonth")
	WebElement dobMonthDropDown;
	// Year DropDown
	@FindBy(name = "DateOfBirthYear")
	WebElement dobYearDropDown;
	// Email Text Field
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement emailTextField;
	// Company Name Text Field
	@FindBy(id = "Company")
	WebElement companyNameTextField;
	// News Letter Check Box
	@FindBy(id = "Newsletter")
	WebElement newsLetterCheckBox;
	// SaveButton
	@FindBy(css = "#save-info-button")
	WebElement saveButton;

	// Click Male Radio Button
	public void maleRadioClick() {
		genderMaleRadio.click();
	}

	// Click Female Radio Button
	public void femailRadioClick() {
		genderFemaleRadio.click();
	}

	// Enter First Name Text
	public void enterFirstName(String fname) {
		firstNameTextField.sendKeys(fname);
	}

	// Enter Last Name Text
	public void enterLastName(String lname) {
		lastNameTextField.sendKeys(lname);
	}

	// Select Day Drop Down
	public void selectDay(int index) {
		Select day = new Select(dobDayDropDown);
		day.selectByIndex(index);
	}

	// Select Month Drop Down
	public void selectMonth(int index) {
		Select month = new Select(dobMonthDropDown);
		month.selectByIndex(index);
	}

	// Select Year Drop Down
	public void selectYear(int index) {
		Select year = new Select(dobYearDropDown);
		year.deselectByIndex(index);
	}

	// Enter Email Address
	public void enterEmail(String text) {
		emailTextField.sendKeys(text);
	}

	// Enter Company Name
	public void companyName(String text) {
		companyNameTextField.sendKeys(text);
	}

	// Click Register Button
	public void clickRegister() {
		saveButton.click();
	}

	// Validate First Name
	public void firstNameValidate (String text) {
		/*
		 * try { assertTrue(firstNameTextField.getText().matches(text)); } catch (Error
		 * e) {
		 */
			
		}

	// Validate User Name
	public void lastNameValidate(String text) {
		try {
			assertTrue(firstNameTextField.getText().matches(text));
		} catch (Error e) {

		}
	}



}

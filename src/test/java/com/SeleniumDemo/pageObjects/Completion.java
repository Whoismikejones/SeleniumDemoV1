package com.SeleniumDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Completion {

	
	WebDriver ldriver;
	
	Completion (WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	//Continue Button
	@FindBy(name = "register-continue")
	WebElement continueButton;
	
	//Click Continue Button
	public void clickContinue() {
		continueButton.click();
	}
}

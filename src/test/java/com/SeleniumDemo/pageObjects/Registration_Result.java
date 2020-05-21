package com.SeleniumDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Result {

	WebDriver ldriver;
	
	public Registration_Result (WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	//Registration Text field
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")
	WebElement registrationCompleteText; 
	
	
	public String registrationText(){
		return registrationCompleteText.getText();
	}
		/*
		 * if (regText == "Your registration completed") { return true; } else { return
		 * false; }
		 */
	
		
	}
	


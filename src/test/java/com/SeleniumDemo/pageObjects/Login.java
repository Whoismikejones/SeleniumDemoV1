package com.SeleniumDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	WebDriver ldriver;
	
	public Login(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Register Button
	@FindBy(css = ".button-1")
	WebElement registrationButton;
	
	//Email Text 
	@FindBy(id = "Email")
	WebElement emailTextField;
	
	//Password Text
	@FindBy(id = "Password")
	WebElement passwordTextField;
	
	//Remember Me Checkbox
	@FindBy(id = "RememberMe")
	WebElement  rememberMeCheckBox;
	
	//Forgot Password Link
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a")
	WebElement forgotPassword;
	
	//Login Button
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement Login;
	
	//LogOut Button
	@FindBy(className = "ico-logout")
	WebElement Logout;
	
	//Returning Customer Error text
	@FindBy(className = "message-error_validation-summary-errors")
	WebElement errorText;
	
	//Enter Email Address
	public void setEmail(String text) {
		emailTextField.sendKeys(text);
	}
	//Enter Password 
	public void setPassword(String text) {
		passwordTextField.sendKeys(text);
	}
	
	//Click the LogOut button 
	public void clickLogOutButton() {
		Logout.click();
	}
	//Click Login
	public void clickLogin() {
		Login.click();
	}
	
	public void loginError() {
		errorText.getText();
	}
	

}

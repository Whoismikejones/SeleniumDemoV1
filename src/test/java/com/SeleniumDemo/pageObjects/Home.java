package com.SeleniumDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home {

	// import and initialize local WebDriver
	WebDriver ldriver;

	// Create constructor for remote driver
	public Home(WebDriver rdriver) {
		ldriver = rdriver;
		// initialize Page Factory Class
		PageFactory.initElements(rdriver, this);
	}

	// Register Button
	@FindBy(className = "ico-register")
	WebElement registerButton;

	// Login Button
	@FindBy(className = "ico-login")
	WebElement loginButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement logOutButton;

	// wish list Button
	@FindBy(className = "ico-wishlist")
	WebElement wishListButton;

	// Shopping Cart Button
	@FindBy(className = "ico-cart")
	WebElement shoppingCartButton;

	// nopCommerce Link
	@FindBy(css = "body > div.master-wrapper-page > div.header > div.header-lower > div.header-logo > a > img")
	WebElement nopCommerceLogo;

	// Search Field
	@FindBy(id = "small-searchterms")
	WebElement searchField;

	// SearchButton
	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	WebElement searchBtn;

	// My Account Button
	// Only present after successful login
	@FindBy(className = "ico-account")
	WebElement myAccountButton;

	// Click Register Button
	public void clickRegister() {
		registerButton.click();
	}

	// Click Login Button
	public void clickLogin() {
		loginButton.click();
	}

	// Click LogOut Button
	public void clickLogOut() {
		logOutButton.click();
	}

	// Click Wish List Button
	public void clickWishList() {
		wishListButton.click();
	}

	// Click Shopping Cart button
	public void clickShoppingCart() {
		shoppingCartButton.click();
	}

	// Click Commerce Link
	public void clickComerceLink() {
		nopCommerceLogo.click();
	}

	// Search Field
	public void search(String searchText) {
		searchField.sendKeys(searchText);
	}

	// Search button
	public void searchButton() {
		searchBtn.click();
	}

	// My Account Button
	
	  public void AccountButtonValidation() { 
	  myAccountButton.isDisplayed();
	  }
	 
		// My Account Button
			public boolean AccountButtonPresent() {
			try {
			myAccountButton.isDisplayed();
			return true;
			}
			catch (Exception e){
			return false;
			}
	}
}

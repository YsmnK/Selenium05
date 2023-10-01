package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;


public class Homework1 {

//		1: Orange HRM blank password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and leave password field empty
//		3. Click on login button
//		4. Verify error message with text "Password cannot be empty" is displayed

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(id = "txtPassword-error")
	public WebElement error;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;

	public Homework1() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}

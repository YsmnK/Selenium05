package com.neotech.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class Homework2 {

//	TC 2: Orange HRM wrong password validation
//	1. Go to https://hrm.neotechacademy.com/
//	2. Enter valid username and wrong password
//	3. Click on login button
//	4. Verify error message with text "Invalid credentials" is displayed
	

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='toast-message']")
	public WebElement invalidCredintial;
	

	public Homework2() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}

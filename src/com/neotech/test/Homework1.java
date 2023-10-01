package com.neotech.test;

import org.openqa.selenium.By;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		1: Orange HRM blank password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and leave password field empty
//		3. Click on login button
//		4. Verify error message with text "Password cannot be empty" is displayed

		setUp();
		
		LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, "");
		
		login.loginBtn.click();
	  
		
		String expected="Password cannot be empty";
	   //  String actual=driver.findElement(By.id("txtPassword-error")).getText();
		String actual=login.error.getText();
		if(actual.equals(expected)) {
			System.out.println("Error message: " + expected);
		}else {
			System.out.println("Error message NOT displayed!");
		}
				
		wait(3);
		
		
		tearDown();

	}

}

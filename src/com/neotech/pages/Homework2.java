package com.neotech.pages;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Orange HRM wrong password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and wrong password
//		3. Click on login button
//		4. Verify error message with text "Invalid credentials" is displayed
		
		setUp();
		
		
LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, "Wrong password");
		
		login.loginBtn.click();
	  
		String expected="Invalid Credentials";
	    
		String actual=login.invalidCredintial.getText();
		if(actual.equals(expected)) {
			System.out.println("Credential message: " + expected);
		}else {
			System.out.println("Credentials message not displayed!");
		}
		wait(2);
		
tearDown();



	}

}




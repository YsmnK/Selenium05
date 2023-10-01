package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class LambdaTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//	Go to https://accounts.lambdatest.com/register
//			Find the Password Element and enter a password
//			Find the Show span as a nephew of the password element and click on it
//			Find the Business Email as a cousin of the password element and enter an email
//			Close the browser

		// For this task, create two classes: Lambda Test, LambdaRegisterPage
		// Use POm in the Register Page
		// Don't find any of the elements on the LambdaTest page!

		//there are two ways how to deal with this task
		//1.solve the task on the Lambdatest (including elemenet) 
		//and then take the elements to the LambdaRegisterPage
		//2. Go step by step , find an element, add it directly to LambdaRegisterPage
		//then use it LambdaTest
		
		setUp();

		LambdaRegisterPage register =new LambdaRegisterPage();
		
		sendText(register.passwordBox, "test123");
		
		wait(2);
		
		jsClick(register.show);
		
		sendText(register.businessEmail,"test123@gmail.com");
		
		wait(2);
		
		tearDown();

	}

}

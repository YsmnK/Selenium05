package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//  WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
       //	// https://accounts.google.com/signup
		
		
		setUp();
		
		System.out.println("Title is " +driver.getTitle()  );
		System.out.println("Id  is " + driver.getWindowHandle()  );
		wait(2);
		
		driver.findElement(By.linkText("Help")).click();
		
		wait(3);
		
		switchToChildWindow();
		
		System.out.println("Title is  " + driver.getTitle());
		System.out.println("Id  is " + driver.getWindowHandle());
		wait(3);
		tearDown();
	}

}

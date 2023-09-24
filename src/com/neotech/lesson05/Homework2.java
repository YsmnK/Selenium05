package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * TC 2: Orange HRM Application Negative Login: Open Chrome browser Go to
		 * https://hrm.neotechacademy.com/ Enter valid username Leave password field
		 * empty Verify error message with text "Password cannot be empty" is displayed.
		 */

		setUp();
//		
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();

		String username = ConfigsReader.getProperty("username"); // read the property
		String password = "";

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		Thread.sleep(3000);

		WebElement psw = driver.findElement(By.id("txtPassword-error"));

		
		if (psw.isDisplayed()) {

			System.out.println("Test Passed!");
		} else {

			System.out.println("Failed!");
		}
		
		Thread.sleep(3000);
		
		tearDown();
	}
}

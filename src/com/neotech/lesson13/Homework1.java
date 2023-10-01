package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		//File Upload ,Upload a file:
		// http://webdriveruniversity.com/File-Upload/index.html
		
		setUp();
		
		
		String path=System.getProperty("user.dir")+"/screenshots/HRM/screenshot01.png";
		sendText(driver.findElement(By.id("myFile")),path);
		click(driver.findElement(By.id("submit-button")));
		
		wait(5);
		System.out.println("Alert Text -> "+ getAlertText());
		acceptAlert();
		
		wait(6);
		tearDown();
		
		
		

	}

}

package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class AlertsTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//url=https://demo.guru99.com/test/delete_customer.php

		setUp();
	
		WebElement text =driver.findElement(By.name("cusid"));
		sendText(text, "12345");
		driver.findElement(By.name("submit")).click();
		
		wait(2);
		System.out.println(getAlertText());
		dismissAlert();
		
		driver.findElement(By.name("submit")).click();
		wait(2);
		acceptAlert();
		
		wait(2);
		acceptAlert();
		
		wait(3);
		
		tearDown();
	}

}

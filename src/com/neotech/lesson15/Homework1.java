package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		// https://hrm.neotechacademy.com/
		
//		Homework 1: OrangeHRM Login
//	    Navigate to https://hrm.neotechacademy.com/
//	    Login to the application by writing xpath based on "parent and child relation"

		setUp();
		
		sendText(driver.findElement(By.xpath("//form[@class='form-body']/div[1]/child::input"))
				,ConfigsReader.getProperty("username"));
	
		sendText(driver.findElement(By.xpath("//form[@class='form-body']/div[2]/child::input"))
				,ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//form[@class='form-body']/div[3]/child::button")));
		
		wait(3);
		
		tearDown();
	}

}

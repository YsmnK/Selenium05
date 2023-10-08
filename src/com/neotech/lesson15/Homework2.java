package com.neotech.lesson15;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
//		Homework 2: OrangeHRM Login
//	    Navigate to https://hrm.neotechacademy.com/
//	    Login to the application by writing xpath based on "following and preceding siblings"

		
		setUp();
		
		
		sendText(driver.findElement(By.xpath("//form[@class='form-body']//following-sibling::div[1]/input"))
				,ConfigsReader.getProperty("username"));
		
		sendText(driver.findElement(By.xpath("//button[@type='submit']/../preceding-sibling::div[1]/input"))
				,ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//input[@name='txtPassword']/../following-sibling::div/button")));
		
		wait(2);
		tearDown();
	}

}

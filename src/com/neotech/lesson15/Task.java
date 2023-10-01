package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		
//		Go to https://the-internet.herokuapp.com/key_presses
//			Press TAB, ESC & ENTER
//		
		setUp();

		WebElement sBox = driver.findElement(By.id("target"));

		sBox.sendKeys(Keys.TAB);
		wait(2);
		sBox.sendKeys(Keys.ESCAPE);
		wait(2);
		sBox.sendKeys("Text");
		wait(2);
		sBox.sendKeys(Keys.ENTER);
		wait(2);
		
		//key chaining
		// sbox.sendKeys(Keys.TAB.ESCAPE.ENTER)
		tearDown();
	}

}

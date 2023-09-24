package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// FrameDemo at com.neotech.lesson07 using the CommonMethods.java
		// https://jquerui.com/tooltip/

		setUp();

		switchToFrame(0);
		WebElement el = driver.findElement(By.id("age"));
		sendText(el, "1");
		wait(2);

		driver.switchTo().defaultContent();

		WebElement el2 = driver.findElement(By.linkText("Checkboxradio"));
		el2.click();

		wait(3);
		tearDown();

	}

}

package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
//		  Use WebDriverWait
//        Verify element is enabled
//        Open chrome browser
//        Go to "https://the-internet.herokuapp.com/"
//        Click on the "Dynamic Controls" link
//        Click on enable button
//        Enter "Hello" and verify text is entered successfully
//        Close the browser
		
		setUp();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		
		WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(el));
		
	    el.sendKeys("Hello");
		if(el.isDisplayed()) {
		System.out.println("Input veried as Hello!");
		}
		else {
			System.out.println("Input NOT verified!");
		}
		
	//	System.out.println(el.getAttribute("value"));
		Thread.sleep(3000);
		
		tearDown();
		
	}

}

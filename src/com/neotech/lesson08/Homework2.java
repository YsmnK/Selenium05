package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
//		  Use FluentWait
//		  Verify element is enabled
//        Open chrome browser
//        Go to "https://the-internet.herokuapp.com/"
//        Click on the "Dynamic Controls" link
//        Click on enable button
//        Enter "Hello" and verify text is entered successfully
//        Close the browser
		
		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		
		wait.withTimeout(Duration.ofSeconds(5));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		
		WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
		
	    wait.until(ExpectedConditions.elementToBeClickable(el));
		
		el.sendKeys("Hello");
		
		Thread.sleep(2000);
		
		System.out.println(el.getAttribute("value"));
		
		tearDown();
		

	}

}

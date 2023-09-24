package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		//http://webdriveruniversity.com/Ajax-Loader/index.html
		setUp();
		//we declare it once
		//Defining an implicit wait 30 seconds:
		//This wait is valid for the lifetime of the deriver
		//If the element is not founds, driver wait up to 30 seconds
		//After 30 seconds an exception will be thrown
		//If the element is found before 30 seconds, the execution is keep running
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Using Thread.Sleep(10000) will wait me for seconds
		//Thread.sleep(10000);
		
		WebElement span=driver.findElement(By.id("button1"));
		Thread.sleep(1000);
		
	//	WebElement notExist=driver.findElement(By.id("nel"));//there is no such a element
		
		span.click();
		Thread.sleep(5000);
		
		
		tearDown();
	

	}

}

package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
//	1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//	2) Verify on the page header "Not a Friendly Topic" displayed
//	3) Click on the Inner Frame Check box
//	4) Choose baby Cat from Animals dropdown
//	5) Quit the browser
		
	setUp()	;
		
	Thread.sleep(2000);
	
	String text=driver.findElement(By.xpath("//label/span")).getText();
	
	System.out.println("Header is: " + text);
	
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame1");
	
	driver.switchTo().frame("frame3");
	
	driver.findElement(By.xpath("//input[@id='a']")).click();
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame2");
	
	Select animal=new Select(driver.findElement(By.id("animals")));
	
	animal.selectByVisibleText("Baby Cat");
	
	Thread.sleep(3000);
	tearDown();
	}

}

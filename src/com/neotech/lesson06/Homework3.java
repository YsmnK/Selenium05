package com.neotech.lesson06;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework3 extends BaseClass{
	
//	Open chrome browser
//    Go to "https://semantic-ui.com/modules/dropdown.html"
//    Scroll down to "Multiple Selection"
//    Click on drop down and select "CSS" and "HTML"
//    Verify value has been selected
//    Deselect 1 of the options from the dropdown
//    Quit browser

	public static void main(String[] args) throws InterruptedException {
	
		
		setUp();
		
	driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div")).click();
	//driver.findElement(By.xpath("//div[@data-tab='definition']/div[8]/div")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[@class='menu transition visible']/div[2]")).click();
	Thread.sleep(20000);
	
	driver.findElement(By.xpath("//div[@class='menu transition visible']/div[5]")).click();
	Thread.sleep(2000);	
	
	
	driver.findElement(By.xpath("//a[@data-value='css']//i")).click();

    Thread.sleep(4000);
		
		tearDown();
		
		
		
		

	}

}

package com.neotech.lesson07;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
//	1) Launch the browser and open the site "https://www.tutorialspoint.com/selenium/selenium_automation_practice"
//	2) Fill in the all text boxes, Choose your preferred radio button, check box and drop down option 
//	EXCEPT Profile Picture (Dissmiss this Section)
//	3) Click on the Button and you will see an Alert pops up then click Ok
//	4) When user clicks on Ok new Window will open then get All window handles and get the size and Quit all of them

	setUp();	
		
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("AAA");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("BBBB");
	driver.findElement(By.xpath("//input[@value='Female']")).click();
	driver.findElement(By.xpath("//td/span[7]")).click();
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]/div/form/div/table/tbody/tr[5]/td[2]/input")).sendKeys("2023");
	driver.findElement(By.xpath(""));
	Thread.sleep(5000);
	tearDown();	
		
		
	}

}

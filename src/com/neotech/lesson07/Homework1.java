package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	
//	1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//	3) On the Child Window, Enter your email ID and submit.
//	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//	5) Close the Child window on which credentials are displayed.Switch to the parent window.
//	6) Quit all browsers
		
		setUp();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(3000);
		
		Set<String> wh=driver.getWindowHandles();
		
		Iterator<String> it = wh.iterator();
		String firstWindow=it.next();
		String secondWindow=it.next();
		
		driver.switchTo().window(secondWindow);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("yask@g.com");
		
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(3000);
		
	String userId=	driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		
	String password=	driver.findElement(By.xpath("//tr[5]/td[2]")).getText();
		
		System.out.println("The User Id: " + userId);
		System.out.println("The Password is : " + password);
		
		driver.switchTo().window(firstWindow);
		//driver.close();
		
		Thread.sleep(3000);
		tearDown();

		
	}

}

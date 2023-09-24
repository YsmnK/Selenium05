package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Amazon Department List Verification Open chrome browser Go to
		 * "http://amazon.com/" Verify how many department options available. Print each
		 * department Select Computers Quit browser
		 */
		
		setUp();
		
		Select dep=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		
		Thread.sleep(2000);
	
	System.out.println("The department options are : " +dep.getOptions().size());

	Thread.sleep(2000);
	
	for(WebElement el: dep.getOptions()) {
			
		System.out.println(el.getText());
		
	}
	
	dep.selectByVisibleText("Computers");
	
	Thread.sleep(3000);

		
	tearDown();
	}

}

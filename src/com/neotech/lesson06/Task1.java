package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * Facebook dropdown verification Open chrome browser Go to
		 * https://www.facebook.com/r.php Verify month dd has 12 month options  day dd
		 * has 31 day options year dd
		 * has 118 year options Select your date of birth Quit browser
		 * 
		 */

		setUp();
		
//		WebElement m=driver.findElement(By.id("month"));
//      Select sM=new Select(m);
		
		//using method chain instead of 2 WebElement location
		Select sMonth = new Select(driver.findElement(By.id("month")));
		Select sDay = new Select(driver.findElement(By.id("day")));
		Select sYear = new Select(driver.findElement(By.id("year")));

		System.out.println("The number of options for year is: " + sYear.getOptions().size());
		System.out.println("The number of options for month is: " + sMonth.getOptions().size());
		System.out.println("The number of options for days is: " + sDay.getOptions().size());

		// let us select our birtday
		sYear.selectByVisibleText("1983");
		sMonth.selectByIndex(2);
		sDay.selectByValue("18");
		
//		sYear.selectByVisibleText("1993");
//		sMonth.selectByValue("10");
//		sDay.selectByIndex(27);

		Thread.sleep(2000);

		tearDown();
	}

}

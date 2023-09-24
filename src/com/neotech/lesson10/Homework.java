package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		Homework: American Airlines Flight Search
//      Open chrome browser
//		Go to https://www.aa.com/homePage.do
//		Enter From and To
//		Select departure as December 14 of 2022
//		Select arrival as December 22 of 2022
//		Click on search
//	    Close browser

		setUp();

//Departure airport

		driver.findElement(By.xpath("//*[@id='reservationFlightSearchForm']/div[3]/div[1]/div/a/span[1]")).click();
		driver.findElement(By.xpath("//select[@id='countryCode']")).sendKeys("United States");
		driver.findElement(By.xpath("//select[@id='stateCode']")).sendKeys("Florida");
		driver.findElement(By.id("airport_MIA")).click();
		driver.findElement(By.xpath("//button[@id='airportLookupDialogButton0']")).click();

//Delivery airport	
		driver.findElement(By.xpath("//*[@id='reservationFlightSearchForm']/div[3]/div[2]/div/a/span[1]")).click();
		driver.findElement(By.xpath("//select[@id='countryCode']")).sendKeys("Turkey");
		driver.findElement(By.id("airport_IST")).click();
		driver.findElement(By.xpath("//button[@id='airportLookupDialogButton0']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

		Thread.sleep(3000);

		while (!month.equals("December")) {

			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		List<WebElement> dateF = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement date : dateF) {

			String day = date.getText();
			if (day.equals("14")) {
				date.click();
				break;
			}
		}

		driver.findElement(By.xpath("//*[@id='reservationFlightSearchForm']/div[4]/div[2]/div/button")).click();

		String monthR = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

		while (!monthR.equals("December")) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			monthR = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}

		List<WebElement> dateR = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement date2 : dateR) {
			String dayL = date2.getText();
			if (dayL.equals("22")) {
				date2.click();
				break;
			}
		}
		Thread.sleep(5000);

		tearDown();

	}

}

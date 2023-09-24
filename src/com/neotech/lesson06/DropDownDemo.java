package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));

		Thread.sleep(2000);

		WebElement dd = driver.findElement(By.id("dAcademicYear_list"));

		// this WebElement is a select tag
           Select selDD = new Select(dd);

		// first way
		selDD.selectByIndex(0);
		

		Thread.sleep(2000);

		// second way

		selDD.selectByValue("10");
		Thread.sleep(2000);

		// 3rd way

		selDD.selectByVisibleText("2014-2015");
		Thread.sleep(2000);

		// the select obj has also access to the option list

		List<WebElement> options = selDD.getOptions();

		System.out.println("The size of the list is : " + options.size());

		for (int i = 0; i < options.size(); i++) {

			selDD.selectByIndex(i);

			Thread.sleep(2000);
		}

		tearDown();
	}

}

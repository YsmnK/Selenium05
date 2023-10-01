package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//			Go to url: https://hrm.neotechacademy.com/
//			Log in using our custom methods ,Go to PIM menu
//			Add an employee ,Upload another image in the employee photo

		setUp();

		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		wait(2);

		click(driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/a/span[2]")));
		click(driver.findElement(By.linkText("Add Employee")));

		wait(3);

		sendText(driver.findElement(By.id("first-name-box")), "Hello");
		sendText(driver.findElement(By.id("last-name-box")), "Hello");
		selectDropdown(driver.findElement(By.id("location")), "New York Sales Office");

		driver.findElement(By.id("employeeId")).getAttribute("value");

		driver.findElement(By.xpath("//*[@id='modal-save-button']")).click();

		click(driver.findElement(By.xpath("//button[@class='btn']")));

		wait(3);

		click(driver.findElement(By.xpath("//img[@data-tooltip='Change Profile Picture']")));

		wait(3);
		String path = System.getProperty("user.dir") + "/screenshots/HRM/screenshot01.png";

		sendText(driver.findElement(By.xpath("//input[@type='file']")), path);

		click(driver.findElement(By.xpath("//*[@id='updatePhotoModal']/form/div[2]/a[1]")));

		wait(1);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot03.png"));

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Able to save screenshot!!!");
		}
		
		tearDown();

	}

}

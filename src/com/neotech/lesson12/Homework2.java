package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		    Go to https://hrm.neotechacademy.com/
//			Log in using our custom methods ,Go to PIM menu
//			Add an employee,Go to Employee List
//			Get the list of the employees (Using tables - tr and td) ,Loop to search for the employee you added
//			When you find the employee - click on it, Take a screenshot

		setUp();

		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		wait(2);

		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/a/span[2]")).click();
		driver.findElement(By.linkText("Add Employee")).click();

		wait(3);

		sendText(driver.findElement(By.id("first-name-box")), "Elon");
		sendText(driver.findElement(By.id("last-name-box")), "Musk");
		selectDropdown(driver.findElement(By.xpath("//button[@class='btn']")), "New York Sales Office");

		click(driver.findElement(By.xpath("//button[@class='btn']")));
		selectDropdown(driver.findElement(By.id("location")), "New York Sales Office");
		wait(3);
		driver.findElement(By.id("employeeId")).getAttribute("value");

		driver.findElement(By.xpath("//*[@id='modal-save-button']")).click();

		wait(5);

		click(driver.findElement(By.linkText("Employee List")));

		String expected = "Elon Musk";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[3]"));

		for (WebElement el : rows) {
			if (el.getText().equals(expected)) {
				el.click();
				break;
			}
		}
		click(driver.findElement(By.id("//i[text()='chevron_right']")));

		for (WebElement el : rows) {
			if (el.getText().equals("Elon Musk")) {
				el.click();
				break;
			}
		}

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(sourceFile, new File("screenshots/HRM2/Homework2.png"));
		} catch (IOException e) {
			System.out.println("Screenshot was not saved....");
		}

		wait(2);

		tearDown();

	}

}

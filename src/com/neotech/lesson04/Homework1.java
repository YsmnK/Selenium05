package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) throws InterruptedException {
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username ,Clear username and enter again valid username
//		Leave password field empty ,Click on login button
//		Verify error message with text "Invalid Login or Password." is displayed.
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("Yasemin");
		Thread.sleep(1000);
		userName.clear();
		userName.sendKeys("Yasemin");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("");

		WebElement loginB = driver.findElement(By.xpath("// input[@type='submit']"));
		loginB.click();

		Thread.sleep(1000);

		WebElement result = driver.findElement(By.cssSelector("#ctl00_MainContent_status"));
		result.getText();

		System.out.println(result.getText());

		Thread.sleep(2000);

		driver.quit();

	}

}

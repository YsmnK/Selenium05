package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		// Test Case
		// Open chrome browser ,Go to ”
		// Click on Register Link // Fill out just
		// First Name:// Last Name:
		// Phone: // Email:
		// And Click Submit
		// “https://demo.guru99.com/test/newtours/
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Yasemin");
		driver.findElement(By.name("lastName")).sendKeys("Koc");
		driver.findElement(By.name("phone")).sendKeys("1234567");
		driver.findElement(By.id("userName")).sendKeys("yasemin.koc");
		driver.findElement(By.name("address1")).sendKeys("Baldwin Park");
		driver.findElement(By.name("city")).sendKeys("Orlando");
		driver.findElement(By.name("state")).sendKeys("Florida");
		driver.findElement(By.name("postalCode")).sendKeys("32000");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		driver.findElement(By.id("email")).sendKeys("yasemin.k@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Trabzon!");
		driver.findElement(By.name("confirmPassword")).sendKeys("Trabzon!");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("submit")).click();
        Thread.sleep(10000);
        
        //check if it went to the success register page:
        
        String expectedUrl="https://demo.guru99.com/test/newtours/register_sucess.php";
        String actualUrl= driver.getCurrentUrl();
        if(expectedUrl.equalsIgnoreCase(actualUrl)) {
        	System.out.println("Test past");
        }else {
        	
        	System.out.println("test Failed");
        }
        
		driver.quit();

	}

}

package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		        //Facebook sign up: , Open chrome browser
				//Go to "https://www.facebook.com/" Click on Sign Up link
				//Enter first name ,Enter last name
     			//Enter email address ,Re-enter email address ,Click on Sign Up button
		
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
     	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//the code is way faster then the code even internet
		//so it could happen that it does not find a certain element
		//for now: we will use Thread.sleep();
		
		driver.findElement(By.name("firstname")).sendKeys("Yasemin");
		
		driver.findElement(By.name("lastname")).sendKeys("Koc");
		
		driver.findElement(By.name("reg_email__")).sendKeys("yasemin.k@gmail.com");
		
		Thread.sleep(2000);
		
		//when we fill out the email another email confirmation box shows
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("yasemin.k@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("yk123");
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(1000);
		driver.quit();
	
		
		
	}

}

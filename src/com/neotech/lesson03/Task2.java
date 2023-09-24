package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	
	public final static String url="https://www.facebook.com/";
			
	public static void main(String[] args) throws InterruptedException {

//		1. Open chrome browser
//		2. Go to "https://www.facebook.com/"
//		3. Enter valid username and valid password and click login
//		4. User successfully logged in
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get(url);
	
	driver.findElement(By.cssSelector("#email")).sendKeys("yasemin.k@gmail.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("yaso123");
	
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	//this is a generated id,it will change the next time you run,
	//can not find element
	//driver.findElement(By.cssSelector("button#u_0_5_Fe")).click();
	
	Thread.sleep(3000);
	
	driver.quit();
	
	}
}

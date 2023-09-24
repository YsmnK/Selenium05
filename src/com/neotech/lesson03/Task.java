package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public final static String url="https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
//		1. Open chrome browser
//		2. Go to "https://www.facebook.com/"
//		3. Enter valid username and valid password and click login
//		4. User successfully logged in
		
	
			
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
					
					WebDriver driver= new ChromeDriver();
					
					driver.get(url);
					
				
					
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yasemin.k@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("trabzon123");
	
	Thread.sleep(5000);
	
	//clicking on login button
	//button[@type='submit']
	//button[@id='u_0_4_3]  generic id , can not work
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	Thread.sleep(7000);
	
	driver.quit();

	}

}

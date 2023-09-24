package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//find an object
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.neotechacademy.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
	
	}

}

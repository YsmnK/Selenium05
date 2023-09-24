package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
//      Using xPath ONLY
//	    TC 2: Mercury Tours Registration: 
//	    Open chrome browser->Go to “http://demo.guru99.com/test/newtours/”
//	    Click on Register Link ->Fill out all required info->Click Submit
//	    
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url="http://demo.guru99.com/test/newtours/";
		driver.get(url);
		
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Yasemin");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Koc");
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123-456-789");
		driver.findElement(By.xpath("//input[@id='userName'] ")).sendKeys("yasemin.k@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Baldwin Park");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Orlando");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Florida");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("00001");
		driver.findElement(By.xpath("//select[@name='country']]")).sendKeys("UNITED STATES");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yasemin.k@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("yasemin12");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("yasemin12");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}

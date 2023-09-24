package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
//          Using Css ONLY
//		    TC 2: Mercury Tours Registration: 
//		    Open chrome browser->Go to “http://demo.guru99.com/test/newtours/”
//		    Click on Register Link->Fill out all required info
//		    Click Submit ->User successfully registered
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url="http://demo.guru99.com/test/newtours/";
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("a[href='register.php']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Yasemin");
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Koc");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("123-456-789");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("yasemin123");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Baldwin Park");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Orlando");
		driver.findElement(By.cssSelector("input[name='state'] ")).sendKeys("Florida");
		driver.findElement(By.cssSelector("input[name='postalCode'] ")).sendKeys("00001");
		driver.findElement(By.cssSelector("select[name='country'] ")).sendKeys("UNITED STATES");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("yasemin.k@gmail.com");
		driver.findElement(By.cssSelector("input[name='password'] ")).sendKeys("yaso123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("yaso123");
	
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input['type=submit']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

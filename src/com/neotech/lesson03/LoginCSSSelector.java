package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelector {

	public final static String url = "https://sis.neotechacademy.com/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		//using xpath:// input[@id='tUsername']
		//using css: input#Username ( tag#id)
		
		// username
		driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
		
		//password
		
		driver.findElement(By.cssSelector("#tPassword")).sendKeys("Neotech$123");
		
       //login
		
		//css--formula 1:tag#id
		//             2: tag.class-->input.buttonBig
		
	   //driver.findElement(By.cssSelector("#bLogin")).click();
		driver.findElement(By.cssSelector("input.buttonBig")).click();
		
		//click on the Students link
		
		//             1:formula -->a[href$='Personal.aspx']
		//             2:formula--> a[@href='Personel.aspx']
		
		driver.findElement(By.cssSelector("a[href$='Personal.aspx']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

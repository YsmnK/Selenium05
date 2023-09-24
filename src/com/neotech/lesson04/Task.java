package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
   
	public static String username= "Tester";
    public static String password= "test";
    
	public static void main(String[] args) throws InterruptedException {
//	
//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username and password
//		Click on login button
//		Then verify "Web Orders" is displayed and also username is displayed right top corner

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
	//	send username and password
		
	
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);

		// login
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
 
	   Thread.sleep(3000);
	   
	   //Locate the web element
	
// WebElement Display=driver.findElement(By.cssSelector("#aspnetForm > table > tbody > tr > td:nth-child(1) > h1"));
//	
// Display.click();
//
// System.out.println(Display.getText());
// 
//
// WebElement UserDisp=driver.findElement(By.xpath("//div[@class='login_info']"));
// UserDisp.click();
//
// System.out.println(UserDisp.getText());
// Thread.sleep(2000);
	   
	//   Locate the header
	WebElement header=   driver.findElement(By.tagName("h1"));
	
	if(header.isDisplayed() ) {
		System.out.println("The header " + header.getText() + " is displayed!");
	}else {
		
		System.out.println("The header is Not Displayed");

	
	}
	
	//locate the div which has the username
	String loginInf=driver.findElement(By.cssSelector("div[class=login_info]")).getText();
	
	if(loginInf.contains("Tester")) {
		System.out.println("tester is logged in correctly");
		}else {
			System.out.println("It failed");
		}
	driver.quit();
	}

}

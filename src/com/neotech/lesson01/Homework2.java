package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).
		
		WebDriver driver= new FirefoxDriver();
		
		//navigate  to the url
		driver.get("https://www.redfin.com/");
		
		String actualUrl=driver.getCurrentUrl();
		
		String expectedUrl="https://www.redfin.com/";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Title " + driver.getTitle() ); // "test passed
		}else {
			 System.out.println("URL is Not verified"); //test failed
			 }
		Thread.sleep(5000);
		
		driver.quit();

	}

}

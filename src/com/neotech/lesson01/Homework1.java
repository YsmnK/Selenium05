package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
//		Amazon Page Title Verification: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//		End the Session (close the browser).

		System.setProperty("webriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		         //actual title
		String actualUrl=driver.getCurrentUrl();
		
		System.out.println("Actual title-->" +  actualUrl);
		        //excepted title
		String expectedUrl="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more ";
		if( actualUrl.equals(expectedUrl)) {
			System.out.println("Title :" + driver.getTitle()); // test pass
		}else {
			System.out.println("The url is wrong"); // test failed
		}
		Thread.sleep(10000);
		driver.quit();
		

	}

}

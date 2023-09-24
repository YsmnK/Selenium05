package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllEbayLinks {
	
		public static String url="https://www.ebay.com";
		
		public static void main(String[] args) {
			
			//go to the ebay
			//get all links on eaby and their numbers
			//print the links that have the text
			
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get(url);
			
	List<WebElement> allLinks=	driver.findElements(By.tagName("a"));	
	
	System.out.println("The total number of links is--> " + allLinks.size());
	
	int count=0;
	for(WebElement link :allLinks) {
	
		if(!link.getText().isEmpty()) {
			
			System.out.println(link.getText());
			count++;
		}
		
	}
	System.out.println("the number of links that have text is--> " + count);
	
	driver.quit();
	}

}

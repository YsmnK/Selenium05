package com.neotech.lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1) Open chrome browser
		 * 2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * 3) Login to the application
		 * 4) Verify customer "Susan McLaren" is present in the table
		 * 5) Click on customer details  6) Update customers last name and credit card info
		 * 7) Verify updated customers name and credit card number is displayed in table , 8) Close browser
		 */
		setUp();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigsReader.getProperty("Username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigsReader.getProperty("Password"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();

//if you check all element which is contains Susan McLauren
//List<WEbElement>rows=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr");
//int rowIndex=-1;
		
//	for(int i=1;i<rows.size();i++){
		
		//String rowTwxt=rows.get(i).getText()
		
		//if(rowText.contains("Susan McLaren"))
		
		//{
			//System.out.println("Susan found!!!");
		//} 
		
		WebElement el=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[6]"));
		System.out.println(el.getText());
		if(el.getText().contains("Susan McLaren")) {
			System.out.println("Test Verified!");
		}else {
			System.out.println("Test NOT Verified!");
		}
		
	driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input")).click();
    WebElement cus=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
	cus.click();
	cus.clear();
	cus.sendKeys("Susan ABCD");
	System.out.println("The new Last name of Susan-->" +cus.getAttribute("value"));
	Thread.sleep(2000);
	
	WebElement card=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
    card.click();
	card.clear();
	card.sendKeys("3333333333333333");
	System.out.println("The new card number is: " + card.getAttribute("value"));
	
	Thread.sleep(2000);
	
		tearDown();
		
		
		
	}

}

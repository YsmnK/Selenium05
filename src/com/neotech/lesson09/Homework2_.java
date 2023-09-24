package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2_ extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
	
		/*
		 * 1) Open chrome browser
		 * 2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * 3) Login to the application ,4) Click on the checkbox of all orders with product FamilyAlbum
		 * 5) Delete Selected orders ,6) Verify the orders have been deleted
		 * 7) Quit the browser 
		 */
setUp();

driver.findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigsReader.getProperty("Username"));
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigsReader.getProperty("Password"));
driver.findElement(By.xpath("//input[@value='Login']")).click();

driver.findElement(By.linkText("View all orders")).click();

List <WebElement> clickBox=driver.findElements(By.xpath("//input[@type='checkbox']")); 

for(WebElement el:clickBox) {
	el.click();	
	Thread.sleep(500);
}
driver.findElement(By.xpath("//input[@type='submit']")).click();

WebElement allorders=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderMessage\"]"));
allorders.click();

if(allorders.isDisplayed()) {
	System.out.println("Verified :"+allorders.getText());
}else {
	System.out.println("Not Verified!");
}

Thread.sleep(2000);


tearDown();
	}

}

package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXPatDemo {
	
	public final static String url="https://sis.neotechacademy.com/";

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
//full xpath example for username
	//driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]"
		//	+ "/td/table/tbody/tr[1]/td[3]/input")).sendKeys("Admin");
		
		//relative xpath username
		//*[@id="tUsername"]//copy from xpath
		driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		
		//create an xpath for the password
		driver.findElement(By.xpath("//input[@id='tPassword']")).sendKeys("Neotech$123");
		
		Thread.sleep(3000);
		
		//create login xpath
		
		driver.findElement(By.xpath("//input[@id='bLogin']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Student')]")).click();
		
		Thread.sleep(3000);

		driver.quit();
	}

}

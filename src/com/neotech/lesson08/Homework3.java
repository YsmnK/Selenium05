package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
//		  Add Employee
//        Open chrome browser
//        Go to "https://hrm.neotechacademy.com/"
//        Login into the application
//        Click on PIM > Add Employee 
//        Add Employee
//        Log out 
//        Quit the browser
		
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		WebDriverWait addbox=new WebDriverWait(driver,Duration.ofSeconds(35));
		
		addbox.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add Employee")));
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		//Thread.sleep(5000);
		
		WebDriverWait name=new WebDriverWait(driver,Duration.ofSeconds(30));
		name.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='last-name-box']")));
		
		driver.findElement(By.xpath("//input[@id='first-name-box']")).sendKeys("AAAA");
		driver.findElement(By.xpath("//input[@id='last-name-box']")).sendKeys("BBB");
		
		
		Select sl=new Select(driver.findElement(By.id("location")));
		sl.selectByVisibleText("London Office");
		
		WebDriverWait save=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		save.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modal-save-button\"]")));
		driver.findElement(By.xpath("//*[@id=\"modal-save-button\"]")).click();
		
		WebDriverWait page =new WebDriverWait(driver,Duration.ofSeconds(25));
		page.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));
		
		
		driver.findElement(By.id("account-job")).click();
		driver.findElement(By.id("logoutLink")).click();
		
		
		Thread.sleep(5000);
		tearDown();

	}

}

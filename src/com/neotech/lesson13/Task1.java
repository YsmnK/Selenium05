package com.neotech.lesson13;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;
import com.google.common.io.Files;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException  {
		//https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
	
		setUp();
		
	String filePath=System.getProperty("user.dir")+ "/screenshots/HRM/screenshot01.png";	
		
	//send text to upload section
	sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")),filePath);
	
	wait(2);
	
	click(driver.findElement(By.xpath("//button[@class='gwt-Button']")));
	
	//the alert will show up
	
	System.out.println("Alert Text:" + getAlertText());
	acceptAlert();
	
	//take a screenshot:
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	
	try {
		Files.copy(sourceFile, new File("screenshots/lesson13/FileUpload.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	wait(4);
	tearDown();
		
	}

}

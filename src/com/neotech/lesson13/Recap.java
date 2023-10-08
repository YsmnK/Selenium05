package com.neotech.lesson13;

public class Recap {

//	When we need to take a screenshot in selenium we will use be using TakesScreenshot Interface.
//	To save the image we need to add commons-io to our project.
//
//	Sometime we need to perform different tasks, like moving the mouse to an element, or double clicking.
//	In Selenium we have Actions Class to automate mouse and keyboard operations:
//	- click
//	- right click
//	- double click 
//	- hover over elements
//	- drag and drop
//
//	--------------------------------
//
//	We often come across scenarios while testing where we have to upload a file.
//	For different UI there are different ways to upload a file.
//
//	How to upload a file using selenium?
//	In selenium we use sendKeys() method to upload files.
//
//	Locate the "File Upload" element and send the path of the file to it.
//	driver.findElement(By.id("file-upload")).sendKeys(filePath);
//
//	--------------------------------
//
//	JavaScriptExecutor is an interface which provides the mechanism to execute Javascript code through selenium driver.
//
//	First we need to cast the driver object to JavascriptExecutor.
//	The we run the executeScript() method.
//	JavaScriptExecutor js = (JavaScriptExecutor) driver;
//	js.executeScript("javascript command");
//
//	Using JavaScriptExecutor we can perform:
//	Click on some elements
//	Scroll down the page
//	Refresh the page
//	Highlight an element
//	
}

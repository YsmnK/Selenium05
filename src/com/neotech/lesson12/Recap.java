package com.neotech.lesson12;

public class Recap {
	
//	In testing it is necessary to take the screenshot for verification so we can prove that our test case has covered certain functionality or not.
//
//
//	How do we take a screenshot:
//		- use TakesScreenshot interface
//		
//	1. TakesScreenshot ts = (TakesScreenshot) driver;
//	2. File picture = ts.getScreenshotAs(OutputType.FILE);
//	3. 
//		
//		Files.copy(picture, new File("desination/picture01.png");
//		
//	*Using import com.google.common.io.Files;
//		- it does not create a new folder on runtime
//
//	* Apache commons.io -- another library for IO functionality
//	--------------------------------
//
//	In Selenium we have Actions Class to automate mouse and keyboard operations:
//	- click
//	- right click
//	- double click 
//	- hover over elements
//	- drag and drop
//	- click and hold
//
//	When do we go?
//	Lets say driver.findElement().click(); does not work, but you still can click manually, then we can use Actions Class to perform click or double click
//
//	** do not forget: at the end of every operation, we have to add .perform();
//
//
//	IQ: how do you perform a right click or a double click on a webpage?
//
//	Selenium provides an Actions class which allows us to perform any mouse or keyboard action. 
//
//	Selenium API provides Actions Class 
//	to do right click --> contextClick();
//	to do double click --> doubleClick();
//	to drag and drop --> dragAndDrop(from, to);
//
//	Drag and Drop:
//	We use Actions class to drag and drop an element.
//	To drag and drop:
//	identify element to drag
//	identify to which element to drop
//	actions.dragAndDrop(elementToDrag, whereToDrop);

}

package com.neotech.lesson06;

public class Recap {
	
//	Dropdown: element showing a list of choices (can select one or more)
//
//	To handle dropdown elements we use the Select Class
//
//	Ex: Select sl = new Select(dropdown web element);
//
//	Selecting an element:
//	selectByIndex()
//	selectByValue()
//	selectByVisibleText()
//
//
//	 getOptions(): used to get all the options available in a select object of a dropdown list
//	 	- it returns a List<WebElements>
//
//	isMultiple(): allows us to check if the dropdown accepts multiple selections (if true)
//
//	On multiple select dropdown elements we can also deselect:
//	deselectAll()
//	deselectByIndex()
//	deselectByValue()
//	deselectByVisibleText()
//
//	Alerts:
//	Alerts are pop-ups in a page which then shifts the control to the pop-up itself. So no elements are accessible in the page without handling the alert. 
//
//	Alert are used by developers to notify the users. 
//
//	When an alert is activated you should switch to alert using the switchTo() method
//	Ex:	Alert x = driver.switchTo().alert();
//
//	To handle alerts we have 4 methods:
//	accept() 	- positive response(ok,yes)
//	dismiss() 	- negative response(cancel, no)
//	getText()	- getting the text shown on the alert box
//	sendKeys()	- sending text to the alert box
//
//
//	If we try to access webpage elements when alert is active then exception UnhandledAlertException is thrown
//
}

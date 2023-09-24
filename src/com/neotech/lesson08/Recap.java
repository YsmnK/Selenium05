package com.neotech.lesson08;

public class Recap {
	
//	Synchronization:
//		Matching automation tool speed with the web application speed
//
//	StaticWait: Thread.sleep(2000);
//
//	Types of wait:
//		Implicit
//		Explicit
//			- WebDriverWait
//			- FluentWait
//
//	Implicit wait: Is a way to tell the driver that when finding the elements (only using findElement and findElements) and they are not immediately there, to wait for some time. If they are not there even after the waiting time, then throw exception. 
//
//	We have been using implicit wait of 0 seconds. 
//	You can set a new implicit wait time:
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//	If element is found before reaching the end of the set time, then the remaining time is ignored the execution proceeds. 
//
//	Explicit wait: (WebDriverWait) Is used to tell the driver to wait for specific conditions to happen. When the time to wait is reached and the conditions has not happened yet, then exception is thrown. 
//
//	WebDriverWait works with ExpectedConditions class
//
//	How to use it: 
//
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	wait.until(ExpectedConditions.--------);
//
//	FluentWait: Is used to tell the web driver to wait for a condition, as well as the frequency with which we want to check the condition before throwing an exception.
//
//	How to use it:
//
//		FluentWait wait = new FluentWait(driver);
//		wait.withTimeout(Duration.ofSeconds(30));
//		wait.pollingEvery(Duration.ofSeconds(1));
//		wait.ignoring(NoSuchElementException.class);
//
//	--------------------------------
//	Different Conditions can be used
//	--------------------------------
//	alertIsPresent()
//	elementSelectionStateToBe()
//	elementToBeClickable()
//	elementToBeSelected()
//	frameToBeAvaliableAndSwitchToIt()
//	invisibilityOfTheElementLocated()
//	invisibilityOfElementWithText()
//	presenceOfAllElementsLocatedBy()
//	presenceOfElementLocated()
//	textToBePresentInElement()
//	textToBePresentInElementLocated()
//	textToBePresentInElementValue()
//	titleIs()
//	titleContains()
//	visibilityOf()
//	visibilityOfAllElements()
//	visibilityOfAllElementsLocatedBy()
//	visibilityOfElementLocated()

}

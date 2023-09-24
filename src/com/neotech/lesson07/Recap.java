package com.neotech.lesson07;

public class Recap {
	
//	FRAMES
//
//	HTML frames allow developers to present documents in multiple views, which maybe independent windows or sub-windows.
//	 
//	Multiple views offer developers a way to keep certain information visible, while other views are scrolled or replaced. For example, within the same window, one frame might display a static banner, the second a navigation menu, and the third the main document that can be scrolled through or replaced by navigating in the second frame etc.
//
//	To check if element is inside frame -> right click and you will see options such as reload frame or view frame source.
//	In Automated Testing using Selenium, we need to switch from Top window to a particular frame and operate elements...
//
//	So, Frame/ IFrame is just another web element, and you cannot locate its element directly in selenium WebDriver. 
//	To work with IFrame elements in Selenium WebDriver, first you need to identify that frame and then switch to it.
//	 
//	You can switch to a frame by Id or name, by index, or WebElement
//	//Switch to frame1 by ID of the frame.
//	driver.switchTo().frame("frame1");
//	 
//	Now you can work with any element which is inside that frame1. Now supposing you want to switch back to main page content, you need to use syntax below.
//
//	//Switch back to page content.
//	driver.switchTo().defaultContent();
//	After the above line execution, you can work with main page elements.
//	 
//	*** Working with multiple frames on the same page:
//
//	If there are multiple frames on single page, you cannot directly navigate from IFrame1 to IFrame2. 
//	For that, you need to switch to main page as below.
//
//	//Switch to frame1
//	driver.switchTo().frame("frame1");
//	driver.findElement(By.xpath("//div[@id='example']")).click();
//	  
//	//Switch back to main page content.
//	driver.switchTo().defaultContent();
//	  
//	//Switch to frame2
//	driver.switchTo().frame("frame2");
//	driver.findElement(By.xpath("//input[@value='Boat']")).click();
//
//	--------------------------------
//	IQ: How would you handle pop ups?
//	Web based pop up alerts can be handled using Alert Interface
//
//	Pop ups/ JavaScript Alerts:
//	simple - ok
//	confirmation - ok & cancel
//	prompt - sendText
//
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
//	alert.dismiss();
//	alert.getText();
//	alert.sendKeys();
//	If no Alert Present, we get NoAlertPresentException
//	--------------------------------
//	IQ: How would you handle element that is located inside the frame?
//	We need to switch our focus to that particular frame
//
//	driver.switchTo().frame(......);
//
//	Ways to switch to the frame:
//	- id or name 
//		driver.switchTo().frame("id"/"name");
//
//	- WebElement
//		WebElement frameEl = driver.findElement(by.css/xpath("..."));
//		driver.switchTo().frame(frameEl);
//
//	- Index
//		driver.switchTo().frame(int index);
//
//	Switch back to the main window
//	driver.switchTo().defaultContent()
//
//	--------------------------------------
//
//	Logic to handle element in the frame
//	1. Switch to frame
//	2. Identify element and perform action
//	3. Switch to default content (switch to main window)
//	4. Identify element and perform action
//	5. Switch to frame
//	6. Identify element and perform action
//	7. Switch to default content (switch to main window)
//
//	Working with multiple windows:
//	There will be times when we will need to perform some testing, where the testing operations open a new window/tab. Test case may require you to perform some tasks on the newly opened browser window/tab, and return back to original window to perform the remaining tasks.
//
//	WebDriver assigns an alphanumeric id to each window as soon as the WebDriver object is instantiated. Selenium uses this unique id to switch control among several windows.
//
//	What is a window handle? 
//
//	A window handle is a unique identifier that holds the address of all the windows. This is basically a pointer to a window, which returns a string value. It is guaranteed that each browser will have a unique window handle.
//
//	.getWindowhandle(): helps in getting the window handle of the current window.
//	.getWindowhandles(): helps in getting the handles of all the windows opened. returns a Set of String IDs because set does not allow duplicates.
//
//	.switchTo(): helps in switching between the windows. 

}

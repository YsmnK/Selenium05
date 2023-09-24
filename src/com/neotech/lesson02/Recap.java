package com.neotech.lesson02;

public class Recap {

//	What is Selenium?
//			It is suite of tools.
//
//			Selenium IDE: Firefox Plugin
//			Selenium RC: Remote Control, Selenium I
//			Selenium Grid: it supports cross browser testing and also parallel testing
//			Selenium WebDriver:
//			What is Selenium WebDriver?
//			It is a tool that helps us to automate and test web based application and also helps us to communicate with the web browsers
//
//			1. System.setProperty("webdriver.chrome.driver", "path to the file"); —> connecting to the browser, bridge
//			2. WebDriver driver = new ChromeDriver(); —> launches the chrome browser 
//
//			Commands related to the page:
//			get();
//			getTitle();
//			getCurrentUrl();
//
//			--------------------------------
//			Commands related to the browser:
//			driver.navigate.to();
//			Navigate back and forward
//			Refresh
//			Maximize (for Mac use fullScreen)
//			close();
//
//			The Diff between between driver.get() and driver.navigate().to()
//			1. driver.get() will wait for the page to fully load
//			2. driver.get() will not keep the history of the browser
//			1. driver.navigate().to() will keep the history
//			2. driver.navigate().to() will not wait for the page to fully load.
//			 
//			What is an Element?
//			Anything that you see on the WebPage is an element, such as: text-box, buttons, drop-downs, check-boxes, radio buttons etc.
//
//			What is DOM? 
//			DOM —> Document Object Model: Tree structured HTML document wherein each node(line) is an object representing a part of the document.
//			How to open DOM? —> Command + Alt + I, right click/inspect, View/developer/developer tool
//
//			It is the browser’s internal programmatic representation/view of the webpage.
//
//			Document, it’s basically a file. It could be an excel file, PDF file etc. but in the context of DOM, it is an html file/document.
//			Object, Every tag/line that you see is an object.
//			Model, is nothing but the layout of these objects.
//
//			What is attribute?
//			It is a key value pair which provides additional information about HTML elements.
//
//			What is an Element Locator?
//			It is an address that identifies a web element or group of web-elements uniquely within the DOM/web page.
//
//			Selenium supports 8 element locators to identify elements in web pages:
//			id,
//			name,
//			className,
//			linkText,
//			partialLinkText,
//			tagName,
//			cssSelector,
//			xpath
//
//			Why do we need to use different locators?
//			1. Developers may not provide all locators for every element
//			2. Some Locators may be duplicated among nodes (tags)
//			3. Some locators are not applicable for all elements 
//				Example: linkText, partialLinkText can be used only with links
//
//			What Methods to use to locate an element?
//
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://demo.guru99.com/test/newtours/");
//			driver.findElement(By.linkText("REGISTER")).click();
//			driver.findElement(By.name("firstName")).sendKeys("John");
//			driver.findElement(By.name("lastName")).sendKeys("Smith");
//			driver.findElement(By.id("email")).sendKeys("johnsmith@neotech.com");
}

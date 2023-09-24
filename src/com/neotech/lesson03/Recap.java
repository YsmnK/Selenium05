package com.neotech.lesson03;

public class Recap {
//	
//	HTML/XML
//
//	<input type="email" name="mailbox" id="mail" />
//	tag -> input
//	attributes -> type, name, id
//	attribute values -> email, mailbox, mail
//
//	Why do we need Xpath and CSS selector??
//	1. Not every element will have an ID, className, name...
//	2. Alpha numeric Id's than may change after refresh/reload
//	3. Using Xpath and CSS we can locate an element using any attribute
//
//	Xpath:
//	1. Absolute - the complete path, from the beginning of the HTML code to the location of the element (/html) 
//		*  not really preferred to use a lot
//
//	2. Relative - a shorter path created using the attributes of the element
//		//tag[@attribute = 'value of the attribute']
//
//	Methods in Xpath:
//	contains(@attribute, 'partial value')	// Attribute should contain partial value
//	starts-with(@attribute, 'partial value') // Attribute should start with partial value
//
//	CSS selector
//		- Provides a shorter way to use id, class or other attributes, sometimes it is faster to find/locate the element
//
//	tag and id
//		-> tag#id, The generator just gives the #id
//
//	tag and className
//		-> tag.className
//
//	tag and attribute
//		-> tag[attribute='value of attribute']
//
//	Symbols to represent the methods
//		^ -> when used, it is similar to a start-with() method
//		$ -> when used, it is similar to a ends-with() method
//		* -> when used, it is similar to a contains() method
//
//	input[name*='mai'] --> name attribute contains the value 'mai'
//
//	Comparison between CSS and Xpath:
//	1. CSS selector is faster that xpath
//	2. CSS is native to the browser, xpath is not
//	3. Xpath has more features in Selenium, but CSS has a good performance
//	

}

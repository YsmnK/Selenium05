package com.neotech.lesson04;

public class Recap {
	
//	Class 04
//	--------------------------------
//
//	<input name="username" type="text" id="Main" class="element"> Welcome Admin </input>
//
//	Relative Xpath types:
//	1. xpath -->                			//input[@id='Main']
//	2. text()-->                			//input[text()='Welcome Admin']
//	3. contains method with attribute  ---> //input[contains(@name,'name')]
//	4. contains with text()  ---->          //input[contains(text(),'Admin')]
//	5. 2 attributes --->					//input[@type='text' and @id='Main']

//	Css Selector Types:
//	1. css Selector -->            input[id='Main'] --> input#Main  --> #Main
//	2. Contains --->     		   input[id*='Ma']
//	3. Starts with -->  		   input[name^='user']
//	4. Ends with --->  			   input[name$='me'] 
//	5. css Selector with class---> input[class='element'] --> input.element --> .element
//
//	--------------------------------
//	What operation we can perform on WebDriver?
//
//	driver.get(url) ---> void 
//	driver.getTitle()--> String 
//	driver.findElement() --> WebElement
//	driver.findElements() --> List<WebElement>
//	driver.findElement().getText() --> will return the inner text
//	driver.findElement().getAttribute("")--> will return the value of any attribute of the webElement 
//
//	What operation we can perform on WebElements?
//
//	.getText();
//	.clear();
//	.senKeys(String key);
//	.getAttribute();
//	.isEnabled();
//	.isDisplayed();
//	.isSelected();
//	.click();
//	.submit();
//	--------------------------------
//
//	Handle RadioButtons & CheckBoxes
//	if it is just 1 radio or checkbox - just find it and click on it
//	if it is a group of radio or checkbox - collect them into a list by using common attribute and then loop through each element
//
//	--------------------------------
//	clear();
//	void(does not return anything)
//	It will clear text from a text box or text area.
//	-------------------------------------------------------
//	submit();
//	void (does not return anything)
//	If this current element is a form, or an element within a form, then this is preferred to use.
//	If this causes the current page to change, then this method will wait until the new page is loaded.
//	--------------------------------------------------
//	isDisplayed(); 
//	return boolean
//	This method determines if an element is currently being displayed or not.
//	Example:
//	errorMsg.isDisplayed();
//	--------------------------------------------------
//	.isEnabled()
//	return boolean
//	Is the element currently enabled or not? This will generally return true for everything but disabled input elements.
//	---------------------------------------------------
//	.isSelected()
//	return boolean
//	Determine whether or not this element is selected or not. Used with check-boxes and Radio Buttons
//
//	All usually used to verify something, For ex: verify is logo is displayed or if inner Text is displayed or checkbox/radio button is selected or enabled to click 
//	------------------------------------------------
//	getText();
//	return String
//	This method will fetch the visible (i.e. not hidden by CSS) innerText of the element. This accepts nothing as a parameter but returns a String value. 
//
//	String errorText=errorMsg.getText();
//	--------------------------------------------------
//	findElements();
//	return List<WebElement>
//	This method will return a list of WebElement.
//
//	List<WebElement> linkList = driver.findElements(By.tagName("a"));
//		
//	--------------------------------------------------
//	getAttribute(String Name);
//	return String
//	This method gets the value of the given attribute of the element. This accepts the String as a parameter and returns a String value.
//	Attributes are Id, Name, etc. This method you can get the value of the attributes of any given element.
//
//	Example:
//	String attribute=driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("class");
//	---------------------------------------------------
//	
//	

}

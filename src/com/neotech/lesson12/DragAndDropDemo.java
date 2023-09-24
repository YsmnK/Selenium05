package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class DragAndDropDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//https://jqueryui.com/droppable/

		setUp();
		
		switchToFrame(0);
		
		//
		WebElement drag=driver.findElement(By.id("deaggable"));
		WebElement drap=driver.findElement(By.id("droppable"));
		
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drap);
		
		wait(3);
		
		
		//another way to the same thing
		action.clickAndHold(drag).moveToElement(drap).release().perform();
		
		tearDown();
		
		
		
	}

}

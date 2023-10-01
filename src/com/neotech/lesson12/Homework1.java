package com.neotech.lesson12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
//		Open chrome browser ,Go to https://demo.guru99.com/test/drag_drop.html
//		Drag the following blocks in different ways
//		Drag BANK to DEBIT SIDE
//		Drag SALES to CREDIT SIDE
//		Drag 5000 to DEBIT SIDE
//		Drag 5000 to CREDIT SIDE ,Close the browser
		
        setUp();
		
		Actions act=new Actions(driver);
		
		WebElement bank=driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement debitSide=driver.findElement(By.xpath("//*[@id='shoppingCart1']/div"));
		act.dragAndDrop(bank, debitSide).perform();
		
		WebElement sales=driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
		WebElement creditSide=driver.findElement(By.xpath("//*[@id='loan'] "));
		act.dragAndDrop(sales, creditSide).perform();
		
		WebElement amounth1=driver.findElement(By.xpath("//*[@id='fourth']/a[1]"));
		WebElement debitSide2=driver.findElement(By.xpath("//ol[@id='amt7']"));
		act.dragAndDrop(amounth1, debitSide2).perform();
		
		WebElement amounth2=driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement creditSide2=driver.findElement(By.xpath("//ol[@id='amt8']"));
		act.dragAndDrop(amounth2, creditSide2).perform();
		
		wait(10);
		
		
		
		tearDown();
	}

}

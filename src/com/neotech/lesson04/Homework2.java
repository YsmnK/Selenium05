package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		List<WebElement> rb = driver.findElements(By.xpath("//input[@type='radio']"));

		for (WebElement el : rb) {
			if (el.isEnabled()) {
				System.out.println(el.getAttribute("id") + " Radio button is enabled!");

			} else {
				System.out.println(el.getAttribute("id") + " Radio button is NOT enabled!");
			}
		}

		// check if label is displayed for each element
		
	List <WebElement> labelList=driver.findElements(By.xpath("//label[starts-with (@class,'custom-control-label')]"));	

	for(WebElement list : labelList) {
		
		if(list.isDisplayed()) {
			System.out.println("Label displayed : " + list.getText());
		}else {
			System.out.println("Label NOT displayed!");
		}
	}
	System.out.println(".....................");
	
	WebElement yesLabel = driver.findElement(By.xpath("//label[@for = 'yesRadio']"));
	yesLabel.click();
	
	//now that we clicked on yes, we can check if it is selected
	WebElement yesRadio = driver.findElement(By.id("yesRadio"));
	
	if (yesRadio.isSelected())
	{
		System.out.println("Yes is selected!");
	}
	else
	{
		System.out.println("Yes is NOT selected!");
	}

	WebElement noLabel = driver.findElement(By.xpath("//label[@for='noRadio']"));
	noLabel.click();
	
	
	WebElement noRadio = driver.findElement(By.id("noRadio"));
	
	if (noRadio.isSelected())
	{
		System.out.println("No is selected!");
	}
	else
	{
		System.out.println("No is NOT selected!");
	}
	
	
	driver.quit();
	}
}

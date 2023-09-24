package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
	
	public static String url = "https://fs2.formsite.com/meherpavan/form2/index.html";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		// 1st way, locating the element multiple times
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Yasemin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Ayse");
        Thread.sleep(2000);
        
        driver.findElement(By.id("RESULT-TextField-2")).clear();

        driver.findElement(By.id("RESULT-TextField-2")).sendKeys("Eda");
        Thread.sleep(2000);
        
     // 2nd way, code redundancy and re-usability
        
        WebElement phone = driver.findElement(By.cssSelector("input[class=text_field"));
        phone.sendKeys("234-789-654");
        Thread.sleep(500);
        phone.clear();
        phone.sendKeys("222-333-444");
        Thread.sleep(2000);
        
    	// Getting the value of an attribute
        
        String maxLength=phone.getAttribute("maxlength");// web element
        
        System.out.println("The value of maxlength is -->" + maxLength);
        
        WebElement country = driver.findElement(By.name("RESULT_TextField-4"));
      //  String countryClass=country.getAttribute("class");
       // System.out.println("The class attribute of country WebElement is -> " + countryClass);
        
       System.out.println(country.getAttribute("class")); 
       
    // Getting the text inside the WebElement
       
      String headerText=driver.findElement(By.xpath("//div[@id='q19']//h1")).getText();
      System.out.println("The header text is -> \" + headerText)");
      Thread.sleep(2000);
      
//      String lb=driver.findElement(By.xpath("//label[@class='question top_question']")).getText();
//      
//      System.out.println(lb);
//      Thread.sleep(2000);
//      
      driver.quit();
	}

}

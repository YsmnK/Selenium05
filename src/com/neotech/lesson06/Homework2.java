package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Alert text verification
//        Open chrome browser
//        Go to https://demoqa.com/
//        Click on "Alerts, Frame & Windows" link
//        Click on "Alerts" links on the left side
//        Click on button to see Alert
//        Verify alert box with text "You clicked a button" is present
//        Click on 3rd button in the page
//        Verify alert box with text "Do you confirm action?" is present and click "confirm"
//        Click on 4 th button in the page and enter your name and click ok.
//        Quit browser

		setUp();

 //driver.findElement(By.xpath("//div[@class='category-cards']/div[3]")).click();
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Alerts')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();

		System.out.println("The alert is : " + al.getText());
		al.accept();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		Alert al2 = driver.switchTo().alert();
		System.out.println("The second alert is : " + al2.getText());
		 al.accept();
		//al.dismiss();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();

		Alert al3 = driver.switchTo().alert();
		Thread.sleep(2000);
		al3.sendKeys("Yasemin");
		al3.accept();
		Thread.sleep(2000);

		tearDown();
	}

}

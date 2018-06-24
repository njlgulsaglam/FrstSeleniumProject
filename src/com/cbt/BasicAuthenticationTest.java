package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {

public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver" ,
				"/Users/nejlagulsaglam/Documents/selenium dependencies/drivers/chromedriver");	
		WebDriver driver =new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
		
	Thread.sleep(2000);
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
		
	driver.findElement(By.name("login")).click();
	
String expected = "Find a Flight " ;
	
	String actual =driver.getCurrentUrl();
	if(actual.contains(expected)) {
		System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		
			System.out.println("Expected:\t" +expected);
			System.out.println("Actual:\t" +actual);
		
	
	
	
}
}
}
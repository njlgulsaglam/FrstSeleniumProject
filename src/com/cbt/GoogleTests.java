package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {

	public static void main(String[] args) {
	//  
		
	System.setProperty("webdriver.chrome.driver" ,
			"/Users/nejlagulsaglam/Documents/selenium dependencies/drivers/chromedriver");	
	WebDriver driver =new ChromeDriver();
	//2 go to google	
	driver.get("http://google.com");
	
	String expected = "Google";
	String actual = driver.getTitle();
	
	
	if(expected.equals(actual)) {
	System.out.println("pass");
	}else {
		System.out.println("failed");
	
		System.out.println("Expected:\t" +expected);
		System.out.println("Actual:\t" +actual);
	
		
		
		
	}
	}
}
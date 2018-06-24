package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver" ,
				"/Users/nejlagulsaglam/Documents/selenium dependencies/drivers/chromedriver");	
		WebDriver driver =new ChromeDriver();
		
	driver.navigate().to("http://www.cybertekschool.com");
	String expected = "cybertekschool " ;
	
	String actual =driver.getCurrentUrl();
	if(actual.contains(expected)) {
		System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		
			System.out.println("Expected:\t" +expected);
			System.out.println("Actual:\t" +actual);
		
	
	Thread.sleep(1000);
	
	driver.navigate().back();
	Thread.sleep(1000);
	//driver.navigate().back();--> goes back to previous page
	driver.navigate().forward();
	Thread.sleep(1000);
	//driver.navigate().forward();-->goes forward in browsing history
	driver.navigate().refresh();
	Thread.sleep(1000);
	//driver.navigate().refresh();-->refreshed the current page
	
	
	
	
		}
}
}
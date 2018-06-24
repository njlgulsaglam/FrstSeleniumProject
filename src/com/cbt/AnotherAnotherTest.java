package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherAnotherTest {
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver" ,
				"/Users/nejlagulsaglam/Documents/selenium dependencies/drivers/chromedriver");	
		WebDriver driver =new ChromeDriver();
		
	driver.navigate().to("http://www.amazon.com");
	String expected = "amazon " ;
	Thread.sleep(20000);
	//driver.close();
	driver.quit();
}
}
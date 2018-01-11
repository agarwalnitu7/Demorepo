package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoggedinTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\na00450192\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.freecrm.com");
	}
	
	@Test
	 public void title() throws InterruptedException
	 {
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	 }
	
	/*@AfterMethod
	public void teardown() {
		driver.quit();
	}*/

}

package com.TestngDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		System.out.println("Before Test");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("After Test");
		driver.close();
	}
 
	 @Test (priority = 1)
	  public void testMyntra() {
		    
		driver.get("https://myntra.in/");	
		System.out.println("Page Title "+driver.getTitle());	
		
	  }
	  
	  @Test (priority = 2)
	  public void testAmezon() {
		  
			driver.get("https://amazon.in/");
	
			System.out.println("Page Title "+driver.getTitle());
				
	  }

	  @Test (priority = 3)
	  public void testFlipcart() {
		 
			driver.get("https://flipkart.com/");
			
			System.out.println("Page Title "+driver.getTitle());
			
	  }

}

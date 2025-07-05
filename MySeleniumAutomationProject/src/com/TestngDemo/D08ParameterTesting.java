package com.TestngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D08ParameterTesting {
	WebDriver driver;
	
  @Parameters({"userName","password"})	
  @Test
  public void f(String un,String ps) {
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(un);
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(ps);
	  driver.findElement(By.xpath("//*[@id=\"login\"]/button")).submit();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test");
		driver = new EdgeDriver();
		driver.get("https://practice.expandtesting.com/login");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

  }

  @AfterMethod
  public void afterMethod() {
	 // ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200).click()", "");
	  
	  //driver.findElement(By.xpath("//*[@id=\"core\"]/div/div/a/i")).click();
	  
	  driver.close();
	  
  }

}

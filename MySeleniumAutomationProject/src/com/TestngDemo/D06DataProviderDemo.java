package com.TestngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D06DataProviderDemo {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String u, String p) {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(u);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(p);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  @BeforeMethod
  public void launchBrowser() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
  }

  @AfterMethod
  public void logout() {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] {  "Admin", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test");
		driver = new EdgeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

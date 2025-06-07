package com.WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D15LocateByRelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
		WebElement user =driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass")));
		
		user.sendKeys("abc");
		
		WebElement pass =driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email")));
		
		pass.sendKeys("123");
		
		WebElement btnlogin =driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("pass")));
		
		btnlogin.click();
		
	}

}

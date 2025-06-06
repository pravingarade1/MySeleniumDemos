package com.WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement ablink = driver.findElement(By.linkText("About"));
		
		ablink.click();
	}

}

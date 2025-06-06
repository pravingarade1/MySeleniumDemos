package com.WebdriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03VerifyTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		
		System.out.println("Title is:"+title);
		
		if(title.equals("Google"))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");
			
		driver.close();
	}

}

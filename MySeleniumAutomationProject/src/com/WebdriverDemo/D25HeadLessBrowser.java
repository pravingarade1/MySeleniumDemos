package com.WebdriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D25HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
			
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}

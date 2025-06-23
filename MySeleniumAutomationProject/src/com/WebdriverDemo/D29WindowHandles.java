package com.WebdriverDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"trending-naukri-wdgt\"]/div/div[1]/a[1]/span")));
		
		System.out.println("Main Window Title "+driver.getTitle());
		
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		String win1=it.next();
		String win2=it.next();
		
		driver.switchTo().window(win2);
		
		Thread.sleep(5000);
		
		System.out.println("Second window Title "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div/div/div[1]/div/div/div/div[1]/div/input")).sendKeys("Selenium Webdriver", Keys.ENTER);
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}
	
	

}

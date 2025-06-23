package com.WebdriverAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

/*
 * 16.	Open https://dash.bling-center.com/platform/signIn.html
a.	Click on forgot password
b.	Enter your email id
c.	Click on reset password button
d.	Display the text (message) in green color.

 */

public class A16LoginForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dash.bling-center.com/platform/signIn.html");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/div/div[5]/button/p")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email1\"]")).sendKeys("pravingarade@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/button[2]/p")).click();	
		
		Thread.sleep(4000);
	
		String msg=driver.findElement(By.xpath("//*[@id=\"resetsuccess\"]")).getText();
		
		System.out.println("User Prompt Message "+msg);

	}

}

package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D23Synechronisation_FluentWaitAndPageLoad {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//FluentWait declaration
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement chk=driver.findElement(By.id("dte"));
		
		System.out.println("Before");
		System.out.println("Enabled "+chk.isEnabled());
		System.out.println("Selected "+chk.isSelected());
		driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
		
		
		//Fluent wait 
		wait.withTimeout(Duration.ofSeconds(15))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.elementToBeClickable(chk)).click();
		
		System.out.println("After");
		System.out.println("Enabled "+chk.isEnabled());
		System.out.println("Selected "+chk.isSelected());
		
		driver.close();


	}

}

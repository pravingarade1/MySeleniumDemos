package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D22Synechronisation_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://omayo.blogspot.com/");
		
		WebElement chk=driver.findElement(By.id("dte"));
		
		System.out.println("Before");
		System.out.println("Enabled "+chk.isEnabled());
		System.out.println("Selected "+chk.isSelected());
		driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dte"))).click();
		

		System.out.println("After");
		System.out.println("Enabled "+chk.isEnabled());
		System.out.println("Selected "+chk.isSelected());
		
		driver.close();
	}

}

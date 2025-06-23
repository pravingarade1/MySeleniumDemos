package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D21Synechronization_ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.redbus.in/");
		
		//From
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[1]")).click();
		
		driver.findElement(By.id("srcDest")).sendKeys("Kolh");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/div")).click();
		
		//To
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]")).click();
		
		driver.findElement(By.id("srcDest")).sendKeys("Pun");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/i")).click();
		
		//Date
		driver.findElement(By.xpath("//span[normalize-space()='30']")).click();
		
		//Search buses
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button/i")).click();
		
		//Display bus
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"14540670\"]/div[2]/div[3]/div/div[1]/div[1]")).getText());
		
		driver.close();

	}

}

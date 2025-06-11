package com.WebdriverAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
Open https://register.rediff.com/register/register.php?FormName=user_details
Select your birth date and display in following format
My Birthdate is 29 JAN 1979

 */

public class A12SelectButtonDemoAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement selectdaydrp= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		
		Select selectele1=new Select(selectdaydrp);
		
		WebElement selectMondrp= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		
		Select selectele2=new Select(selectMondrp);
		
		WebElement selectyrdrp= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		
		Select selectele3=new Select(selectyrdrp);
		
		selectele1.selectByValue("10");
		
		String day=selectele1.getFirstSelectedOption().getText();
		
		selectele2.selectByValue("03");
		
		String mon=selectele2.getFirstSelectedOption().getText();
		
		selectele3.selectByValue("1988");
		
		String year=selectele3.getFirstSelectedOption().getText();
		
		System.out.println("My Birthdate is "+day+" "+mon+" "+year );
		
		

	}

}

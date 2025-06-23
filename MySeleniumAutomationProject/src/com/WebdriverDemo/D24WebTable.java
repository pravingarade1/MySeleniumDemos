package com.WebdriverDemo;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D24WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://designsystem.digital.gov/components/table/");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//handling table
		
		List<WebElement> header= driver.findElements(By.xpath("//*[@id=\"table-preview-content\"]/table/thead/tr/th"));
		//To display headers of table
		for(WebElement h : header)
			System.out.println(h.getText());
		
		//Display no.of rows
		
		List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\"table-preview-content\"]/table/tbody/tr"));
		
		System.out.println("No of Rows : "+rows.size());
		
		//Display random row
		
		Random ran= new Random();
		int i=ran.nextInt(rows.size());
		
		System.out.println("Randomly selected row : "+rows.get(i).getText());
		
		driver.close();
		
	}

}

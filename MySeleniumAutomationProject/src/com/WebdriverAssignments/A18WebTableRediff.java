package com.WebdriverAssignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A18WebTableRediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//handling table
		
		List<WebElement> cp= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		//To display headers of table
		
		double[]p= new double[cp.size()];
		
		for(int i=0;i<cp.size();i++)
		{
			p[i]=Double.parseDouble(cp.get(i).getText().replace(",",""));
		}
		
		Arrays.sort(p);
		System.out.println("Higest Price "+p[p.length-1]);
		
		driver.close();
	}

}

package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D33MouseSliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions acn=new Actions(driver);
				
		driver.findElement(By.linkText("Slider")).click();
		
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		
		acn.dragAndDropBy(slider, slider.getLocation().x+100,slider.getLocation().y).perform();
		
	

	}

}

package com.WebdriverDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class D35TakesScreenShotDemo {

	public static void main(String[] args) throws IOException {
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

		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(file, new File("Screenshots\\Myscreenshot.jpeg"));
	}

}

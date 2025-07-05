package com.TestngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D09KeywordDrivenFramework {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void registration() {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)", "");
		driver.findElement(By.id(prop.getProperty("firstNameId"))).sendKeys("Pravin");
		driver.findElement(By.cssSelector(prop.getProperty("lastNameCss"))).sendKeys("Garde");
		driver.findElement(By.xpath(prop.getProperty("emailXpath"))).sendKeys("pravingarde@gmail.com");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("src/com/TestNGDemos/MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);			//Read and store all the properties from .properties file
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
	}

}

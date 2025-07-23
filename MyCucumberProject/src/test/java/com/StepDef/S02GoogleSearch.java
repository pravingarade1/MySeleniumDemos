package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S02GoogleSearch {
	WebDriver driver;

	String title;
	
	@Given("Launch google browser")
	public void launch_google_browser() {
		System.out.println("Launching Google");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com/");
	}

	@When("User enters any keyword to search")
	public void user_enters_any_keyword_to_search() {
	    
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}

	@When("User hits enter")
	public void user_hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("Valid search result should display")
	public void valid_search_result_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("Selenium"));
	}

}

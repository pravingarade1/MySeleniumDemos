package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class S01GoogleTitle {
	WebDriver driver;
	String title;
	@Given("Launch google")
	public void launch_google() {
	    System.out.println("Launching Google");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com/");
	    
	}

	@When("read title")
	public void read_title() {
		 System.out.println("Reading Google Title");
		 title=driver.getTitle();
	}

	@Then("title should be Google")
	public void title_should_be_google() {
		 System.out.println("Title Google validated");
		 Assert.assertTrue(title.equals("Google"));
	}

}

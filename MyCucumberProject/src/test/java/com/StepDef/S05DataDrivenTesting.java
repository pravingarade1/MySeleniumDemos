package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S05DataDrivenTesting {
	WebDriver driver=new ChromeDriver();
	String title;
	@Given("Launch page {string}")
	public void launch_page(String url) {
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	}

	@When("I enter user name {string}")
	public void i_enter_user_name(String un) {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}
	
	@When("I enter user password {string}")
	public void i_enter_user_password(String pass) {
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	}

	@When("I click on submit")
	public void i_click_on_submit() {
	    driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@Then("User should get login")
	public void user_should_get_login() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
	}

}

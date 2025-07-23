package com.StepDef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04RediffRegistration {
	static WebDriver driver=new ChromeDriver();
	String title;
	
	@Given("Launch Rediff url")
	public void launch_rediff_url() {
		//driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@When("I enter valid full name as {string}")
	public void i_enter_valid_full_name_as(String fn) {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input")).sendKeys(fn);
	    
	}

	@When("I enter valid rediff id {string}")
	public void i_enter_valid_rediff_id(String id) {
	    
		driver.findElement(By.cssSelector("input[id^=\"login\"]")).sendKeys(id);
	}

	@When("I enter valid rediff password  as {string}")
	public void i_enter_valid_rediff_password_as(String pass) {
		
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(pass);
		
	}

	@When("I reenter valid password  as {string}")
	public void i_reenter_valid_password_as(String repass) {
	    
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(repass);
	}
	
	@When("I select birth date")
	public void i_select_birth_date(io.cucumber.datatable.DataTable dataTable) {
	    
		List<List<String>> data=dataTable.asLists(String.class);
		
		new Select(driver.findElement(By.xpath("//select[starts-with(@name,\"DOB_Day\")]"))).selectByVisibleText(data.get(0).get(0));
		new Select(driver.findElement(By.xpath("//select[starts-with(@name,\"DOB_Month\")]"))).selectByVisibleText(data.get(0).get(1));
		new Select(driver.findElement(By.xpath("//select[starts-with(@name,\"DOB_Year\")]"))).selectByVisibleText(data.get(0).get(2));
		
	}

	@When("I click on Check availibility button")
	public void i_click_on_check_availibility_button() {
	 
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
		
	}

	@Then("rediff id available message should display")
	public void rediff_id_available_message_should_display() {
		
		title=driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText();
		System.out.println(title);
		Assert.assertTrue(title.contains("Yippie"));
		driver.navigate().refresh();
	    
	}


	@When("I enter invalid full name as {string}")
	public void i_enter_invalid_full_name_as(String fn) {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input")).sendKeys(fn);
	    
	}

	@When("I enter invalid rediff id {string}")
	public void i_enter_invalid_rediff_id(String id) {
	    
		driver.findElement(By.cssSelector("input[id^=\"login\"]")).sendKeys(id);
	}

	@When("I enter invalid rediff password  as {string}")
	public void i_enter_invalid_rediff_password_as(String pass) {
		
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(pass);
		
	}

	@When("I reenter invalid password  as {string}")
	public void i_reenter_invalid_password_as(String repass) {
	    
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(repass);
	}
	
	@When("user select birth date")
	public void user_select_birth_date(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
		
		for(Map<String,String> dt:data)
		{
			new Select(driver.findElement(By.xpath("//select[starts-with(@name,\"DOB_Day\")]"))).selectByVisibleText(dt.get("Day"));
			new Select(driver.findElement(By.xpath("//select[starts-with(@name,\"DOB_Month\")]"))).selectByVisibleText(dt.get("Month"));
			new Select(driver.findElement(By.xpath("//select[starts-with(@name,\"DOB_Year\")]"))).selectByVisibleText(dt.get("Year"));
		}
	}

	@When("user click on Check availibility button")
	public void user_click_on_check_availibility_button() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
	}

	@Then("rediff id unavailable message should display")
	public void rediff_id_unavailable_message_should_display() {
		title=driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText();
		System.out.println(title);
		Assert.assertTrue(title.contains("Yippie"));
		driver.close();
	}


}

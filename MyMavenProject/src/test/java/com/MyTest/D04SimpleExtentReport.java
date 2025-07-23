package com.MyTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04SimpleExtentReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MyReport1.html");
		//Represents the report file
		ExtentReports report = new ExtentReports();
		//Represents the report
		report.attachReporter(htmlReport);
		//This will store the report in html file
		ExtentTest test;
		//This object represents the test
		
		//Adding environment details for report
		report.setSystemInfo("Machine Name", "Dell");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("User Name", "Ankush");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Processor", "I5");
		
		//Report configuration
		htmlReport.config().setDocumentTitle("My First Report");
		htmlReport.config().setReportName("Google Test Report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setTimeStampFormat("dd - MMM - yyyy");
		
		test = report.createTest("Google Title");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
		
		test.log(Status.PASS, MarkupHelper.createLabel("Verified Google Title", ExtentColor.GREEN));
		
		test = report.createTest("Google Search");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Sara Ali Khan", Keys.ENTER);
		
		driver.close();
		
		test.log(Status.FAIL, MarkupHelper.createLabel("Verified Google Search Functionality", ExtentColor.RED));
		
		report.flush();			//Generates the report
	}

}

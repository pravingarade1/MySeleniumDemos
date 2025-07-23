package com.MyTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04ExtendReportDemo {

	public static void main(String[] args) {
		
		ExtentSparkReporter htmlReport= new ExtentSparkReporter("MyReport.html"); // Represent the report file
		
		ExtentReports report=new ExtentReports(); //Represent the report
		
		report.attachReporter(htmlReport); // This will store report in html file
		
		ExtentTest test;
		
		
		htmlReport.config().setDocumentTitle("My Google Report");
		
		htmlReport.config().setTheme(Theme.DARK);
		
		htmlReport.config().setTimeStampFormat("dd - MMM - yyyy");
		
		htmlReport.config().setReportName("My Google");
		
		report.setSystemInfo("computer name", "Lenovo");
		
		report.setSystemInfo("OS", "Window 11");
		
		report.setSystemInfo("Browser", "Chrome");
		
		test=report.createTest("Google tile");
		
		test.log(Status.PASS, MarkupHelper.createLabel("Google Titlee test", ExtentColor.GREEN));
		report.flush();
		
		
		

	}

}

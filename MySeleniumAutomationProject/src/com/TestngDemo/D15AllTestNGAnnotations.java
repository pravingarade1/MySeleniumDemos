package com.TestngDemo;
import org.testng.annotations.*;

public class D15AllTestNGAnnotations {
	

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Before Test");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Before Method");
	    }

	    @Test
	    public void test1() {
	        System.out.println("Test 1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Test 2");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("After Method");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite");
	    }
	}

/*
o/p

Before Suite
Jul 06, 2025 11:01:30 AM org.testng.log4testng.Logger info
INFO: [Utils] DynamicGraphHelper.createDynamicGraph() took 31 ms.
Before Test
Before Class
Before Method
Test 1
After Method
Before Method
Test 2
After Method
After Class
After Test
PASSED: com.TestngDemo.D15AllTestNGAnnotations.test2
PASSED: com.TestngDemo.D15AllTestNGAnnotations.test1

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

After Suite

*/
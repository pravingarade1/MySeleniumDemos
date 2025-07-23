package com.MyTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03ExcelDataReaderTestNG {
  @Test(dataProvider="readExcel", dataProviderClass= com.MyTest.D03ExcelReader.class)
  public void loginTest(String un,String ln) {
	  System.out.print(un);
	  System.out.println("\t"+un);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}

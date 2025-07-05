package com.TestngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D14ExcelReadData {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

  @Test
  public void readAllData() {
	  int rows=sheet.getPhysicalNumberOfRows();
	  int cols=sheet.getRow(0).getPhysicalNumberOfCells();
	  
	  for(int i=0;i<rows;i++)
	  {
		  row=sheet.getRow(i);
		  for(int j=0;j<cols;j++)
		  {
			  cell=row.getCell(j);
			  System.out.print(cell.getStringCellValue());
		  }
		  System.out.println();
	  }
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File("ExcelFiles/MultipleRowtExcelDataProviderFile.xlsx");
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  sheet =wb.getSheet("My Sheet");
	  
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();

  }

}

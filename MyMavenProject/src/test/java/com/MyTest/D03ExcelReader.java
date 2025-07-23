package com.MyTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class D03ExcelReader {
	
	@DataProvider
	public String[][] readExcel() throws IOException
	{
		String fpath="E:\\Automation\\Pravin_SeleniumDemos\\MySeleniumAutomationProject\\ExcelFiles\\MultipleRowtExcelFile.xlsx";
		File file=new File(fpath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		String[][] data=new String[sheet.getPhysicalNumberOfRows()][2];
		
		for(int i=0;i< sheet.getPhysicalNumberOfRows();i++)
		{
			for(int j=0;j< 2;j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		wb.close();
		fis.close();
		return data;
		
	}

}



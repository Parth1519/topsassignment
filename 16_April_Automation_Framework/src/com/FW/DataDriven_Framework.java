package com.FW;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDriven_Framework
{
	public String[][] read_exel() throws InvalidFormatException, IOException
	{
		String[][] data = null;
		
		String filepath = "D:\\Selenium\\16_April_POI.xlsx";
		File file = new File(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("DataDriven");
		
		int n_rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Number Of Rows Are: "+n_rows);
		
		data= new String[n_rows][];
		
		for (int i=0;i<data.length;i++)
		{
			Row row = sheet.getRow(i);
			int n_col = row.getPhysicalNumberOfCells();
			System.out.println("Total Number Of Column Are: "+n_col);
			data[i]=new String[n_col];
			
			for(int j=0;j<data[i].length;j++)
			{
				org.apache.poi.ss.usermodel.Cell cell = row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}
		return data;
	}
	
	WebDriver driver =null;
	@Test
	public void Test() throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");	
		String[][] data = read_exel();
		for (int i = 0; i < data.length; i++)
		{
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			   
			driver.findElement(By.id("user-name")).sendKeys("data[i][0]");
			Thread.sleep(3000);
		
			driver.findElement(By.id("password")).sendKeys("data[i][1]");
			Thread.sleep(3000);
			
			driver.findElement(By.id("login-button")).sendKeys("");
			Thread.sleep(3000);
			
			if(driver.getCurrentUrl().equals("https://www.saucedmo.com/inventory.html"))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(3000);
		
			driver.findElement(By.id("logout_sidbar_link")).click();
			Thread.sleep(3000);
		}
	}
}
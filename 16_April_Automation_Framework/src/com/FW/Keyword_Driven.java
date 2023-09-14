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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Keyword_Driven
{
	@DataProvider(name = "Parth")
	public Object[][] read_exel() throws InvalidFormatException, IOException
	{
		Object[][] data = null;
		
		String filepath = "D:\\Selenium\\16_April_POI.xlsx";
		File file = new File(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("KeywoardDriven");
		
		int n_rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Number Of Rows Are: "+n_rows);
		
		data= new Object[n_rows][];
		
		for (int i=0;i<data.length;i++)
		{
			Row row = sheet.getRow(i);
			int n_col = row.getPhysicalNumberOfCells();
			System.out.println("Total Number Of Column Are: "+n_col);
			data[i]=new Object[n_col];
			
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
	@Test(dataProvider = "Parth")
	public void Test(String keyword) throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");	
		Object[][] data = read_exel();
		 if (keyword.equals("open browser"))
		 {
			 driver = new ChromeDriver();
		 }
		 else if (keyword.equals("open url"))
		 {
			 driver.get("https://www.saucedemo.com/");
			 Thread.sleep(3000);
		 }
		 else if (keyword.equals("enter username"))
		 {
			 driver.findElement(By.id("user-name")).sendKeys("standard_user");
			 Thread.sleep(3000);
		 }
		 else if (keyword.equals("enter password"))
		 {
			 driver.findElement(By.id("password")).sendKeys("secrec_sauce");
			 Thread.sleep(3000);
		 }
		 else if (keyword.equals("click login"))
		 {
			 driver.findElement(By.id("login-button")).click();
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
		 else if (keyword.equals("close browser"))
		 {
			 Thread.sleep(3000);
			 driver.close();
		 }		
	}
}
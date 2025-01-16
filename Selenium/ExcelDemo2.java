package day16;


import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExcelDemo2
{
	//apache poi jar : https://archive.apache.org/dist/poi/release/bin/poi-bin-5.2.3-20220909.zip
	//excel file with data
	//apache poi jar, in addition to selenium jar files
	//https://archive.apache.org/dist/poi/release/bin/poi-bin-3.0-FINAL-20070503.zip
	//add the downloaded jar files to the project
	//using - configure build path->selecting class path
	//click button - Add external jars and add jar files.
	public static void main(String[] args) 
	{
		try {
			File f=new File("D:\\downloads\\testing_login.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook workbook = new XSSFWorkbook(fis); // Use HSSFWorkbook for .xls files
			Sheet sheet = workbook.getSheetAt(0); // Assuming you want the first sheet
			
			WebDriver driver=new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.get("file:///C:/Users/HP/OneDrive/Desktop/HTML%20Pages/LoginPage.html");
			
			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
			System.out.println("Total number of rows: " + rowCount);
			
			int columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println("Total number of columns: " + columnCount);
			
			for(int i=1; i<rowCount;i++)
			{
				Row row1 = sheet.getRow(i);
				
					Cell cell1 = row1.getCell(0);
					Cell cell2 = row1.getCell(1);
					String name1 = cell1.getStringCellValue();
					String pass1 = cell2.getStringCellValue();
					WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userid")));
					WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pswrd")));
					username.sendKeys(name1);
					password.sendKeys(pass1);
					WebElement login = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/input[3]")));
					login.click();
					driver.switchTo().alert().accept();
					username.clear();
					password.clear();
					
					
			}
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



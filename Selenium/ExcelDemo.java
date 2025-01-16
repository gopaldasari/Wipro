package day16;


import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExcelDemo 
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
			//File f=new File("c://drivers//hello.xlsx");
			//FileInputStream fis = new FileInputStream(f);
			FileInputStream fis=new FileInputStream("D:\\downloads\\test.xlsx");
			Workbook workbook = new XSSFWorkbook(fis); // Use HSSFWorkbook for .xls files
			Sheet sheet = workbook.getSheetAt(0); // Assuming you want the first sheet
			Row row = sheet.getRow(3);
			//Cell cell1 = sheet.getRow(1).createCell(0);
			//cell1.setCellValue("PASS");
			//System.out.println(cell1.getStringCellValue());
			Cell cell11 = row.getCell(1);
			String name=cell11.getStringCellValue();
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/HP/OneDrive/Desktop/HTML%20Pages/WorkingWithForms.html");
			//Find Username textbox and enter value
			driver.findElement(By.id("txtUserName")).sendKeys(name);
			//Get the total number of rows (excluding header row)
			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
			System.out.println("Total number of rows: " + rowCount);
			// Get the total number of columns (assuming all rows have the same number of columns)
			int columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println("Total number of columns: " + columnCount);
			for(int i=0; i<rowCount;i++)
			{
				Row row1 = sheet.getRow(i);
				for(int j=0;j<columnCount;j++)
				{
					Cell cell2 = row1.getCell(j);
					switch (cell2.getCellType()) {
					case STRING:
						System.out.print(cell2.getStringCellValue() + " ");
						break;
					case NUMERIC:
						System.out.print(cell2.getNumericCellValue() + " ");
						break;
						// Add handling for other cell types (e.g., BOOLEAN, FORMULA) if needed
					default:
						System.out.print("Unknown cell type ");
					}
				}
				System.out.println("");
			}
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



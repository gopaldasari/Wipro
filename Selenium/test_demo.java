package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_demo 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
	WebDriver driver = new  ChromeDriver();
	WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	driver.get("https://example.com");
	String Title1 = driver.getTitle();
	System.out.println(Title1);
	//WebElement  = wait.until(ExpectedConditions.presenceOfElementLocated(By.))
	driver.navigate().to("https://google.com");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	String Title2 = driver.getTitle();
	if(Title1.contentEquals(Title2))
	{
		System.out.println("Verification :Passed");
	}
	
	driver.navigate().to("https://www.saucedemo.com/");
	WebElement user = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"user-name\"]")));
	WebElement pass = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")));
	user.sendKeys("standard_user");
	pass.sendKeys("secret_sauce");
	
	WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-button\"]")));
	login.click();
	WebElement product = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span")));
	if(product.getText().contentEquals("Products"))
	{
		System.out.println("Verification :Passed");
	}
	WebElement cart1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")));
	cart1.click();
	WebElement cart2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")));
	cart2.click();
	WebElement cart3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shopping_cart_container\"]/a")));
	cart3.click();
	
	WebElement cart_badge= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")));
	if(cart_badge.getText().contentEquals("2"))
	{
		System.out.println("Verification :Passed");
	}
	WebElement icon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-burger-menu-btn\"]")));
	icon.click();
	
	WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
	logout.click();
	
	
	driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
	WebElement start = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"start\"]/button")));
	start.click();
	
	WebElement txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
	System.out.println(txt.getText());
	if(txt.getText().contentEquals("Hello World!"))
	{
		System.out.println("Verification txt :Passed");
	}
	driver.navigate().to("https://www.saucedemo.com/");
	File f=new File("D:\\downloads\\testing_login.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook workbook = new XSSFWorkbook(fis); // Use HSSFWorkbook for .xls files
	Sheet sheet = workbook.getSheetAt(0);
	Row row1 = sheet.getRow(1);
	Cell cell1 = row1.getCell(0);
	Cell cell2 = row1.getCell(1);
	 user = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"user-name\"]")));
	 pass = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")));
	user.sendKeys(cell1.getStringCellValue());
	pass.sendKeys(cell2.getStringCellValue());
	
	driver.quit();
	
	}
}

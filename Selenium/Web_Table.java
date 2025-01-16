package Day14;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Table 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/Web_Table.html");
		driver.manage().window().maximize();
		WebElement First_Name = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table/tbody/tr[2]/td[1]")));
		WebElement Last_Name = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table/tbody/tr[2]/td[2]")));
		WebElement Age = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table/tbody/tr[2]/td[3]")));
		
		System.out.println("Extracted Name :"+First_Name.getText()+" "+Last_Name.getText());
		System.out.println("Extracted Age :"+Age.getText());
		//driver.close();
		driver.quit();
	}
}

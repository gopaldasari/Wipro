package Day14;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo 
{
	
	public static void main(String[] args) 
	{
		String baseUrl = "file:///C:/Users/HP/OneDrive/Desktop/Demo.html";
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get(baseUrl);
		WebElement innertext =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table/tbody/tr[2]/td[2]")));
				
	    System.out.println("Text in the forth cell of the page : "+innertext.getText()); 
		driver.quit();
		}
}



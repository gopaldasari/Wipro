package Day14;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class try_catch_finally 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		try 
		{
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		
		//First Element
		WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='gLFyf']")));
		search.sendKeys("gopal");
		System.out.println("Frist Web-Element founded");
		
		//Second Element
		WebElement search1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='gLFy']")));
		search1.sendKeys("dasari");
		System.out.println("Second Web-Element founded");
		}
		catch (Exception e) 
		{
			System.err.println("No such WebElement founded or Timeout");
		}
		finally 
		{
			driver.quit();
		}
		
	}
}

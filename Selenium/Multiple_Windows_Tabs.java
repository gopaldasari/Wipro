package Day14;

import java.time.Duration;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiple_Windows_Tabs 
{
	static WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@BeforeAll
	static void beforeAll() throws Exception
	{
		System.out.println("---------------Before All-----------------");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		System.out.println("Opened the given site : "+driver.getTitle());
	}
	
	@Test
	void meth1() throws Exception
	{
		System.out.println("------------------Test--------------------");
		String parentWindow = driver.getWindowHandle();
		WebElement click_here = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div/a")));
		click_here.click();
		System.out.println("Clicked on the link and opened new window");
	
		Set<String> childWindows = driver.getWindowHandles();
		for (String childWindow : childWindows) 
		{
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println("Switched to New Window");
			}
		}
		WebElement heading= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3")));
		if(heading.getText().equals("New Window"))
		{
			System.out.println("Verification of heading text : PASSED");
		}
		if(!heading.getText().equals("New Window"))
		{
			System.out.println("Verification of heading text : FAILED");
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("Closed New Window And Switched to Parent Window : "+driver.getTitle());
		
	}
	
	@AfterAll
	static void afterAll() throws Exception
	{
		System.out.println("-----------------After All-----------------");
		driver.quit();
		System.out.println("Driver is closed");
	}
	
	
	
	
}

package Day14;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Web_Elements 
{
static WebDriver driver;
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("---------------Before All-----------------");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Opened the given site : "+driver.getTitle());
	}
	
	@AfterAll
	static void afterAll() throws Exception
	{
		System.out.println("-----------------After All-----------------");
		driver.quit();
		System.out.println("Driver is closed");
	}
	
	@Test
	void test() throws InterruptedException
	{
		System.out.println("-------------------Test-------------------");
		WebElement search_bar = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		search_bar.sendKeys("Selenium");
		Thread.sleep(5000);
		
		//WebElement search_suggestions = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));
		//System.out.println(search_suggestions.getText());
		
		 List<WebElement> suggestions = driver.findElements(By.cssSelector("ul[role='listbox'] li"));

         // PRINT AUTOCOMPLETE SUGGESTION
         for (WebElement suggestion : suggestions) 
         {
             System.out.println(suggestion.getText());
         }

		
		
	}
}

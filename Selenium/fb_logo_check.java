package Day11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_logo_check 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).isDisplayed();
		if (logo == true) 
		{
		System.out.println("logo is available");
		} 
		else 
		{
		System.out.println("logo is not available");
		}
	}
}
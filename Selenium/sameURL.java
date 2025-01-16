package Day11;

//Go to adactin.com website and check that same webpage is opened

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class sameURL 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		String s = driver.getCurrentUrl();
		
		if (s.equals("https://adactinhotelapp.com/")) 
		{
		System.out.println("u r in adactin website");
		} 
		else 
		{
		System.out.println("u r not in adactin website");
		}
	}
}

package Day11;

// Go to google.com, check the google logo is available or not

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_logo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		boolean logo = driver.findElement(By.className("lnXdpd")).isDisplayed();
		if (logo == true) 
		{
		System.out.println("Logo is available");
		} 
		else 
		{
		System.out.println("Logo is not available");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

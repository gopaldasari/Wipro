package Day11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_forgot 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("9553143655");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
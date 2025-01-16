package Day11;

//Go to google.com, click gmail and check the title is Gmail or not

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmail_title 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div[5]/a[2]")).click();
		String s = driver.getTitle();
		if (s.equals("Gmail")) 
		{
		System.out.println("Title extracted : "+s);
		} else {
		System.out.println("Title extracted is not Gmail");
		}
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}

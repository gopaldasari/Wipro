package Day11;

//isEnabled
//It is a method, is used to check particular text box is enable to print or not

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class isEnabled 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//*[@id='email']"));
		if (logo.isEnabled()) 
		{
		System.out.println("Text box is enable to print");
		} 
		else 
		{
		System.out.println("not enable");
		}
		driver.quit();
	}
}

package Day11;

//getAttribute() and getText():
//It is a method, used to print the value whatever you gave in the text box

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class get 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		String s = driver.findElement(By.id("username")).getDomProperty("value");
		String s1 = driver.findElement(By.id("password")).getDomProperty("value");
		System.out.println(s);
		System.out.println(s1);
	}
}

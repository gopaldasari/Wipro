package Day12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait_demo
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("Venkat");
		driver.findElement(By.id("password")).sendKeys("Venkat@123");
		driver.findElement(By.id("login")).click();
	}
}

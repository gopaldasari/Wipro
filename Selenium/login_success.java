package Day11;

//Go to adactin.com website and give username &password and login

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_success
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		driver.findElement(By.id("login")).click();
	}
}

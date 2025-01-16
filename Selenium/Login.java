package Day11;

//Adactin hotel login using id/name

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		WebElement x = driver.findElement(By.id("username"));
		x.sendKeys("vengatram");
		WebElement x1 = driver.findElement(By.name("password"));
		x1.sendKeys("vengat@123445");
		WebElement x2 = driver.findElement(By.id("login"));
		x2.click();
	}
}

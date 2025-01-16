package Day11;

//KeyBoard Actions using Sendkeys:

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_demo {
	public static void main(String[] args) throws InterruptedException 
	{
	//open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		WebElement x = driver.findElement(By.id("username"));
		x.sendKeys("vengatram");
		WebElement x1 = driver.findElement(By.name("password"));
		x.sendKeys(Keys.CONTROL,"ac");
		x1.sendKeys(Keys.CONTROL,"v");
	}
}

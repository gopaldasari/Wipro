package Day11;

//Go to adactin.com website, give wrong user name & password and click login. 
//Check the error msg(invalid login details) shown or not)

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class error_login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("login")).click();
		WebElement error= driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[5]/td[2]/div/b"));
		if (error.isDisplayed()) 
		{
		System.out.println(error.getText());
		} 
		else
		{
		System.out.println("Error message not Displayed");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahoo_locators 
{
	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/account/create");
	driver.findElement(By.id("usernamereg-firstName")).sendKeys("Gopal");
	driver.findElement(By.id("usernamereg-lastName")).sendKeys("Dasari");
	driver.findElement(By.id("usernamereg-userId")).sendKeys("sai111gopal");
	driver.findElement(By.id("usernamereg-password")).sendKeys("asjl@13435822");
	
	Select s = new Select(driver.findElement(By.id("usernamereg-month")));
	s.selectByValue("1");
	driver.findElement(By.id("usernamereg-day")).sendKeys("01");
	
	driver.findElement(By.id("usernamereg-year")).sendKeys("2000");
	driver.findElement(By.id("reg-submit-button")).click();
	driver.findElement(By.id("usernamereg-phone")).sendKeys("9553143655");
	}

}

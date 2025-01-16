package Da11;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_create
{
public static void main(String[] args) 
{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sharu");
		driver.findElement(By.name("lastname")).sendKeys("madhyahnapu");
		
		Select s=new Select(driver.findElement(By.name("birthday_day")));
		s.selectByIndex(12);
		
		Select m=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		m.selectByVisibleText("Dec");
		
		Select y=new Select(driver.findElement(By.id("year")));
		y.selectByIndex(24);
		
		driver.findElement(By.cssSelector("input[name='sex'][value='1']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("12345678");
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.close();

	}

}

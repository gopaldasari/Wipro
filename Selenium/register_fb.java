package Day11;

// Facebook registration

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class register_fb 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dasari");
		WebElement day =driver.findElement(By.xpath("//*[@id=\"day\"]"));
		day.click();
		Select s = new Select(day);
		s.selectByContainsVisibleText("1");
		WebElement month =driver.findElement(By.xpath("//*[@id=\"month\"]"));
		month.click();
		Select s1 = new Select(month);
		s1.selectByContainsVisibleText("Aug");
		WebElement year =driver.findElement(By.xpath("//*[@id=\"year\"]"));
		year.click();
		Select s2 = new Select(year);
		s2.selectByContainsVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9553143655");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Gop@123456");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
}

package Da11;

//selectByVisibletext:

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyVisibletext_dpdown 
{
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	WebElement w = driver.findElement(By.name("coffee"));
	Select s=new Select(w);
	s.selectByVisibleText("With cream & sugar");
	
	}
}

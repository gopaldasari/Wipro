package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);		
		WebElement textEle =driver.findElement(By.id("login_field"));
		if(textEle.isDisplayed())
		{
			if(textEle.isEnabled())
			{
				textEle.sendKeys("Gopal");
				String s = textEle.getAttribute("value");
				System.out.println(s);
				Thread.sleep(3000);		
				textEle.clear();
			}
			else
				System.out.println("error");
		}
		else
			System.out.println("error");
	}
}

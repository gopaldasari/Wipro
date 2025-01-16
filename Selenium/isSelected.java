package Day11;

//isSelected
//It is a method, is used to check particular radio box or chechbox is Selected 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class isSelected 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement radio =driver.findElement(By.cssSelector("input[value='2']"));
		radio.click();
		Thread.sleep(3000);
		if (radio.isSelected())
		{
		System.out.println(" button is selected");
		} 
		else
		{
		System.out.println("not selected");
		}
		//driver.quit();
	}
}

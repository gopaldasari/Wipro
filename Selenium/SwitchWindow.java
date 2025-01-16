package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SwitchWindow

{
 
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/NOTES/batch-1%20class/Day10/HTML%20Pages/PopupWin.html");
		String parentWindow = driver.getWindowHandle().toString();
		Thread.sleep(2000);
		driver.findElement(By.name("Open")).click();
		Thread.sleep(2000);
		driver.switchTo().window("PopupWindow");
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
 
	}
 
}



       
 
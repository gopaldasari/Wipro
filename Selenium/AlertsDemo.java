package Day12;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class AlertsDemo 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/NOTES/batch-1%20class/Day10/HTML%20Pages/AlertBoxDemos.html");
		
		//driver.switchTo().frame(driver.findElement(By.id("frame")));
		//driver.switchTo().frame(0);
				
		driver.findElement(By.id("alert")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		driver.findElement(By.id("confirm")).click();
		Alert b=driver.switchTo().alert();
		b.accept();
		String t=driver.findElement(By.id("democonfirm")).getText();
		System.out.println(t);
	
		driver.findElement(By.id("confirm")).click();
		Alert c=driver.switchTo().alert();
		c.dismiss();
		t=driver.findElement(By.id("democonfirm")).getText();
		System.out.println(t);
		
		Thread.sleep(5000);		
	
		
	}
 
}
 
 

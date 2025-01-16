package Day11;

//getLocation() and getSize():

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class get_location_size 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/login-to-product");
		WebElement un = driver.findElement(By.id("Enteryouremail"));
		//To get the size of an element; height & width
		Dimension s = un.getSize();
		System.out.println(s);
		int h = s.getHeight();
		int w = s.getWidth();
		System.out.println("Height: "+h);
		System.out.println("Width: "+w);
		//To get location of an element; x-axis & y-axis
		Point l = un.getLocation();
		int x = l.getX();
		int y = l.getY();
		System.out.println("x-axis: "+x);
		System.out.println("y-axis: "+y);
		Thread.sleep(1000);
		//driver.close();
		driver.quit();
	}
}

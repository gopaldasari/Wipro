package Day11;

//In check box, we can able to select more than one value at a time.

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class select_checkbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("https://formy-project.herokuapp.com/");
       driver.findElement(By.xpath("/html/body/div/div/li[3]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")).click();
	}

}

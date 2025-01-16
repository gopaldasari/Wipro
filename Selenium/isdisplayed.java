package Day11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class isdisplayed 
{
    public static void main(String[] args) 
    {
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
       if (logo.isDisplayed()) 
       {
           System.out.println("Logo is available");
       }
       else 
       {
           System.out.println("Logo is not available");
       }
       driver.quit();
    }

}

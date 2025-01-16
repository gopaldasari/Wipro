package Day11;

//In check box, we can able to select more than one value at a time.

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_muti_checkbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("https://formy-project.herokuapp.com/");
       driver.findElement(By.xpath("/html/body/div/div/li[3]/a")).click();
       

       Thread.sleep(3000);
      
       List<WebElement> elem = driver.findElements(By.xpath("//input[@type='checkbox']"));
     
       for (WebElement x : elem) 
       {
           if (!x.isSelected()) 
           {
               x.click();
           }
       }
       Thread.sleep(2000);
       driver.quit();

       
	}

}

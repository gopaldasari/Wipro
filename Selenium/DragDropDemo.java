package Day14;

import java.time.Duration;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;		
		
 
public class DragDropDemo {				  
 
public static void main(String args[]) throws InterruptedException					
    {		
      					
         WebDriver driver= new ChromeDriver();		
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         driver.get("http://demo.guru99.com/test/drag_drop.html");	
         
         //Using Action class for drag and drop.
         //Dragged and dropped.	
         Actions act=new Actions(driver);
         
		//Element which needs to drag.    	
         WebElement From = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='credit2']/a")));
         //Element on which need to drop.	
         WebElement To = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='bank']/li")));
         act.dragAndDrop(From, To).build().perform();
    
         //---------------------------
         WebElement From1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"fourth\"]/a")));
         WebElement To1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"amt7\"]/li")));
         act.dragAndDrop(From1, To1).build().perform();	
         //---------------------------
         WebElement From2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"credit1\"]/a")));
         WebElement To2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loan\"]/li")));
         act.dragAndDrop(From2, To2).build().perform();	

         //---------------------------
         WebElement From3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"fourth\"]/a")));
         WebElement To3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"amt8\"]/li")));
         act.dragAndDrop(From3, To3).build().perform();	
         
        
         WebElement verify1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bal3\"]/table/tbody/tr/td[1]")));
         WebElement verify2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"t7\"]")));
         System.out.println(verify1.getText()+" : "+verify2.getText() );
         
         WebElement verify3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bal3\"]/table/tbody/tr/td[3]")));
         WebElement verify4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"t8\"]")));
         System.out.println(verify3.getText()+" : "+verify4.getText() );
         
         Thread.sleep(5000);
         driver.quit();
	}		
}
 
 
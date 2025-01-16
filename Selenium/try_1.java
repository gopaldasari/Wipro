package Day14;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class try_1 
{
	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https:\\www.google.com");
			try {
				WebElement ele = driver.findElement(By.id("Non Existing element"));
				ele.click();
			}
			catch(NoSuchElementException nse) {
				System.out.println("No element found with given element id: "+nse.getMessage());
			}
			catch(Exception e) {
				System.out.println("Exception: "+e.getMessage());
			}
			
			finally {
			driver.quit();
			}
	
		}
}

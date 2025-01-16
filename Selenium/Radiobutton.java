package Day11;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

public static void main(String[] args) throws InterruptedException 
{
		
WebDriver driver=new ChromeDriver();
driver.get("file:///E:/NOTES/batch-1%20class/Day10/HTML%20Pages/WorkingWithForms.html");

Thread.sleep(2000);
//List<WebElement> radioButtons = driver.findElements(By.name("gender"));
List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='gender']"));
//List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='gender']"));

for (int i = 0; i < radioButtons.size(); i++) {
    WebElement radioButton = radioButtons.get(i);
    System.out.println(radioButton.getDomProperty("value"));
}


driver.close();
driver.quit();
	}

}
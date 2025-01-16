package Day12;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicit_wait_demo 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://adactin.com/HotelApp/index.php");
driver.findElement(By.id("username")).sendKeys("Venkat");
driver.findElement(By.id("password")).sendKeys("Venkat@123");

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
 
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login"))));
driver.findElement(By.id("login")).click();
}
}
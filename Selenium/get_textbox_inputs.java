package Day11;

//Go to adactin.com website, give user name & password and print that user name and password

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_textbox_inputs 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.get("http://www.adactin.com/HotelApp/index.php");
driver.findElement(By.id("username")).sendKeys("vengat16");
driver.findElement(By.id("password")).sendKeys("Karthick");
String s = driver.findElement(By.id("username")).getDomProperty("value");
String s1 = driver.findElement(By.id("password")).getDomProperty("value");
System.out.println(s);
System.out.println(s1);
}}

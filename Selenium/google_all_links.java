package Day11;

//To count number of links available in google page

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_all_links 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> x = driver.findElements(By.tagName("a"));
		// To find the count of the link
		System.out.println(x.size());
		// To print all links
		for (WebElement x1 : x) {
		System.out.println(x1.getDomProperty("href"));
		}
	}
}

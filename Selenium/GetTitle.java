package Day8;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main (String arg[])
	{
		//1. Open browser
		WebDriver driver=new ChromeDriver();
		
		//2. Launch AUT
		driver.get("https:\\demo.opencart.com");
		driver.manage().window().maximize();
		//3. Fetch and display title
		String actual=driver.getTitle(); //actual result
		System.out.println("Actual Title: "+actual);
		String expected ="Your Stores";
		System.out.println("Expected Title: "+expected);
		if(expected.contentEquals(actual))
			System.out.println("Title verification passed");
		else
			System.out.println("Title verification failed");
				
		//4. Close browser
		//driver.quit();
	}
 
}
 
 
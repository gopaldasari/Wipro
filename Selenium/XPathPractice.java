package Day14;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice 
{
	
	//Types of xpath
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		//Absolute XPath for certification coloumn
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav[1]/a[3]")).click();
		Thread.sleep(3000);
		
		//Relative XPath
		driver.findElement(By.xpath("//a[@title='Exercises and Quizzes']")).click();
	}

	
}


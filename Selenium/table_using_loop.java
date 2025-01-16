package Day14;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_using_loop
{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/Web_Table.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for(int i =1; i<rows.size();i++)
		{
			WebElement row = rows.get(i);
			List<WebElement> c = row.findElements(By.tagName("td"));
			String frstname = c.get(0).getText();
			String scondname = c.get(1).getText();
			String age = c.get(2).getText();

			System.out.println("First Name: " +frstname+ " | Second Name: "+scondname+ " | Age: " +age);
		}

		driver.quit();
	}

}



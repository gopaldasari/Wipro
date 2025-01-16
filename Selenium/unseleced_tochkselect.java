package Da11;

import java.util.List;

//To select the unselected value:
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class unseleced_tochkselect
{
		public static void main(String[] args) 
		{
			
			WebDriver driver = new ChromeDriver();
			driver.get("file:///E:/NOTES/batch-1%20class/Day10/HTML%20Pages/WorkingWithForms.html");
			List<WebElement> w = driver.findElements(By.cssSelector("input[name='chkHobbies']"));
			for (int i = 0; i < w.size(); i++) 
			{
				if (w.get(i).getAttribute("value").equals("Music")|| w.get(i).getAttribute("value").equals("Reading")) 
				{
					w.get(i).click();
				}
				if (!w.get(i).isSelected()) 
				{
				w.get(i).click();
				}
			}
		}
		

}

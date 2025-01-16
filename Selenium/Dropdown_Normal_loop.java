package Da11;
//Using normal for loop

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Normal_loop
{
	public static void main(String[] args) 
	{	
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s=new Select(w);
		//for selecting
		//s.selectByContainsVisibleText("Black");
		
		//for printing all option in console
		List<WebElement> o = s.getOptions();
		for (int i=0;i<o.size();i++) {
		System.out.println(o.get(i).getDomProperty("value"));
		}
	}
}

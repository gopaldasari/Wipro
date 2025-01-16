package Da11;

//2.MULTIPLE VALUE
//isMultiple():
	
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_value_select
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee2"));
		Select s=new Select(w);
		boolean b = s.isMultiple();
		System.out.println(b);
	}
}


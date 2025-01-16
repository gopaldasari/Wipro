package Da11;

//SelectByIndex:
	
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_by_index2
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee2"));
		Select s=new Select(w);
		List<WebElement> web = s.getOptions();
		for(int i=0;i<web.size();i++){
		s.selectByIndex(i);
		}

	}
}


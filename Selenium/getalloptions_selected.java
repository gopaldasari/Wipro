package Da11;

//getAllSelectedOptions()
//It is a method, used to print all selected options
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getalloptions_selected 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s=new Select(w);
		List<WebElement> web = s.getAllSelectedOptions();
		for(WebElement x:web)
		{
		System.out.println(x.getText());
		} 
	}
}

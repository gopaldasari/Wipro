package Da11;

//SINGLE VALUE
//To print all the options values
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown_opt_print
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s=new Select(w);
		List<WebElement> o = s.getOptions();
		for (WebElement x:o) 
		{
		System.out.println(x.getDomProperty("value"));
		}
	}
}

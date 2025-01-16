package Da11;

import java.util.List;

//Handling auto-suggestions
//We can handle auto suggestions by using findElements().
//WAS for the following scenario.
//Navigate to google
//Search for qspiders
//Count and print all the auto-suggestions
//Click on last suggestion

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_suggesttions {
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		// To get address of all the suggestions
		String xp = "//span[contains(text(),'selenium')]";
		List<WebElement> allSuggestions = driver.findElements(By.xpath(xp));
		// To count number of suggetions
		int count = allSuggestions.size();
		System.out.println(count);
		// To print all the suggestions
		for (int i = 0; i < count; i++) {
		WebElement suggestion = allSuggestions.get(i);
		String text = suggestion.getText();
		System.out.println(text);
		}
		// To click on last suggestion
		allSuggestions.get(count - 1).click();
		
	}
}


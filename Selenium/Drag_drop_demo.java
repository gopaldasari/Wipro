package Day14;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_drop_demo 
{

	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("demo-frame")));
		driver.switchTo().frame(frame);
		WebElement drag = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"draggable\"]")));
		WebElement drop= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"droppable\"]/p")));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
		
		
	}
}

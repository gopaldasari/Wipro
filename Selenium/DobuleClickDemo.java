package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;

public class DobuleClickDemo {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver= new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//Launch the Application Under Test (AUT)
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	//Double click the button to launch an alertbox
	Actions action = new Actions(driver);
	WebElement link =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Double-Click Me To See Alert']")));
	action.doubleClick(link).perform();
	
	//Switch to the alert box and click on OK button
	Alert alert = driver.switchTo().alert();
	System.out.println("Alert Text\n" +alert.getText());
	Thread.sleep(3000);
	alert.accept();
	
	//Closing the driver instance
	Thread.sleep(3000);
	driver.quit();

}
}

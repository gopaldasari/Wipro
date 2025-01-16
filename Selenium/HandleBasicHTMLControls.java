package Day10;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicHTMLControls 
{
	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click(); //radio button
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();//checkbox
		Thread.sleep(3000);
		WebElement hindiChk = driver.findElement(By.id("hindichbx"));//checkbox
		hindiChk.click(); // check
		Thread.sleep(3000);
		if(hindiChk.isSelected())
			hindiChk.click(); //uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();//button
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
	}
}
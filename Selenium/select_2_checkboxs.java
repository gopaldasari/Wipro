package Da11;

//To select two values:

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//To select two values:
public class select_2_checkboxs 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/NOTES/batch-1%20class/Day10/HTML%20Pages/WorkingWithForms.html");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/input[2]")).click();
		Thread.sleep(1000);
	}
}


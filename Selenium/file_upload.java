package Day12;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

//FILE UPLOADING USING ROBOT CLASS AND SENDKEYS:
//Using Robot class:
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload
{
	public static void main(String[] args) throws InterruptedException, Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		String path="file:///D:/downloads/Selenium%20%20Material.pdf";
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div[3]")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		StringSelection selection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		// press ctrl+vsss
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		// release ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		// press enter
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}

package Day11;

//Gmail Account Login

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmail_login
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AeZLP99DH-xkP3z7nElosyAr7cetJkFNeQ2euJKww9juKxfbB5ZfId5lXx-wLGIrvzuxN_FLZM5Hvg&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-972899557%3A1736314065523249&ddm=1");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("vengat161193");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();

		Thread.sleep(3000);
//		driver.close();
//		driver.quit();
	}
}
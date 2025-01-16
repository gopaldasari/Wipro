package Da11;



//Program 1: Gmail registration
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mail_create
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Venksdhat");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ram");
	driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
	Thread.sleep(5000);
	
	WebElement e =driver.findElement(By.xpath("//*[@id=\"month\"]"));
	Select s = new Select(e);
	s.selectByValue("1");
	driver.findElement(By.xpath("//input[@id='day']")).sendKeys("1");
	driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2001");
	WebElement e1 = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
	Select s1 = new Select(e1);
	s1.selectByValue("2");
	driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[1]/div/div[1]/div/div[3]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Gopal@123");
	driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Gopal@123");
	driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
	Thread.sleep(5000);
	driver.quit();
//	driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("9833484582");
//	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();
//	Thread.sleep(5000);
	
	
	}
}

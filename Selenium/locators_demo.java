package Day10;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators_demo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/NOTES/batch-1%20class/Day10/HTML%20Pages/WorkingWithForms.html");
		driver.findElement(By.id("txtUserName")).sendKeys("Gopal_dasari");
		Thread.sleep(1000);
		driver.findElement(By.name("txtPwd")).sendKeys("Gopal@123");
		Thread.sleep(1000);
		driver.findElement(By.className("Format")).sendKeys("Gopal@123");
		Thread.sleep(1000);
		driver.findElement(By.id("txtFirstName")).sendKeys("Gopal");
		Thread.sleep(1000);
		driver.findElement(By.id("txtLastName")).sendKeys("dasari");
		Thread.sleep(1000);
//		driver.findElement(By.id("rbMale")).click();
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"DOB\"]")).sendKeys("01-08-2000");
		Thread.sleep(1000);
		driver.findElement(By.id("txtEmail")).sendKeys("sai111gopal@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("txtAddress")).sendKeys("Godavari");
		Thread.sleep(1000);
		
		Select s = new Select(driver.findElement(By.name("City")));
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByContainsVisibleText("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.id("txtPhone")).sendKeys("9553143655");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.quit();

	}
	
}
//	driver.findElement(By.cssSelector("input.Format1")).sendKeys("Joel");
//	driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("Jack");
//String v=driver.findElement(By.id("txtAddress")).getAttribute("value");
//System.out.println("Textbox text: "+v);


//String expectedHeading="Email Registration";
//String actualHeading=driver.findElement(By.xpath("/html/body/h1")).getText();
//System.out.println("Expected Heading: "+expectedHeading +"Actual Heading: "+actualHeading);
//if(expectedHeading.contentEquals(actualHeading))
//	System.out.println("Heading verification passed");
//else
//	System.out.println("Heading verification failed");
//



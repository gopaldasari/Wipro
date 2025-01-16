package day16;

//package HelloTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	WebDriver driver;
	@BeforeMethod
	public void beforeEachTest()
	{
		System.out.println("From BeforeMethod annotation");
	}
	@AfterMethod
	public void afterEachTest()
	{
		System.out.println("From AfterMethod annotation");
	}
	@BeforeClass
	public void start()
	{
		System.out.println("From BeforeClass Annotation");
		driver=new ChromeDriver();
		driver.get("https:\\demo.opencart.com");
	}
	@AfterClass
	public void end() throws InterruptedException
	{
		System.out.println("From AfterClass annotation");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test(priority=2)
	public void verifyTitle() {
		System.out.println("From verifyTitle method");
		String t=driver.getTitle();
		Assert.assertEquals(t, "Your Store");
	}
	@Test(enabled=false)
	public void verifyText() {
		System.out.println("From verifyText method");
		String text=driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).getText();
		Assert.assertEquals(text, "Featured");
	}
}





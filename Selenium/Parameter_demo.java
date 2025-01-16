package Day17;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parameter_demo {
	SoftAssert sa=new SoftAssert();
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
		driver=new ChromeDriver();
		driver.get("https:\\demo.opencart.com");
		System.out.println("from before class");
	}
	@AfterClass
	public void end() throws InterruptedException
	{
		System.out.println(" from Afterclass annotation");
		Thread.sleep(3000);
		driver.quit();
	}
 
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
	}
	
  @Test (dataProvider = "data-provider")
  public void myTest (int a, int b, int result) {
	     int sum = a + b;//actual result
	    //Assert.assertTrue(result== sum);
	    Assert.assertNotEquals(result, sum);
  }
  
  @Test
  @Parameters({"x"})
  public void display(@Optional("6")int a) {
	  System.out.println(a);
  }
  
}

package Day10;
 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
class JunitDemo {
	static WebDriver driver;
 
@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("From Before All");
	driver=new ChromeDriver();
	driver.get("https:\\demo.opencart.com");
	}
 
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	Thread.sleep(3000);
	
	System.out.println("From After All");
	driver.quit();
	}
 
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("From Before Each");
	}
 
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("From After Each");
	}
 
	@Test
	void test1() throws InterruptedException {
		//driver=new ChromeDriver();
		//driver.get("https:\\demo.opencart.com");
		String actual=driver.getTitle();
		System.out.println("From Test. Title is :"+actual);
		//Thread.sleep(3000);
		//driver.close();
		Assert.assertEquals("Your Store", actual);
	}
	
	
 
}
 
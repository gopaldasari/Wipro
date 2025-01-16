package Day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try {
			
//			TASK 1: Opening the website 
			driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			driver.get("https://www.knowledgeware.in/Automation/practiceform.html");
			driver.manage().window().maximize();
			
//			TASK 2: Locate elements using different locators
			//By ID
			WebElement firstName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fname")));
			firstName.sendKeys("Gopal");
			//By NAME
			WebElement lastName = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lname")));
			lastName.sendKeys("Dasari");
			//By CssSelector
			WebElement Email = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='email']")));
			Email.sendKeys("sai111gopal@gmail.com");
			//By Xpath
			WebElement Male_radio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='male']")));
			Male_radio.click();
			WebElement Mobile = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mobile")));
			Mobile.sendKeys("9553143655");
			WebElement Date = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#dob")));
			Date.sendKeys("01-02-2000");
			WebElement Subjects = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subjects\"]")));
			Subjects.sendKeys("Selenium");
			WebElement H_Sports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sports']")));
			H_Sports.click();
			WebElement H_Reading = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='reading']")));
			H_Reading.click();
			WebElement H_Music = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='music']")));
			H_Music.click();
			WebElement Picture = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']")));
			Picture.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\p.jpg");
			WebElement Address = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"address\"]")));
			Address.sendKeys("607/1, hmt hills, Kphb");
			WebElement State = wait.until(ExpectedConditions.elementToBeClickable(By.id("countrySelect")));
			Select s = new Select(State);
			s.selectByIndex(1);
 			WebElement City = wait.until(ExpectedConditions.elementToBeClickable(By.id("citySelect")));
			Select c = new Select(City);
			c.selectByIndex(2);
			
			
			
//			TASK 3: Verification
//			1.NAME
			String Expected_name= "GopalDasari";
			String Actual_name= firstName.getAttribute("value")+lastName.getAttribute("value");
			if(Actual_name.contentEquals(Expected_name))
			{
				System.out.println("Verification Of Name : PASSED");
			}
			else
			{
				System.out.println("Verification Of Name : FAILED");
				System.out.println("Expected :"+Expected_name+"Actual :"+Actual_name);
			}
			
//			2.RADIO Button
			if(Male_radio.isDisplayed())
			{
				if(Male_radio.isEnabled())
				{
					if(Male_radio.isSelected())
					{
						System.out.println("Verification Of Male_radio : PASSED [Male_radio button selected]");
					}
					else
						System.out.println("Verification Of Male_radio : FAILED [Male_radio button not selected]");
					
				}
			}

			WebElement Female_radio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='female']")));
			
			if(Female_radio.isDisplayed())
			{
				if(Female_radio.isEnabled())
				{
					if(!Female_radio.isSelected())
					{
						System.out.println("Verification Of Female_radio : PASSED [Female_radio button not selected]");
					}
					else
						System.out.println("Verification Of Female_radio : FAILED [Female_radio button selected]");
				}
			}
			
//			3.HEADING
			WebElement Heading = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/h2")));
			
			String Actual_Heading =Heading.getText();
			//System.out.println(Actual_Heading);
			String Expected_Heading ="Student Registration Form";
			if(Actual_Heading.contentEquals(Expected_Heading))
			{
				System.out.println("Verification Of Heading : PASSED [Expected and Actual heading matched]");
			}
			else
				System.out.println("Verification Of Heading : FAILED [Expected and Actual heading not matched]");
			
//			4.CHECKBOXES
			if(H_Music.isDisplayed()&&H_Reading.isDisplayed()&&H_Sports.isDisplayed())
			{
				System.out.println("Verification Of CheckBoxes : PASSED [Checkboxes are visible]");
			}
			else
				System.out.println("Verification Of CheckBoxes : FAILED [Checkboxes are not visible]");
			
			
//			TASK 4: Navigation
			driver.navigate().to("https://www.google.co.in/");
			driver.navigate().back();
			
			String Original_Url ="https://www.knowledgeware.in/Automation/practiceform.html";
			String Current_Url =driver.getCurrentUrl();
			
			if(Original_Url.contentEquals(Current_Url))
			{
				System.out.println("Verification Of URL : PASSED");
			}
			else {
				System.out.println("Verification Of URL : FAILED");
				System.out.println("Expected :"+Original_Url+" Actual :"+Current_Url);
			}
		
			
		} catch (Exception e) 
		{
			System.err.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		} 
		finally 
		{
			if (driver != null) {
				Thread.sleep(3000);
				//driver.close();
				driver.quit();
				System.out.println("Driver closed successfully.");
			}
		}
	}
}

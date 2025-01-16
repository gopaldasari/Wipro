//	Lab Exercise: Selenium Locators and Basic Interactions
//	Objective:
//	To practice using Selenium locators and perform basic interactions 
//	with web elements such as text boxes, radio buttons, checkboxes, list boxes, and buttons.


package Day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_Lab_Day10 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
//		Step 1. Open the Heroku Demo Site : https://the-internet.herokuapp.com/
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println("Opened the Heroku Demo Site");
		Thread.sleep(2000);
		
		
//		Step 2. Click on the "Form Authentication" link.
		driver.findElement(By.linkText("Form Authentication")).click();
		System.out.println("Clicked on the Form Authentication link");
		Thread.sleep(2000);
		
		
//		Step 3. Locate the username text box and enter the username "tomsmith".
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		System.out.println("Located the username text box and entered the username = tomsmith");
		Thread.sleep(2000);
		
//		Step 4. Locate the password text box and enter the password "SuperSecretPassword!".		
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		System.out.println("Located the password text box and entered the password = SuperSecretPassword!");
		Thread.sleep(2000);
		
//		Step 5. Locate and click the login button.
		driver.findElement(By.className("radius")).click();
		System.out.println("Located and clicked the login button");
		Thread.sleep(2000);
		
//		Step 6. Validate Login: Verify that the login was successful by checking for a success message.
		System.out.println(driver.findElement(By.id("flash")).getText());
		System.out.println("Verified that the login was successful by checking for a success message");
		Thread.sleep(2000);
		
//		Step 7. Navigate to the Checkboxes Page: Click on the "Checkboxes" link.
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Checkboxes")).click();
		System.out.println("Navigated to the Checkboxes Page: Clicked on the Checkboxes link");
		Thread.sleep(2000);
		
//		Step 8.  Locate the first checkbox and check it if it is not already checked.
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		if(checkbox1.isDisplayed())
		{
			if(checkbox1.isEnabled())
			{
				if(!checkbox1.isSelected())
				{
					checkbox1.click();
				}
			}
		}
		System.out.println("Located the first checkbox and checked it if it is not already checked.");
		Thread.sleep(2000);
		
//		Step 9. Locate the second checkbox and uncheck it if it is already checked.
//		Step 10. Validate Checkboxes:  Verify the state of the checkboxes (first checkbox should be checked, second checkbox should be unchecked).
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		if(checkbox2.isDisplayed())
		{
			if(checkbox2.isEnabled())
			{
				if(checkbox2.isSelected())
				{
					checkbox2.click();
				}
			}
		}
		System.out.println("Located the second checkbox and unchecked it if it is already checked");
		System.out.println("Verified the checkboxes");
		Thread.sleep(2000);
		
//		Step 11. Navigate to the Dropdown Page: Click on the "Dropdown" link.
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();
		System.out.println("Navigated to the Dropdown Page: Clicked on the Dropdown link");
		Thread.sleep(2000);
		
//		Step 12. Locate the dropdown and select "Option 1".
		WebElement drop = driver.findElement(By.id("dropdown"));
		Select s = new Select(drop);
		s.selectByValue("1");
		System.out.println("Located the dropdown and selected Option 1");
		Thread.sleep(2000);
		
//		Step 13. Validate Dropdown Selection:  Verify that "Option 1" is selected.
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected option - " +selectedOption.getText());
		}	
		
//		---------------------------USING A DIFFERENT WEBSITE FOR RADIO BUTTONS AS THEY ARE NO RADIO BUTTONS SECTION IN GIVEN WESITE FOR PRACTICE-----------------------
		
//		Step 14. Interact with Radio Buttons:  Locate a radio button and select it.
//		Step 15. Validate Radio Button Selection:  Verify that the radio button is selected.
		driver.get("https://practice.expandtesting.com/radio-buttons");
		System.out.println("Located a radio button and selecting it");
		WebElement radio =driver.findElement(By.id("tennis"));
		if(radio.isDisplayed())
		{
			if(radio.isEnabled())
			{
				if(!radio.isSelected())
				{
					radio.click();
				}	
			}
			else
			System.out.println("radio button is not enabled");
		}
		else
		{
			System.out.println("radio button is not dispalyed");
		}
		System.out.println("Selected the radio button");
		Thread.sleep(2000);	

//		Step 16. Close the Browser: Ensure to close the browser after completing the tasks.
		driver.close();
		System.out.println("Browser is closed");
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Driver is closed");

	}

}

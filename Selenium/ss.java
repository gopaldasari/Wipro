package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ss {
   public static void main(String[] args) {
	// Launch browser
       WebDriver driver = new ChromeDriver();

       // Task 1: Open the Automation Practice Page
       driver.get("https://www.knowledgeware.in/Automation/practiceform.html");
   	driver.manage().window().maximize();
   	
       WebElement heading = driver.findElement(By.tagName("h1"));
       String actualHeading = heading.getText();
       String expectedHeading = "EPR Registration Form";
       if (actualHeading.equals(expectedHeading)) {
           System.out.println("Heading verification passed: Expected and Actual headings match.");
       } else {
           System.out.println("Heading verification failed. Expected: " + expectedHeading + ", Actual: " + actualHeading);
       }

       // Task 2: Locate elements using different locators and fill the form

       // Locate by ID and enter Name
       WebElement nameField = driver.findElement(By.id("fname"));
       nameField.sendKeys("John Doe");
       String actualName = nameField.getAttribute("value");
       String expectedName = "John Doe";
       if (actualName.equals(expectedName)) {
           System.out.println("Name verification passed: Expected and Actual names match.");
       } else {
           System.out.println("Name verification failed. Expected: " + expectedName + ", Actual: " + actualName);
       }

       // Locate by Name and enter Email
       WebElement emailField = driver.findElement(By.name("email"));
       emailField.sendKeys("johndoe@example.com");

       // Locate by Class Name and select Gender
       WebElement maleRadioButton = driver.findElement(By.id("male"));
       maleRadioButton.click();
       // Verify the 'Male' radio button is selected
       if (maleRadioButton.isSelected()) {
           System.out.println("Male radio button verification passed: Male is selected.");
       } else {
           System.out.println("Male radio button verification failed: Male is not selected.");
       }

       // Verify the 'Female' radio button is not selected
       WebElement femaleRadioButton = driver.findElement(By.id("female"));
       if (!femaleRadioButton.isSelected()) {
           System.out.println("Female radio button verification passed: Female is not selected.");
       } else {
           System.out.println("Female radio button verification failed: Female is selected.");
       }

       // Locate by CSS Selector and select a checkbox
       WebElement agreeCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
       agreeCheckbox.click();
       // Verify whether the checkbox is available (visible)
       if (agreeCheckbox.isDisplayed()) {
           System.out.println("Checkbox verification passed: Checkbox is visible.");
       } else {
           System.out.println("Checkbox verification failed: Checkbox is not visible.");
       }

       // Locate by XPath and enter the phone number
       WebElement phoneField = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
       phoneField.sendKeys("1234567890");

       // Task 4: Navigation

       // Navigate to Google page
       driver.navigate().to("https://www.google.com");

       // Navigate back to the original page
       driver.navigate().back();

       // Verify the URL is the original page after navigating back
       String currentUrl = driver.getCurrentUrl();
       String originalUrl = "https://www.knowledgeware.in/Automation/practiceform.html";
       if (currentUrl.equals(originalUrl)) {
           System.out.println("Navigation verification passed: Successfully navigated back to the original page.");
       } else {
           System.out.println("Navigation verification failed: Current URL is " + currentUrl + " instead of " + originalUrl);
       }

       // Close the browser
       driver.quit();

}
}

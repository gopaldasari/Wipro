package Da11;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selected_values_print 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
	
		 WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
		// femaleRadioButton.click();
		 if( femaleRadioButton.isSelected()) 
		 {
			 System.out.println("Selected : "+femaleRadioButton.getAccessibleName());
		 }	 
	     WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
	    // maleRadioButton.click();
	     if( maleRadioButton.isSelected()) 
		 {
	    	 System.out.println("Selected : "+maleRadioButton.getAccessibleName());
		 }	
	     WebElement customRadioButton = driver.findElement(By.xpath("//input[@value='-1']"));
	     customRadioButton.click();
	     if( customRadioButton.isSelected()) 
		 {
			 System.out.println("Selected : "+customRadioButton.getAccessibleName());
		 }	
	     List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='sex']"));
	     System.out.println("Avaliable radio buttons");
	     for (int i = 0; i < radioButtons.size(); i++) {
	         WebElement radioButton = radioButtons.get(i);
	         System.out.println(radioButton.getAccessibleName());
	     }
	     driver.quit();
		
	}
}
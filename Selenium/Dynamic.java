package Day14;

//package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
	    
		driver.findElement(By.id("checkbox")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[1]/button")).click();
		//*[@id="checkbox-example"]/button
		Thread.sleep(5000);
		System.out.println("message:" +  driver.findElement(By.id("message")).getText());
		driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).click();
		Thread.sleep(5000);
		System.out.println("message:" + driver.findElement(By.xpath("//*[@id='message']")).getText());
		
		
		driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='input-example']/input")).click();//  
	}

}

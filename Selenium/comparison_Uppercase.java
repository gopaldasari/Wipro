package Day8;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;

public class comparison_Uppercase 
{
	String url ="https://www.computerworld.com/uk/";

	public String chrome()
	{
		WebDriver driver1 = new ChromeDriver();
		driver1.get(url);
		String s1 = driver1.getTitle();
		System.out.println("Title from Chrome = "+s1);
		String SU =s1.toUpperCase();
		System.out.println("Title after changed to Uppercase = "+SU);
		driver1.quit();
		return SU;
	}
	public String edge()
	{
		WebDriver driver2 = new EdgeDriver();
		driver2.get(url);
		String s2 = driver2.getTitle();
		System.out.println("Title from Edge = "+s2);
		driver2.quit();
		return s2;
	}

	public static void main(String[] args) 
	{
		comparison_Uppercase obj = new comparison_Uppercase();
		String chrome =obj.chrome();
		String edge =obj.edge();
		
		if(chrome.equalsIgnoreCase(edge))
		{
			System.out.println("Title from Chrome & Edge is Same");
			System.out.println("Title verification Passed");
		}
		else 
		{
			System.out.println("Title from Chrome & Edge is different");
			System.out.println("Title verification Failed");
		}
		
	}

}

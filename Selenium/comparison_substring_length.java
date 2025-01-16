package Day8;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class comparison_substring_length 
{
	String url ="https://www.computerworld.com/uk/";

	public int chrome()
	{
		WebDriver driver1 = new ChromeDriver();
		driver1.get(url);
		String s1 = driver1.getTitle();
		System.out.println("Title from Chrome = "+s1);
		String sub_str = s1.substring(0, 4);
		System.out.println("Extracted first 4 characters of the title = "+sub_str);
		System.out.println("Length of extracted Substring = "+sub_str.length());
		driver1.quit();
		return sub_str.length();
	}
	
	public static void main(String[] args) 
	{
		comparison_substring_length obj = new comparison_substring_length();
		int chrome =obj.chrome();
		int expected_result = 4;
		System.out.println("Expected result from extracted sub_string is = "+expected_result);
		 if(chrome==expected_result)
		 {
			 System.out.println("Actual result from extracted sub_string is = "+chrome);
			 System.out.println("Substring verification Passed");
		 }
		 else
		 {
			 System.out.println("Actual result from extracted sub_string is = "+chrome);
			 System.out.println("Substring verification Failed");
		 }
	
	}

}

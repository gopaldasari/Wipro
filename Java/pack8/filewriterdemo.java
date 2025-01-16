package pack8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class filewriterdemo 
{
	
	public static void main(String[] args) 
	{
		
		
		try 
		{
			FileWriter fw = new FileWriter("src\\pack8\\file2.txt");
			
			String str = "java";
			fw.append(str);
	
			fw.append("gopal");
			
			//System.out.println(new String(str));
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}


}

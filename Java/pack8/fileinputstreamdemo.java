package pack8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileinputstreamdemo 
{
	
	public static void main(String[] args) 
	{
		File f = new File("src\\pack8\\file2.txt");
		
		try 
		{
			FileInputStream fis = new FileInputStream(f);
			byte [] res = new byte[20];	
			fis.read(res);
			System.out.println(new String(res));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}


}

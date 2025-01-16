package pack8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstreamdemo1 
{
	
	public static void main(String[] args) 
	{
		//File f = new File("src\\pack8\\file2.txt");
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("src\\pack8\\file2.txt");
			String str ="Java is good language";
			byte [] res = new byte[20];	
			fos.write(str.getBytes());
			fos.close();
			System.out.println(new String(str));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}


}

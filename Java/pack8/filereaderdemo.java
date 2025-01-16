package pack8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereaderdemo 
{
	
	public static void main(String[] args) throws IOException 
	{
		
		FileReader fr =null;
		try 
		{
			 fr = new FileReader("src\\pack8\\file2.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i+" ");
			}
	
			
			
			//System.out.println(new String(str));
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fr.close();
		}
		
	}


}

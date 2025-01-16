package pack8;

import java.io.File;
import java.io.IOException;

public class readfiledemo 
{
	static File f;
	public static void main(String[] args) throws IOException 
	{
		f = new File("src\\pack8\\file2.txt");
		byte [] str = new byte[20];	
		System.out.print("Enter the input : ");
		System.in.read(str);
		for(int i=0;i<20;i++)
		{
			System.out.println((char)str[i]);
		}
	}


}

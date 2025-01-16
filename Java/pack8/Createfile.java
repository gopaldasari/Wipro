package pack8;

import java.io.File;
import java.io.IOException;

public class Createfile 
{
	
	public static void main(String[] args) 
	{
		File f = new File("src\\pack8\\file3.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("file created");
			}
			else
			{
				System.out.println("file alresy exists");
			}
			} 
		catch (IOException e) 
		{
	
			e.printStackTrace();
		}
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.delete());
		System.out.println(f.exists());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.length());
	}


}

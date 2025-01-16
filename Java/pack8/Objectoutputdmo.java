package pack8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objectoutputdmo 
{
	
	public static void main(String[] args) 
	{
		int data1 =10;
		String data2 = "Java program";
		
		File f = new File("src\\pack8\\file.txt");
		try 
		{
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream objoutstrem = new ObjectOutputStream(fos);
			objoutstrem.writeInt(data1);
			objoutstrem.writeObject(data2);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream objinstrem = new ObjectInputStream(fis);
			
			System.out.println("Integer :"+objinstrem.readInt());
			try {
				System.out.println("String :"+objinstrem.readObject());
			} 
			catch (ClassNotFoundException e) 
			{
	
				e.printStackTrace();
			}
	
			fos.close();
			fis.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}


}

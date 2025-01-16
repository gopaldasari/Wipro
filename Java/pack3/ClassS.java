package pack3;

import java.util.Scanner;

public class ClassS 
{
	Scanner sc = new Scanner(System.in);
	void meth1()
	{
		
		System.out.print("Enter code :");
		int code =sc.nextInt();
		if(code == 1)
		{
			System.out.println("Welcome to java");
		}
		else
		{
			System.out.println("wrong code for java");
		}
	}
	public static void main(String[] args) 
	{
		ClassS s = new ClassS();
		s.meth1();

	}

}

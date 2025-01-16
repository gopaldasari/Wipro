package pack3;

import java.util.Scanner;

public class positiveornegative 
{
	int num;
	Scanner sc =new Scanner(System.in);
	
	void meth1()
	{
		System.out.print("Enter the number : ");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("Entered number is zero");
		}
		else if(num>0)
		{
			System.out.println("Entered number is positive");
		}
		else if(num<0)
		{
			System.out.println("Entered number is negative");
		}
		
	}
	void meth2()
	{
		
	}
	
	public static void main(String[] args) 
	{
		positiveornegative eo = new positiveornegative();
		eo.meth1();
	}

}

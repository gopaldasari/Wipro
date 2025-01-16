package pack3;

import java.util.Scanner;

public class primeornot 
{
	int num;
	int temp=0;
	
	Scanner sc = new Scanner(System.in);
	
	void meth1()
	{
		int i;
		System.out.print("Enter a number : ");
		num=sc.nextInt();
		if(num==1 || num ==0)
		{
			System.out.println("It is not a prime");
			temp=1;
		}
		else if(num>2)
		{
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
				System.out.println("It is not a prime");
				temp=1;
				break;
				}	
			}		
		}	
	}
	void meth2()
	{
		if(temp==0)
		{
			System.out.println("It is a prime");
		}
	}
	
	
	public static void main(String[] args) 
	{  
		primeornot	po = new primeornot();
		po.meth1();
		po.meth2();
	}  

}

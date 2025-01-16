package pack5;

import java.util.Scanner;

public class factorial_demo 
{
	Scanner sc = new Scanner(System.in);
	public void fac()
	{
		System.out.println("enter the number :");
		int num =sc.nextInt();
		int res=1;
		for(int i=num;i>=1;i--)
		{
			
			res=res*i;
			
		}
		System.out.println(res);
		
	}
	public static void main(String[] args) 
	{
		factorial_demo f = new factorial_demo();
		f.fac();
		

	}

}

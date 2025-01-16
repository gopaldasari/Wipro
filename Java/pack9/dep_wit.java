package pack9;

import java.util.Scanner;

public class dep_wit 
{
	static int amount=1000000;
	Scanner sc = new Scanner(System.in);
	
	public void deposit()
	{
		System.out.print("Enter the amount deposit: ");
		int dep  =sc.nextInt();
		System.out.println();
		System.out.println(Thread.currentThread().getName()+" deposited :"+dep);
		amount +=dep;
		System.out.println("Balance :"+amount);
	}
	public void withdraw()
	{
		System.out.print("Enter the amount withdraw : ");
		int with  =sc.nextInt();
		System.out.println();
		System.out.println(Thread.currentThread().getName()+" withdrawed :"+with);
		amount-=with;
		System.out.println("Balance :"+amount);
	}
	
}

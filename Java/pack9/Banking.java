package pack9;

import java.util.Scanner;

public class Banking 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		Coustomer_1  T1 = new Coustomer_1();
		Coustomer_2  T2 = new Coustomer_2();
		Thread t1 = new Thread(T1);
		Thread t2 = new Thread(T2);
		t1.start();
		//t2.start();
	
		t1.setName("COUSTOMER 1 ");
		t2.setName("COUSTOMER 2 ");
		

	}

}
class Coustomer_1 implements Runnable 
{
	
	public void run()
	{
		dep_wit d = new dep_wit();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("|------------------------------|");
		System.out.println("|----Available Categories------|");
		System.out.println("|----1 Deposit-----------------|");
		System.out.println("|----2 Withdraw----------------|");
		System.out.println("|----3 Exit--------------------|");
		System.out.println("|------------------------------|");
		System.out.print("Select the category : ");
		switch(sc.nextInt())
		{
		case 1:
			d.deposit();
			run();
			break;
		case 2:
			d.withdraw();
			run();
			break;
		case 3:
			System.out.println("Transation Completed");
			break;		
		default:
			System.out.println("Please select the valid opition from the above list");
			run();
		}
			
	}
	
}
class Coustomer_2 implements Runnable
{
	
	public void run()
	{
		dep_wit d = new dep_wit();
		Scanner sc = new Scanner(System.in);
		System.out.println("|------------------------------|");
		System.out.println("|----Available Categories------|");
		System.out.println("|----1 Deposit-----------------|");
		System.out.println("|----2 Withdraw----------------|");
		System.out.println("|------------------------------|");
		System.out.print("Select the category : ");
		switch(sc.nextInt())
		{
		case 1:
			d.deposit();
			run();
			break;
		case 2:
			d.withdraw();
			run();
			break;
		case 3:
			System.out.println("Transation Completed");
			break;		
		default:
			System.out.println("Please select the valid opition from the above list");
			run();
		}
			
	}
	}
	

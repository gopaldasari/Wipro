package pack3;

import java.util.Scanner;

public class Eligibility 
{
	int age;
	Scanner sc =new Scanner(System.in);
	
	void meth1()
	{
		System.out.print("Enter the age : ");
		age=sc.nextInt();
		if(age>=18 && age<120)
		{
			System.out.println("Eligible for voting");
		}
		else if(age<18 && age>=0)
		{
			System.out.println("Not eligible for voting");
		}
		else 
		{
			System.out.println("Entered age is outbound to our regulations");
		}
		meth1();
	}
	
	public static void main(String[] args) 
	{
		Eligibility eo = new Eligibility();
		eo.meth1();
	}

}

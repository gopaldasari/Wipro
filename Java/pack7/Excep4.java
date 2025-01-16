package pack7;

import pack3.primeornot;

public class Excep4 
{
	
	void code2()
	{
		System.out.println("code 2 start");
		try
		{
		int n1=8;
		int n2=10;
		System.out.println("Div :"+(n1/n2));
			try 
			{
				System.out.println("inner try-catch");
				String s = null;
				System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Check code2 method for arthemetic exception");
		}
		System.out.println("code 2 end");
	}
	
	
	public static void main(String[] args) 
	{
		
		Excep4 obj = new Excep4();
		obj.code2();
		System.out.println("Class ended");

	}

}




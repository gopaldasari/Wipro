package pack7;

public class Excep2 
{
	void code1()
	{
		System.out.println("code 1 start");
		int n1=8;
		int n2=3;
		System.out.println("Add :"+(n1+n2));
		System.out.println("code 1 end");
	}
	void code2()
	{
		System.out.println("code 2 start");
		try
		{
		int n1=8;
		int n2=0;
		System.out.println("Div :"+(n1/n2));
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Check code2 method for arthemetic exception");
		}
		System.out.println("code 2 end");
	}
	void code3()
	{
		System.out.println("code 3 start");
		String s = null;
		try {
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("code 3 end");
	}
	void code4()
	{
		System.out.println("code 4 start");
		int c [] = {1,2};
		try 
		{
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("code 4 end");
	}
	
	public static void main(String[] args) 
	{
		
		Excep2 obj = new Excep2();
		obj.code1();
		System.out.println("----------------------");
		obj.code2();
		System.out.println("----------------------");
		obj.code3();
		System.out.println("----------------------");
		obj.code4();
		System.out.println("Class ended");

	}

}

//code2 exception
//Exception in thread "main" java.lang.ArithmeticException: / by zero

//code3 exception
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null

//code4 exception
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
package pack7;

public class Excep 
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
		int n1=8;
		int n2=0;
		System.out.println("Div :"+(n1/n2));
		System.out.println("code 2 end");
	}
	void code3()
	{
		System.out.println("code 3 start");
		String s = null;
		
		System.out.println(s.length());
		System.out.println("code 3 end");
	}
	void code4()
	{
		System.out.println("code 4 start");
		char c [] = {1,2};
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		System.out.println("code 4 end");
	}
	
	public static void main(String[] args) 
	{
		
		Excep obj = new Excep();
		obj.code1();
//		System.out.println("----------------------");
//		obj.code2();
//		System.out.println("----------------------");
//		obj.code3();
//		System.out.println("----------------------");
//		obj.code4();
		System.out.println("Class ended");

	}

}

//code2 exception
//Exception in thread "main" java.lang.ArithmeticException: / by zero

//code3 exception
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null

//code4 exception
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
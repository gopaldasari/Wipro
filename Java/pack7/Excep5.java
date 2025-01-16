package pack7;

public class Excep5 
{
	
	void code2()
	{
		System.out.println("code 2 start");
		try
		{
		int n1=8;
		int n2=0;
		System.out.println("Div :"+(n1/n2));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Check code2 method for arthemetic exception");
		}
		finally 
		{
			System.out.println("Finally Executed");
		}
		System.out.println("code 2 end");
	}
	
	
	public static void main(String[] args) 
	{
		
		Excep5 obj = new Excep5();
		obj.code2();
		System.out.println("Class ended");

	}

}




package pack7;

public class Throws1 
{

	void code2() throws ArithmeticException
	{
		System.out.println("code 2 start");
		
		int n1=8;
		int n2=0;
		System.out.println("Div :"+(n1/n2));
		
		System.out.println("code 2 end");
	}
	
	
	public static void main(String[] args) 
	{
		
		Throws1 t1 = new Throws1();
		try
		{
		t1.code2();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Class ended");

	}


}

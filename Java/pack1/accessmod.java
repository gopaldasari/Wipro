package pack1;

public class accessmod 
{

	void add()
	{

		System.out.println("Added two numbers");
	}
	public void sub()
	{

		System.out.println("Subtracted two numbers ");
	}
	private void mul()
	{

		System.out.println("Multiplied two numbers ");
	}
	protected void div()
	{

		System.out.println("Divided two numbers ");
	}

	public static void main(String[] args) 
	{
		accessmod ac = new accessmod();
		ac.add();
		ac.sub();
		ac.mul();
		ac.div();

	}

}



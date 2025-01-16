package pack3;

public class Usingcons 
{
	int code;
	public Usingcons(int code) 
	{
		this.code = code;
	}

	void meth1()
	{
		if(code == 1)
		{
			System.out.println("Welcome to java");
		}
		if(code == 2)
		{
			System.out.println("Welcome to python");
		}
		if(code == 3)
		{
			System.out.println("Welcome to Sql");
		}
	}
	public static void main(String[] args) 
	{
		Usingcons u = new Usingcons(1);
		u.meth1();
		Usingcons u1 = new Usingcons(2);
		u1.meth1();
		Usingcons u2 = new Usingcons(3);
		u2.meth1();

	}
}

package pack3;

public class Usingcons_else 
{
	int code;
	public Usingcons_else(int code) 
	{
		this.code = code;
	}

	void meth1()
	{
		if(code == 1)
		{
			System.out.println("Welcome to java");
		}
		else
		{
			System.out.println("course not found");
		}
		
	}
	public static void main(String[] args) 
	{
		Usingcons_else u = new Usingcons_else(1);
		u.meth1();
		Usingcons_else u1 = new Usingcons_else(2);
		u1.meth1();
		Usingcons_else u2 = new Usingcons_else(3);
		u2.meth1();

	}
}

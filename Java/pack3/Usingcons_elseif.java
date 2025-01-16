package pack3;

public class Usingcons_elseif 
{
	int code;
	public Usingcons_elseif(int code) 
	{
		this.code = code;
	}

	void meth1()
	{
		if(code == 1)
		{
			System.out.println("Welcome to java");
		}
		else if(code == 2)
		{
			System.out.println("Welcome to python");
		}
		else if(code == 3)
		{
			System.out.println("Welcome to Sql");
		}
		else
		{
			System.out.println("course not found");
		}
	}
	public static void main(String[] args) 
	{
		Usingcons_elseif u = new Usingcons_elseif(1);
		u.meth1();
		Usingcons_elseif u1 = new Usingcons_elseif(2);
		u1.meth1();
		Usingcons_elseif u2 = new Usingcons_elseif(3);
		u2.meth1();
		Usingcons_elseif u3 = new Usingcons_elseif(4);
		u3.meth1();

	}
}

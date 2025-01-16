package pack3;

public class Usingcons_nestedif 
{
	int code;
	String sid;
	String pwd;
	
	public Usingcons_nestedif(int code,String sid,String pwd) 
	{
		this.code = code;
		this.sid = sid;
		this.pwd=pwd;
		
	}

	void meth1()
	{
		if(code == 1)
		{
			System.out.println("Welcome to java course = "+sid);
			if(sid =="S100" || sid =="S101")
			{
				System.out.println("You have access to contents");
				if(pwd =="a100")
				{
					System.out.println("Password is correct");				
				}
				else
				{
					System.out.println("Password is incorrect");
				}
			}
			else
			{
				System.out.println("You have no access to contents");
			}
		}
		else
		{
			System.out.println("course not found");
		}
		
	}
	public static void main(String[] args) 
	{
		Usingcons_nestedif u = new Usingcons_nestedif(1,"S100","a100");
		u.meth1();
		Usingcons_nestedif u1 = new Usingcons_nestedif(1,"S101","a101");
		u1.meth1();
		Usingcons_nestedif u2= new Usingcons_nestedif(2,"S103","a102");
		u2.meth1();
		
	}
}

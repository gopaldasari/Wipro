package pack7;

public class Bank 
{
	int age ;
	String name;
	public Bank(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void account() throws Invalidage 
	{
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else 
		{
//			System.out.println("Not Eligible");
//			Invalidage obj = new   Invalidage("Age is not suffient to create acc");
//			throw obj;
			throw new Invalidage("Age is not suffient to create acc");
			
		}
	}
	public static void main(String[] args) 
	{
		Bank b = new Bank(22,"Gopal");
		try 
		{
			b.account();
		} 
		catch (Invalidage e) 
		{
			e.printStackTrace();
		}
		Bank b1 = new Bank(8,"Allen");
		try 
		{
			b1.account();
		} 
		catch (Invalidage e) 
		{
			e.printStackTrace();
		}

	}
}
//------------------------------------------
class Invalidage extends Exception
{
	String msg ;
	public Invalidage(String msg)
	{
		this.msg=msg;
	}
	public String toString() 
	{
		return this.getClass()+" "+msg;
		
	}
}
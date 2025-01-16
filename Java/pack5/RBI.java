package pack5;

public abstract class RBI 
{
	public void acc()
	{
		System.out.println("acc");
	}
	public void loan()
	{
		System.out.println("loan");
	}
	public abstract void intrest();

}
class hdfc extends RBI
{
	public void acc1()
	{
		System.out.println("acc --child");
	}
	public void intrest()
	{
		System.out.println("intrest");
	}
	public static void main(String[] args) 
	{
		hdfc  s1 = new hdfc();
		s1.intrest();
		s1.acc();
		s1.loan();
		s1.acc1();
	}
}

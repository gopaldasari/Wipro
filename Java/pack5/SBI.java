package pack5;

public class SBI extends RBI
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
		SBI  s = new SBI();
		s.intrest();
		s.acc();
		s.loan();
		s.acc1();
	}
}
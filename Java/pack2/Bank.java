package pack2;

public class Bank 
{
	String cname;
	String acc;
	boolean acstatus;
	int month;

	Bank()
	{
		System.out.println("default constructor");
		cname ="default name";
		acc ="default accno";
	}
	Bank(String cname,String acc)
	{
		System.out.println("parameterized constructor");
		this.cname=cname;
		this.acc=acc;
		acstatus =true;

	}
	Bank(String name,String accno,int mon)
	{
		System.out.println("parameterized constructor");
		cname=name;
		acc=accno;
		month=mon;
		acstatus =true;

	}
	public void report()
	{
		System.out.println("cname "+ cname);
		System.out.println("acc "+ acc);
		System.out.println("acstatus "+ acstatus);

	}
	public void statement()
	{
		System.out.println("cname "+ cname);
		System.out.println("acc "+ acc);
		System.out.println("acstatus "+ acstatus);
		System.out.println("month="+month);
	}

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.report();
		Bank b1 = new Bank("ravi","468465d");
		b1.report();
		Bank b2 = new Bank("Mani","468465d",5);
		b2.statement();





	}

}

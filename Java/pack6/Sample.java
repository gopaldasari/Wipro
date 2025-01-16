package pack6;

public class Sample 
{
	public int meth1(int x) // variable
	{
		int y =++x;
		return y;
	}
	public int meth2(demo i) //class name and reference
	{
		int y =++i.x;
		return y;
	}
	

	public static void main(String[] args) 
	{
		Sample s = new Sample();
		int x = 100;
		System.out.println("Before :"+x);
		System.out.println(s.meth1(x));
		System.out.println("After: "+x);
		
		System.out.println("----------------------------------------");
		
		demo d = new demo();
		System.out.println("Before :"+d.x);
		System.out.println(s.meth2(d));
		System.out.println("After: "+d.x);

	}
}
class demo
{
	int x=200;
}

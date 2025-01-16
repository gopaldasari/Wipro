package pack4;

public class looping 
{
	
	void dowhile(int a) 
	{
		do
		{
			System.out.println(a);
			a++;
		}
		while(a<=5);
			System.out.println(a);
	}
	void whilee (int a) 
	{
		while(a<=5)
		{
			System.out.println(a);
			a++;
		}
	}
	void forr(int a)
	{
		for(int i=a;i<=5;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		looping dw = new looping();
		dw.dowhile(1);
		System.out.println("dowhile done");
		dw.whilee(1);
		System.out.println("while done");
		dw.forr(4);
		System.out.println("for loop done");
	}

}

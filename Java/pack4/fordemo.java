package pack4;

public class fordemo 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println("---------------------");
		for(int i=1;i<=5;++i)
		{
			System.out.println(i);
		}
		System.out.println("---------------------");
		for(int i=5;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("---------------------");
//		for(int i=5;i>=1;) //infinite loop
//		{
//			System.out.println(i);
//		}
//		for(int i=5;;i--) //infinite loop
//		{
//			System.out.println(i);
//		}
		

	}

}

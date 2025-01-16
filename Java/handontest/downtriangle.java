package handontest;

public class downtriangle 
{
	int rows=7;
	public void meth1()
	{
		for(int i=rows-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		downtriangle d1 = new downtriangle();
		d1.meth1();

	}

}

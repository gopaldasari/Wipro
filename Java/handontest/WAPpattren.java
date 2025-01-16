package handontest;

public class WAPpattren 
{
	int row =6 ;
	public void pyramid()
	{
		for(int i =0;i<row;i++)
		{
			for(int j=row-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) 
	{
		WAPpattren wa = new WAPpattren();
		wa.pyramid();

	}

}

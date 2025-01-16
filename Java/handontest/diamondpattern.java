package handontest;

import java.util.Scanner;

public class diamondpattern 
{
	
 
	public void diamondup()
	{
		int i,j,row;
		int space =1;
		System.out.print("enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		row=sc.nextInt();
		space =row-1;
	
		for(j =1;j<=row;j++)
		{
			for(i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			space--;
			for( i=1;i<=2*j-1;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		for(j=1;j<=row-1;j++)
		{
			for(i=1; i<=space;i++)
			{
				System.out.print(" ");
			}
			space++;
			for(i=1;i<=2*(row-j)-1;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		

	public static void main(String[] args) 
	{
		diamondpattern d = new diamondpattern();
		d.diamondup();
	}

}

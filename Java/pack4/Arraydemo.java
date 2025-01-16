package pack4;

import java.util.Scanner;

public class Arraydemo 
{
	Scanner sc =new Scanner(System.in);
	void meth1()
	{
		System.out.print("Enter the array length : ");
		int [] num = new int [sc.nextInt()];//5
		System.out.println("Enter "+num.length+" numbers :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.print("{");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.print("}");
	}

	public static void main(String[] args) 
	{
		Arraydemo ar = new Arraydemo();
		ar.meth1();

	}

}

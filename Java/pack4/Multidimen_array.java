package pack4;

//import java.util.Arrays;

public class Multidimen_array 
{
	int [][] arr1 = {{1,2,3},{4,5,6,},{7,8,9},{10,11,12}};
	
	void meth1()
	{
		for(int r=0;r<=3;r++)//rows
		{
			for(int c=0;c<=2;c++)//column
			{
				System.out.print(arr1[r][c]+" ");
			}
			System.out.println();
		}
	}
	void meth2()
	{
		int [] res = {6,8,3,2};
		//Arrays.sort(res);
		for(int i=0;i<res.length;i++)
		{
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i]>res[j])
				{
					int a =res[i];
					res[i]=res[j];
					res[j]=a;
				}
			}
			
		}
		for(int a =0;a<res.length;a++)
		{
			System.out.print(res[a]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Multidimen_array ma = new Multidimen_array();
		System.out.println("multi dimensioanal array");
		ma.meth1();
		System.out.println("-------sorting---------");
		ma.meth2();
	}

}

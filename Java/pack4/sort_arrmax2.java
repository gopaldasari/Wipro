package pack4;

public class sort_arrmax2 
{
	void sortmax()
	{
		int [] arr = {2,9,8,7,3,6,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int z=arr[i];
					arr[i]=arr[j];
					arr[j]=z;
				}
			}
			
		}
			System.out.print(arr[arr.length-2]);
	}
	
	
	public static void main(String[] args) 
	{
		sort_arrmax2 sa = new sort_arrmax2();
		sa.sortmax();
		//sa.meth2();

	}

}

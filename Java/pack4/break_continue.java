package pack4;

public class break_continue 
{
	public void breakdemo()

	{
		int [] ars = {1,2,3,4,5,6,7,8};
		for(int i=0;i<ars.length;i++)
		{
			if(ars[i]%2==0)
			{  
				System.out.println("even : "+ars[i]);
				break;
			}
			else 
			System.out.println("odd  : "+ars[i]);
			
		}
	}
	
	public void continuedemo()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5||i==6||i==7)
				continue;
			System.out.println(i);
		}
		System.out.println("loop completed");
	}
	public static void main(String[] args) 
	{
		break_continue bc = new break_continue();
		bc.breakdemo();
		bc.continuedemo();

	}

}

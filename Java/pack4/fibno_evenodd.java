package pack4;

public class fibno_evenodd 
{
	
	public void fibnoc()
	{

    	int a = 0;
    	int b = 1;
    	int c;
    	
    	for(int i = 0; i < 7; i++ ) 
    	{
    		System.out.println(a);
    		c = a + b;
    		a = b;
    		b = c;
 
    	}
 
    }
	public void evenodd()

	{
		int [] ars = {1,2,3,4,5,6,7,8};
		for(int i=0;i<ars.length;i++)
		{
			if(ars[i]%2==0)
			{  
				//break;
				System.out.println("even : "+ars[i]);
			}
			else 
			System.out.println("odd  : "+ars[i]);
			
		}
	}
	public static void main(String[] args) 
	{
		fibno_evenodd f = new fibno_evenodd();
		//f.fibnoc();
		f.evenodd();
	}

}

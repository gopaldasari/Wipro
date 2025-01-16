package pack4;

public class pattern 
{
	public void rightangle_patterndown()
	{
		int num=4;
		for(int r=1;r<=num;r++)
		{
			for(int c=0;c<=num-r;c++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}
	public void rightangle_pattern()
	{
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}
	public void triangle()
	{

//	*
//	**
//	***
//	****
//	***
//	**
//	*

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		int num=3;
		for(int r=1;r<=num;r++)
		{
			for(int c=0;c<=num-r;c++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}
	public void trianglestright()
	{
		int rows = 4;
		  
        
        for (int r = 1; r <= rows; r++) 
        { 
  
            for (int c = rows; c >= r; c--) 
            { 
                System.out.print(" "); 
            } 
            for (int c = 1; c <= r; c++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
	}
	public static void main(String[] args) 
	{
		pattern p = new pattern();
//		p.rightangle_patterndown();
//		System.out.println("---------------");
//		p.rightangle_pattern();
//		System.out.println("---------------");
//		p.triangle();
		p.trianglestright();
		
		
	}

}

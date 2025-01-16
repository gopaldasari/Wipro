package pack4;

public class goto_demo 
{

	public void continue_goto()
	{
		outer:
	        for (int i = 0; i < 10; i++) 
	        {
	            for (int j = 0; j < 10; j++) 
	            {
	                if (j == 1)
	                    continue outer;
	                System.out.println(" value of j = " + j);
	            }
	        }
	}
	public void break_goto()
	{
		 boolean t = true;
		    first : 
		    {
			    second : 
			    {
				    third : 
				    {
				        System.out.println("Before the break");
				        if (t) // break out of second block
				            break second;
				    }
			        System.out.println("This won't execute");
			    }
		        System.out.println("This is after the second block");
		    }
	}
	public static void main(String[] args) 
	{
	goto_demo g = new goto_demo();
	g.continue_goto();
	g.break_goto();

	}

}

package pack4;

public class forloop_differentcases 
{
	int [] ages = {5,7,8,};
	String [] names = {"Gopal","Kiran","Sairam"};
	void meth1() // regular pattern
	{
		System.out.println("extrated number from array : "+ages[0]);
		System.out.println("extrated number from array : "+ages[1]);
		System.out.println("extrated number from array : "+ages[2]);
	}
	void meth2() // Using for each loop
	{
		for (int i : ages) 
		{
			System.out.println("extrated number from array : "+i);
		}
	}
	void meth3() // Using for loop
	{
		for(int i = 0;i<ages.length;i++)
		{
			System.out.println("extrated number from array : "+ages[i]);
		}
	}
	void meth4() // Using for each loop --string
	{
		for (String e : names) 
		{
			System.out.println("extrated string from array : "+e);
		}
	}
	void meth5() // Using for loop --string
	{
		for(int i = 0;i<names.length;i++)
		{
			System.out.println("extrated string from array : "+names[i]);
		}
	}
		
	
	public static void main(String[] args) 
	{
		forloop_differentcases ar = new forloop_differentcases();
		ar.meth1();
		System.out.println("using regular pattern");
		ar.meth2();
		System.out.println("using for each loop");
		ar.meth3();
		System.out.println("using for loop");
		ar.meth4();
		System.out.println("using for each loop  ---string");
		ar.meth4();
		System.out.println("using for loop  ---string");

	}

}

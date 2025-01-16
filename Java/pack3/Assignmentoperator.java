package pack3;

public class Assignmentoperator 
{
	
	
	void modulus()
	{
		int x=6;
		x%=5;
		System.out.println("modulus = "+x);
	}
	void dividing()
	{
		int x=6;
		x/=5;
		System.out.println("dividing = "+x);
	}
	void multiply()
	{
		int x=5;
		boolean s =!(x>3 && x<7);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Assignmentoperator as = new Assignmentoperator();
		as.modulus();
		as.dividing();
		as.multiply();
		
	}

}

package FinalAssesment;

public class Swap_Strings 
{
	public void swap_method(String s1,String s2)
	{
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println("After swapping, s1 = "+s1+" s2= "+s2);
	}
	public static void main(String[] args) 
	{
		String s1 = "Java";
		String s2 ="code";
		System.out.println("Before swapping, s1 = "+s1+" s2= "+s2);
		Swap_Strings s = new Swap_Strings();
		s.swap_method(s1, s2);
		

	}

}

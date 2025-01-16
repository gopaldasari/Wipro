package FinalAssesment;

public class Check_ofsubstring 
{
	void check_Substring(String s1,String s2)
	{

		System.out.println(s1.contains(s2));
		if(s1.contains(s2))
		{
			System.out.println("s1 is substring of s2");
		}
		else
		{
			System.out.println("s3 is not substring of s4");
		}
		
		
	}
	public static void main(String[] args) 
	{
		String s1 ="Write A Java Program";
		String s2="gram";
		String s3 ="Write A Program";
		String s4="Java";
		Check_ofsubstring c = new Check_ofsubstring();
		c.check_Substring(s1, s2);
		c.check_Substring(s3, s4);
		
		
	}

}

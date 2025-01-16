package FinalAssesment;

public class Palindrome 
{
	public static boolean check_palindrone(String str)
	{
		str =str.toLowerCase();
		String reversed ="";
		for(int i=str.length()-1;i>=-0;i--)
		{
			reversed =reversed+str.charAt(i);
		}
		return str.equals(reversed);
	}
	public static void main(String[] args)
	{
		String str ="Java";
		Palindrome p = new Palindrome();
		Palindrome.check_palindrone(str);
		boolean reversed =check_palindrone(str);
		if(reversed)
		{
			System.out.println(str+" = Palindrome");
		}
		else
		{
			System.out.println(str+" = Not a Palindrome");
		}

	}

}

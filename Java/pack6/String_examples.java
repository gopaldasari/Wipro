package pack6;

public class String_examples 
{

	void Stringcount()
	{
		String c = "My java program";
		System.out.println(c.split(" ").length);
	}
	void evod()
	{
		String c2="java me";
		int b = c2.length();
		String A ="";
		String B ="";
		for(int i =0;i<b;i++)
		{
			if(i%2==0)
			{
				A+=c2.charAt(i);
			}
			else
			{
				B+=c2.charAt(i);
			}
		}
		System.out.println(A);
		System.out.println(B);
	}
	void evenodd()
	{
		String c1="java me";
		char cr []= c1.toCharArray();
		char [] creven= new char[10];
		char [] crodd= new char[10];
		int even =0;
		int odd =0;
		for(int i=0;i<cr.length;i++)
		{
			if(i%2==0)
			{
				creven[even] = cr[i];
				even++;
			}
			if(i%2==1)
			{
				crodd[odd] = cr[i];
				odd++;
			}
		}
		System.out.println(creven);
		System.out.println(crodd);
		
	}
	void lastchar()
	{
		String c = "My java program";
		String str [] = c.split(" ");// split into str[0]=My str[1]=java  str[2]=program
		String A ="";
		
		for(int i =0;i<str.length;i++)
		{
			A+=str[i];  //A="My";
			System.out.println(A.charAt(A.length()-1));//printing last word 'y'
		}
	}
	void count_each()
	{
		String c = "My java program";
		String str [] = c.split(" ");
		String A ="";
		for(int i =0;i<str.length;i++)
		{
			A+=str[i];
		}
		System.out.println(A.length());
		
		
	}
	void sum_allnum()
	{
		String c="1234";
		char []str =c.toCharArray();
		int sum =0;
		//System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
			if(str[i]%2==0||str[i]%2==1)
			{
				System.out.println((int)str[i]);
				System.out.println(sum);
				sum+=str[i];
				System.out.println(str[i]);
				System.out.println(sum);
			}
			
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		String_examples se = new String_examples();
		se.Stringcount();
//		System.out.println("---------------------------------------");
//		se.evenodd();
//		System.out.println("---------------------------------------");
//		se.lastchar();
//		System.out.println("---------------------------------------");
//		se.evod(); //simple version
//		System.out.println("---------------------------------------");
//		se.count_each();
//		System.out.println("---------------------------------------");
//		se.sum_allnum();

	}

}

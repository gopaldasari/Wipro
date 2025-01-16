package pack6;

public class String_demo 
{
	void code1()
	{
		String s = "Gopal";
		System.out.println("finding the char at index given ="+s.charAt(2));
//		char c ='H';
//		int c1 = c;
//		System.out.println(c1);
//		
		String s1 ="gopal";
		System.out.println("value of char ="+s.codePointAt(4));
		System.out.println("comparing 2 strings ="+s.compareTo(s1));
		System.out.println("comparing 2 strings without case ="+s.compareToIgnoreCase(s1));
		System.out.println("concating 2 strings ="+s.concat(" Dasari"));
		System.out.println("checking wheather the given word is in string ="+s.contains("op"));
		System.out.println("equals ="+s.equals(s1));
		System.out.println("equals with case ="+s.equalsIgnoreCase(s1));
		System.out.println("hascode of s ="+s.hashCode());
		
		
	}
	void code2()
	{
		String s = "Gopal";
		String z ="gopalgopal";
		String a = "sai";
		String b = "sai";// both a and b have same hashcode
		System.out.println("hascode of a ="+a.hashCode());
		System.out.println("hascode of b ="+b.hashCode());
		
		System.out.println("index of given char only from start ="+s.indexOf('l'));
		System.out.println("index of char in middle ="+z.indexOf("op",3));
		System.out.println(s.isEmpty());
		System.out.println(String.join(" ","Gopal", "is","good"));
		System.out.println(z.lastIndexOf('a'));
	}
	void code3()
	{
		String st = "ravi";
		System.out.println(st.length());
		System.out.println("Ravi".matches("Ravi"));
		System.out.println(st.replace('r', 'R'));
//		System.out.println(st.replaceAll("r", "R"));
//		System.out.println(st.replaceFirst("r", "R"));
//		
		
	}
	void code4()
	{
		String st = "ravi is good man";
		String [] info =st.split(" ");
		System.out.println(info[1]);
//		String [] info1 =st.split(" ",1);
//		System.out.println(info1[0]);
		System.out.println(st.substring(5));
		System.out.println(st.substring(5,10));
		String y ="pa1an";
		char [] c =y.toCharArray();
		
		System.out.println(c[2]);
		
		
		
		
		
	
		
	}
	public static void main(String[] args) 
	{
		String_demo sd = new String_demo();
		sd.code1();
		System.out.println("-------------------------------------");
		sd.code2();
		System.out.println("-------------------------------------");
		sd.code3();
		System.out.println("-------------------------------------");
		sd.code4();
	}

}

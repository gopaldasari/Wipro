package pack7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistdemo 
{
public static void main(String[] args) 
{
	List obj = new ArrayList();
	System.out.println(obj);
	obj.add(12);
	obj.add("Gopal");
	obj.add(null);
	obj.add(true);
	obj.add(12);
	obj.add('A');
	System.out.println(obj);
	System.out.println(obj.contains(null));
	System.out.println("is empty: "+obj.isEmpty());
	System.out.println("count : "+obj.size());
	obj.remove(true);
	System.out.println(obj);
	obj.add(2, 'M');
	System.out.println(obj);
	System.out.println(obj);
	System.out.println(obj.get(3));
	
	
	
	Iterator i = obj.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	for(Object e : obj)
	{
		System.out.println(e);
	}
	for(int x=0;x<obj.size();x++)
	{
		System.out.println(obj.get(x));
	}
	System.out.println("-------------------------");
	for(int x=obj.size()-1;x>=0;x--)
	{
		System.out.println(obj.get(x));
	}
}
}

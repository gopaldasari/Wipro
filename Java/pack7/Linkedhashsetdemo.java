package pack7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Linkedhashsetdemo 
{
public static void main(String[] args) 
{
	Set obj = new LinkedHashSet();
	System.out.println(obj);
	obj.add(12);
	obj.add("Gopal");
	obj.add(null);
	obj.add(true);
	obj.add("Gopal");
	obj.remove(null);
	obj.add('B');
	obj.add('A');
	System.out.println("========================");
	System.out.println(obj.contains(null));
	System.out.println("is empty: "+obj.isEmpty());
	System.out.println("count : "+obj.size());
	obj.remove(true);
	System.out.println(obj);
	
	System.out.println(obj);
	System.out.println(obj);
	
	
	
	Iterator i = obj.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("-----------------------------");
	for(Object e : obj)
	{
		System.out.println(e);
	}
	
}
}

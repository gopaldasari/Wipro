package pack7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class vectordemo 
{
public static void main(String[] args) 
{
	Vector obj = new Vector();
	
//	obj.add(12);
//	obj.add(13);
//	obj.add(17);
//	obj.add(11);
	obj.add("s");
	obj.add("d");
	obj.add("t");
	obj.add("h");
	System.out.println(obj);
	System.out.println(obj.capacity());

	obj.ensureCapacity(20);
	System.out.println(obj.capacity());
	obj.setSize(25);
	System.out.println(obj.capacity());
	System.out.println("frist : "+obj.firstElement());
	System.out.println(obj.lastElement());
	System.out.println(obj);

	
	
	
	
	
	
	
	
	Iterator i = obj.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("========================");
	for(Object e : obj)
	{
		System.out.println(e);
	}
	
}
}

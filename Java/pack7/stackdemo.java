package pack7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class stackdemo 
{
public static void main(String[] args) 
{
	 Stack obj = new Stack();
	
//	obj.add(12);
//	obj.add(13);
//	obj.add(17);
//	obj.add(11);
	obj.add("s");
	obj.add("d");
	obj.add("t");
	obj.add("h");
	System.out.println(obj);
	System.out.println("peek : "+ obj.peek());
	System.out.println("pop : "+ obj.pop());
	obj.push("m");
	
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

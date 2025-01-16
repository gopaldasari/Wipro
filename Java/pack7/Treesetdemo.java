package pack7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treesetdemo 
{
public static void main(String[] args) 
{
	SortedSet obj = new TreeSet();
	System.out.println(obj);
//	obj.add(12);
//	obj.add(13);
//	obj.add(17);
//	obj.add(11);
	obj.add("s");
	obj.add("d");
	obj.add("t");
	obj.add("h");

	
	
	
	System.out.println("========================");
	
	
	
	
	Iterator i = obj.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	for(Object e : obj)
	{
		System.out.println(e);
	}
	
}
}

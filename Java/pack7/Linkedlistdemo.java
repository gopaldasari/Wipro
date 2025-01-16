package pack7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlistdemo 
{
public static void main(String[] args) 
{
	List obj = new LinkedList();
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
	
	
	
	ListIterator i = obj.listIterator();
	while(i.hasNext())	
	{
		System.out.println(i.next());
	}
	System.out.println("======================");
	while(i.hasPrevious())	
	{
		System.out.println(i.previous());
	}
}
}

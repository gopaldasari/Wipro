package pack7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class DEquedemo2 
{
public static void main(String[] args) 
{
	Deque obj = new ArrayDeque();
	
	
//	obj.add(12);
//	obj.add(13);
//	obj.add(17);
//	obj.add(11);
	obj.add("sss");
	obj.add("ddd");
	obj.add("ttt");
	obj.add("hhh");
	System.out.println(obj);
	System.out.println("peek : "+obj.peek());
	System.out.println(obj);
	System.out.println("poll : "+obj.poll());
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

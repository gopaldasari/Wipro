package pack7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistdemo2 
{
public static void main(String[] args) 
{
	//Generics ==== homogeneous data ex :<Interger>
	List<Integer> obj = new ArrayList();
	obj.add(12);
	obj.add(5);
	obj.add(17);
	obj.add(19);
	obj.add(11);
	int num=0;
	for(Object e : obj)
	{
		
		System.out.println(e.toString());
		num+=Integer.valueOf(e.toString());
	}
	System.out.println(num);
}
}

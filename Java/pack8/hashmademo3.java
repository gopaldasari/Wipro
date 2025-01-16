package pack8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmademo3 
{
	
	public static void main(String[] args) 
	{
		hashmademo3 h = new hashmademo3();
		Map<String, String> map = new HashMap();
		map.put("l", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		map.put("e", "ee");
		map.put("f", "aa");
		System.out.println(map);
		System.out.println("-------------comparing by key---------------------");
//	    map.entrySet() // Returns a Set view of the mappings contained in this map  
//        .stream() // Returns a sequential Stream with this collection as its source  
//        .sorted(Map.Entry.comparingByKey()) // Sorted according to the provided Comparator
	    map.entrySet().stream().sorted(Map.Entry.comparingByKey());  
	    for(Map.Entry x:map.entrySet())
	    {  
	         // Printing the key-value pairs  
	         System.out.println(x.getKey()+" "+x.getValue());  
	    }
         System.out.println("-------------Descending---------------------");
         map.entrySet() // Returns a Set view of the mappings contained in this map  
         .stream() // Returns a sequential Stream with this collection as its source  
         .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) // Sorted according to the provided Comparator  
         .forEach(System.out::println); // Performs an action for each element of this stream  
 }  
		

	}



package pack8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmademo 
{
	
	public static void main(String[] args) 
	{
		hashmademo h = new hashmademo();
		Map m = new HashMap();
		m.put(8, "aa");
		m.put(2, "bb");
		m.put(3, "cc");
		m.put(5, "dd");
		m.put(4, "ee");
		m.put(7, "aa");
		System.out.println(m);
		Set set = m.entrySet();
		Iterator itr =set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}

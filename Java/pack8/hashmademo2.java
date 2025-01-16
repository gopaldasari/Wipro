package pack8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmademo2 
{
	
	public static void main(String[] args) 
	{
		hashmademo2 h = new hashmademo2();
		Map<String, String> m = new HashMap();
		m.put("l", "aa");
		m.put("b", "bb");
		m.put("c", "cc");
		m.put("d", "dd");
		m.put("e", "ee");
		m.put("f", "aa");
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

package assignments_PradnyaNandrekar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment88_Map_iteration_Iterator {

	public static void main(String[] args) 
	{
		Map<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(123, "Pradnya");
		m1.put(130, "Rekha");
		m1.put(120, "Hema");
		m1.put(126, "Sushma");
		
		System.out.println(m1); //{130=Rekha, 120=Hema, 123=Pradnya, 126=Sushma}
		Set<Entry<Integer, String>> s1 = m1.entrySet();
		Iterator<Entry<Integer, String>> i_s1 = s1.iterator();
		while(i_s1.hasNext())
		{
			System.out.println(i_s1.next());
		}

	}

}

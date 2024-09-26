package assignments_PradnyaNandrekar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment47_Set_Iteration 
{
	/*
	 * Assignment 47 - Iterate Set Interface
	 */

	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		s1.add("Asha");
		s1.add(123);
		s1.add('c');
		s1.add(null);
		
		Iterator i_s1 = s1.iterator();
		while(i_s1.hasNext())
		{
			System.out.println(i_s1.next());
		}

	}

}

package assignments_PradnyaNandrekar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment46_List_Iteration 
{
	/*
	 * Assignment 46 - Iterate List Interface
	 */

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add(23);
		l1.add("Pradnya");
		l1.add(123.54);
		l1.add('C');
		l1.add(null);
		
		Iterator i_l1 = l1.iterator();
		while(i_l1.hasNext())
		{
			System.out.println(i_l1.next());
		}
		
		ListIterator i2_l1 = l1.listIterator();
		while(i2_l1.hasNext())
		{
			System.out.println(i2_l1.next());
		}
		while(i2_l1.hasPrevious())
		{
			System.out.println(i2_l1.previous());
		}

	}

}

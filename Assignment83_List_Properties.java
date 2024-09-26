package assignments_PradnyaNandrekar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment83_List_Properties {

	public static void main(String[] args) 
	{
		List<Integer>  aL=new ArrayList<Integer> ();
		aL.add(30);
		aL.add(26);
		aL.add(20);
		aL.add(30);
		aL.add(35);
		aL.add(32);
//		aL.add("Pradnya");
//		aL.add('c');
//		aL.add(null);
//		aL.add(null);
		
		System.out.println("Follows indexing, null, duplicates"+ aL);
//		Collections.sort(aL);
		System.out.println("After Sort"+aL);
		
		Iterator i1= aL.iterator();
		System.out.println("Forword Iteration using iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Forword Iteration using listIterator");
		ListIterator i2= aL.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Reversse Iteration using listIterator");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}

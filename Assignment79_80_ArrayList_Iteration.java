package assignments_PradnyaNandrekar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment79_80_ArrayList_Iteration 
{
	static void Assignment79()
	{
		ArrayList aL= new ArrayList();
		aL.add("Pradnya");
		aL.add('P');
		aL.add(342);
		aL.add(null);
		
		Iterator aL_I = aL.iterator();
		while(aL_I.hasNext())
		{
			System.out.println(aL_I.next());
		}
	
	}
	static void Assignment80()
	{
		ArrayList aL= new ArrayList();
		aL.add("Pradnya");
		aL.add('P');
		aL.add(342);
		aL.add(null);
		
		Iterator aL_I = aL.iterator();
		while(aL_I.hasNext())
		{
			System.out.println(aL_I.next());
		}
		ListIterator aL_li= aL.listIterator();
		while(aL_li.hasNext())
		{
			System.out.println(aL_li.next());
		}
		while(aL_li.hasPrevious())
		{
			System.out.println(aL_li.previous());
		}
		
	
	}

	public static void main(String[] args) 
	{
		Assignment79();
		Assignment80();

	}

}

package assignments_PradnyaNandrekar;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Assignment81_Enumeration 
{

	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		
		s1.add("Pradnya");
		s1.add('C');
		s1.add(3528);
		s1.add(null);
			
		Enumeration e1 = s1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		
		Vector s2 = new Vector();
		s2.add("Pradnya");
		s2.add('C');
		s2.add(3528);
		s2.add(null);
		
		Enumeration e2 = s2.elements();
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
		}

	}

}

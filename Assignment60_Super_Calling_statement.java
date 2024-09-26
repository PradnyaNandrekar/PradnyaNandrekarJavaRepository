package assignments_PradnyaNandrekar;
/*
 * Assignment 60 - WAP for super calling statement
 */

class Class_Parent
{
	Class_Parent()
	{
		System.out.println("Parent class - constructor");
	}
	
	Class_Parent(int a)
	{
		System.out.println("Parent class - constructor with parameter int "+a);
	}
}


public class Assignment60_Super_Calling_statement extends Class_Parent
{
	Assignment60_Super_Calling_statement()
	{
		super(30);
		System.out.println("Child class - constructor without parameter");
	}
	Assignment60_Super_Calling_statement(String s)
	{
		super();
		System.out.println("Child class - constructor with string parameter "+s);
	}

	public static void main(String[] args) 
	{
		new Assignment60_Super_Calling_statement();
		new Assignment60_Super_Calling_statement("Pradnya");

	}

}

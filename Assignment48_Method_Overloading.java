package assignments_PradnyaNandrekar;

public class Assignment48_Method_Overloading 
{
	/*
	 * Assignment 48- WAP of Method Overloading
	 */
	static void method1()
	{
		System.out.println("method without parameter");
	}
	static void method1(int a)
	{
		System.out.println("method with int parameter value is - "+a);
	}
	void method1(String s)
	{
		System.out.println("Non Static method with String parameter value is - "+s);
	}

	public static void main(String[] args) 
	{
		method1();
		method1(15);
		Assignment48_Method_Overloading m1 = new Assignment48_Method_Overloading();
		m1.method1("Pradnya");

	}

}

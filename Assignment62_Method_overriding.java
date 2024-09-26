package assignments_PradnyaNandrekar;

class Parent_Class1
{
	void parent_Method()
	{
		System.out.println("parent_Method without parameter");
		
	}
	void parent_Method(int a)
	{
		System.out.println("parent_Method with int parameter "+a);
	}
}

public class Assignment62_Method_overriding extends Parent_Class1
{
	void parent_Method()
	{
		System.out.println("Child_Method without parameter");
		
	}
	void parent_Method(int a)
	{
		System.out.println("Child_Method with int parameter "+a);
	}
	public static void main(String[] args) 
	{
		Assignment62_Method_overriding obj = new Assignment62_Method_overriding();
		obj.parent_Method();
		obj.parent_Method(30);

	}

}

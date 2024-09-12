package assignments_PradnyaNandrekar;

public class Assignment22_MainMethodOverloading_withNonStatMethod 
{
	void main()
	{
		System.out.println("main withoud para");
	}
	void main(char a)
	{
		System.out.println("main with char "+a);
	}
	void main(String b)
	{
		System.out.println("main with String "+b);
	}
	void main(double d)
	{
		System.out.println("main with double "+d);
	}
	public static void main(String[] args) 
	{
		Assignment22_MainMethodOverloading_withNonStatMethod c1 = new Assignment22_MainMethodOverloading_withNonStatMethod();
		c1.main();
		c1.main('P');
		c1.main("Pradnya");
		c1.main(1224324.213);
		System.out.println("Printing main method");

	}

}

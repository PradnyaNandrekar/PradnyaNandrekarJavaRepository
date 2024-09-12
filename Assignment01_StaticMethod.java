package assignments_PradnyaNandrekar;
public class Assignment01_StaticMethod 
{
	static void firstMethod()
	{
		System.out.println("This is first_method");
	}
	public static void main(String[] args) 
	{
		firstMethod();
		System.out.println("This is main method");
		secondMethod();
		thirdMethod();
		fourthMethod();
		fifth_Method();
	}
	static void secondMethod()
	{
		System.out.println("This is 2nd Method");
	}
	static void thirdMethod()
	{
		System.out.println("This is 3rd Method");
	}
	public static void fourthMethod()
	{
		System.out.println("This is 4th Method");
	}
	public static void fifth_Method()
	{
		System.out.println("This is 5th method");
	}
	
}

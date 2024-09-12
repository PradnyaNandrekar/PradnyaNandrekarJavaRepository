package assignments_PradnyaNandrekar;

public class Assignment21_MultiLevel_SeperateClass_SuperClass extends Assignment21_MultiLevel_SeperateClass_SuperMostClass
{
	static void method_superClass_Static()
	{
		System.out.println("method_superClass_Static");
	}
	void method_superClass_NonStatic(int s)
	{
		System.out.println("method_superClass_NonStatic");
		System.out.println("Value of s is "+s);
	}
}

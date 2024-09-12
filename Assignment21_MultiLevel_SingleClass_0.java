package assignments_PradnyaNandrekar;
class SuperMostClass
{
	static void method1_SuperMostClass_Static()
	{
		System.out.println("method1_SuperMostClass_Static");
	}
	void method1_SuperMostClass_NonStatic()
	{
		System.out.println("method1_SuperMostClass_NonStatic");
	}
	
}

class SuperClass extends SuperMostClass
{
	static void method1_SuperClass_Static()
	{
		System.out.println("method1_SuperClass_Static");
	}
	void method1_SuperClass_NonStatic()
	{
		System.out.println("method1_SuperClass_NonStatic");
	}
	
}
public class Assignment21_MultiLevel_SingleClass_0 extends SuperClass
{

	public static void main(String[] args) 
	{
		method1_SuperClass_Static();
		method1_SuperMostClass_Static();
		Assignment21_MultiLevel_SingleClass_0 obj1=new Assignment21_MultiLevel_SingleClass_0();
		obj1.method1_SuperMostClass_NonStatic();
		obj1.method1_SuperClass_NonStatic();
	}

}



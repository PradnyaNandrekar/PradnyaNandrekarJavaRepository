package assignments_PradnyaNandrekar;

public class Assignment59_HierarchyLevel_Inheritance_ChildClass2 extends Assignment59_HierarchyLevel_Inheritance_ParentClass
{
	public static void static_method1_ChildClass2()
	{
		System.out.println("static_method1_ChildClass2");
	}
	public void non_static_method1_ChildClass2()
	{
		System.out.println("static_method1_ChildClass2");
	}
	public static void main(String[] args) 
	{
		static_method1_ChildClass2();
		static_method1_ParentClass();
		Assignment59_HierarchyLevel_Inheritance_ChildClass2 obj1=new Assignment59_HierarchyLevel_Inheritance_ChildClass2();
		obj1.non_static_method1_ChildClass2();
		obj1.non_static_method1_ParentClass();

	}

}

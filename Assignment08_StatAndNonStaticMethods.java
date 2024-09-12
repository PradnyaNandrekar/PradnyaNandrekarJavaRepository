package assignments_PradnyaNandrekar;

public class Assignment08_StatAndNonStaticMethods 
{
	void add()
	{
		int a = 10;
		int b = 20;
		int add = a + b;
		System.out.println(add);	// 30
	}
	void sub()
	{
		int a = 20;
		int b = 5;
		int sub = a - b;
		System.out.println(sub);		// 15
	}
	public static void main(String[] args) 
	{
		//Calling static methods
		div();
		mod();
		//calling non static methods
		/*
		 * syntax -
		 * className variable = new className();
		 * variable.MethodName();
		 */
		Assignment08_StatAndNonStaticMethods m1 = new Assignment08_StatAndNonStaticMethods();
		m1.add();
		m1.sub();
	}
	static void div()
	{
		int a = 20;
		int b = 5;
		int div = a / b;
		System.out.println(div);	//4 - Quotient
	}
	static void mod()
	{
		int a = 20;
		int b = 5;
		int mod = a % b;
		System.out.println(mod);	//0 - Reminder
	}
}

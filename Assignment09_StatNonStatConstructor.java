package assignments_PradnyaNandrekar;

public class Assignment09_StatNonStatConstructor 
{
	
	
	
	public static void main(String[] args) 
	{
		// Calling Static method by its name
		statMethod01(1500000.50f);
		statMethod02("Pradnya", "Nandrekar");
		statMethod03("+917493826401");
		//calling NonStatic method by creating Object
		Assignment09_StatNonStatConstructor a1 = new Assignment09_StatNonStatConstructor ('Y');
		// While creating object with variable a1 constructor with char argument called already
		a1.nonStatMethod01("18/02/1993");
		a1.nonStatMethod02('F');
		a1.nonStatMethod03(30);
		//calling constructor while creation of object
		new Assignment09_StatNonStatConstructor(15);
		new Assignment09_StatNonStatConstructor("Pune");
		
	}
	
	// Static method 1
	static void statMethod01(float Salary)
	{
		System.out.println("Salary is " + Salary);
	}
	// Static method 2
	static void statMethod02(String fName, String lName)
	{
		System.out.println("Full Name is " + fName + " " + lName);
	}
	// Static method 3
	static void statMethod03(String mobNo)
	{
		System.out.println("Mobile No. is " + mobNo);
	}
	// Non Static method 1
	void nonStatMethod01(String DOB)
	{
		System.out.println("DOB is " + DOB);
	}
	// Non Static method 2
	void nonStatMethod02(char gender)
	{
		System.out.println("Gender is "+ gender);
	}
	// Non Static method 3
	void nonStatMethod03(int age)
	{
		System.out.println("Age is " + age);
	}
	
	//Constructor 1 - Constructor should have same name as class name
	Assignment09_StatNonStatConstructor(char shopDone)
	{
		System.out.println("Shopping Done? " + shopDone);
	}
	//Constructor 2 - Constructor with arguments
	Assignment09_StatNonStatConstructor(int bill)
	{
		System.out.println("Final bill " + bill);
	}
	//Constructor 3 - Constructor with arguments
	Assignment09_StatNonStatConstructor(String city)
	{
		System.out.println("City is " + city);
	}
		
}

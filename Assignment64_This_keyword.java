package assignments_PradnyaNandrekar;

public class Assignment64_This_keyword 
{
	int i = 30;
	String s1 = "Pradnya";
	
	void method1(int y, String z)
	{
		this.i=y;
		this.s1=z;
	}
	
	public static void main(String[] args)
	{
		int x=35;
		String s2 = "Arya";
		Assignment64_This_keyword obj = new Assignment64_This_keyword();
		System.out.println("Original Global value of i = "+obj.i);
		System.out.println("Original Global value of s1 = "+obj.s1);
		obj.method1(x,s2);
		System.out.println("After this keyword Global value of i = "+obj.i);
		System.out.println("After this keyword Global value of s1 = "+obj.s1);
	
	}

}

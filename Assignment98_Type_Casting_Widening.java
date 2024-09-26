package assignments_PradnyaNandrekar;

public class Assignment98_Type_Casting_Widening 
{
	/*
	 * Assignment 98 - WAP for Widening Type casting. Convert int to double
	 */

	public static void main(String[] args) 
	{
		int x= 123;
		double y = x; //implicit conversion
		double z = (int) x;  //explicit conversion
		System.out.println(y);  
		System.out.println(z);
		System.out.println(x);

	}

}

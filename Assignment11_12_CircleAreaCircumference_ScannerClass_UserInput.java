package assignments_PradnyaNandrekar;

import java.util.Scanner;

public class Assignment11_12_CircleAreaCircumference_ScannerClass_UserInput 
{
	static double pi = 3.14;
	static void CircleArea()
	{
		// Area of circle = pi*r*r
		Scanner c1 = new Scanner(System.in);
		System.out.println("Enter Value of r");
		float r = c1.nextFloat();
		System.out.println("Area of circle is " + pi*r*r);
		
	}
	static void CircleCircumference()
	{
		//CircleCircumference = 2*pi*r
		Scanner c1 = new Scanner(System.in);
		System.out.println("Enter Value of r");
		float r = c1.nextFloat();
		System.out.println("Circumference of circle is " + 2*pi*r);
	}

	public static void main(String[] args) 
	{
		CircleArea();
		CircleCircumference();

	}

}

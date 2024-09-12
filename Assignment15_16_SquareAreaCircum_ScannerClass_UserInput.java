package assignments_PradnyaNandrekar;

import java.util.Scanner;

public class Assignment15_16_SquareAreaCircum_ScannerClass_UserInput 
{
	Scanner s1 = new Scanner(System.in);
	double a = s1.nextDouble();
	static void SquareArea()
	{
		System.out.println("Enter value of a : ");
		Assignment15_16_SquareAreaCircum_ScannerClass_UserInput ob = new Assignment15_16_SquareAreaCircum_ScannerClass_UserInput();
		double result = ob.a * ob.a;
		System.out.println("Area of square is : "+ result);
		
	}
	static void SquareCircum()
	{
		System.out.println("Enter value of a : ");
		Assignment15_16_SquareAreaCircum_ScannerClass_UserInput ob = new Assignment15_16_SquareAreaCircum_ScannerClass_UserInput();
		double result = 4 * ob.a;
		System.out.println("Circumference of square is : "+ result);
		
	}

	public static void main(String[] args) 
	{
		SquareArea();
		SquareCircum();
	}

}

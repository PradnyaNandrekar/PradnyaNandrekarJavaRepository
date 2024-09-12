package assignments_PradnyaNandrekar;

import java.util.Scanner;

public class Assignment13_14_RectAreaCircum_ScannerClass_UserInput {

	static void RectangleArea()
	{
		//area of rectangle = l * w
		Scanner var = new Scanner(System.in);
		System.out.println("Enter value of Length: ");
		double l = var.nextDouble();
		System.out.println("Enter value of Width: ");
		double w = var.nextDouble();
		System.out.println("Area of rectangle is: ");
		double ans = l * w;
		System.out.println(ans);
		
	}
	static void RectangleCircum()
	{
		// Rectangle circumference = 2* (l + w)
		Scanner var = new Scanner(System.in);
		System.out.println("Enter value of Length: ");
		double l = var.nextDouble();
		System.out.println("Enter value of Width: ");
		double w = var.nextDouble();
		System.out.println("circumferences of rectangle is: ");
		double ans = 2* (l + w);
		System.out.println(ans);
	}
	public static void main(String[] args) 
	{
		RectangleArea();
		RectangleCircum();
	}

}

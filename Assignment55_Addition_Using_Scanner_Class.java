package assignments_PradnyaNandrekar;

import java.util.Scanner;

public class Assignment55_Addition_Using_Scanner_Class 
{
	/*
	 * Assignment 55 - WAP to add two numbers. take inputs using scanner class
	 */

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter num1 ");
		int num1 = s1.nextInt();
		System.out.println("Enter num2 ");
		int num2 = s1.nextInt();
		int result = num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+" = "+result);

	}

}

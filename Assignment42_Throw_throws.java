package assignments_PradnyaNandrekar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment42_Throw_throws 
{

	public static void main(String[] args) throws InputMismatchException
	{

		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Correct Age Entered " + age);
		if(age != 20)
		{
		throw new InputMismatchException("Exception occured");
		}

	}

}

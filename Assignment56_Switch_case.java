package assignments_PradnyaNandrekar;

import java.util.Scanner;

public class Assignment56_Switch_case 
{
	/*
	 * Assignment 56 - WAP for switch case having keywords - switch, case, default and break
	 */

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENter Name");
		String name = s1.next();
		switch(name)
		{
		case "Pradnya":
			System.out.println("Pradnya Typed");
			break;
		case "Raani":
			System.out.println("Raani Typed");
			break;
		case "Nita":
			System.out.println("Nita Typed");
			break;
		default:
			System.out.println("Enter Correct Name");
	
		}
	}

}

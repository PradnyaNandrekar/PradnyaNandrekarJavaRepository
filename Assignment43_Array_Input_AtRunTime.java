package assignments_PradnyaNandrekar;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment43_Array_Input_AtRunTime 
{
	/*
	 * Assignment 43
		Write program Accept the value of your array at the runtime ,
		if it is of int datatype size of 4
	 */

	public static void main(String[] args) 
	{
		int intArray[] = new int[4];
		
		for(int i=0; i<intArray.length; i++)
		{
			System.out.println("Enter int value at index - "+i);
			Scanner s1 = new Scanner(System.in);
			intArray[i] = s1.nextInt();
		}
		System.out.println("Final Array - "+Arrays.toString(intArray));

	}

}

package assignments_PradnyaNandrekar;

import java.util.Arrays;

public class Assignment35_copy_Array_into_Another_Array 
{
	/*
	 * Assignment 35 - 
			Copy the value of 
			one array to another
			array using iteration
	 */

	public static void main(String[] args) 
	{
		String array1[] = new String[3];
		String array2[] = new String[3];
		array1[0] = "Rekha";
		array1[1] = "Seema";
		array1[2] = "Deepa";
		System.out.println("Array2 Before copying - "+Arrays.toString(array2));
		
		for(int i=0; i<array2.length; i++)
		{
			array2[i]=array1[i];
		}
		
		System.out.println("Array1 - "+Arrays.toString(array1));
		System.out.println("Array2 After copying - "+Arrays.toString(array2));

	}

}

package assignments_PradnyaNandrekar;

import java.util.Arrays;

public class Assignment45_Array_Sorting 
{

	public static void main(String[] args) 
	{
		int array1[] = new int[5];
		array1[0] = 32;
		array1[1] = 33;
		array1[2] = 36;
		array1[3] = 37;
		array1[4] = 34;
		
		System.out.println("Array before sorting - "+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Array After sorting - "+Arrays.toString(array1));

	}

}

package assignments_PradnyaNandrekar;

import java.util.Arrays;

public class Assignment27_CopyReversedArray 
{

	public static void main(String[] args) 
	{
		int array1[] = new int[5];
		array1[0] = 2;
		array1[1] = 4;
		array1[2] = 6;
		array1[3] = 8;
		array1[4] = 10;
		
		int reversedArray[] = new int[5];
		
		for(int i=0, k=reversedArray.length-1; i<array1.length; i++, k--)  // here k is taken for new array index
		{
			reversedArray[k] = array1[i];
		}
		System.out.println("Original Array - "+ Arrays.toString(array1));
		System.out.println("Reversed Array - "+ Arrays.toString(reversedArray));
		
		

	}

}

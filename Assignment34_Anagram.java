package assignments_PradnyaNandrekar;

import java.util.Arrays;

public class Assignment34_Anagram 
{
	/*
	 * Assignment 34 - 
			Find out if 
			given two string are 
			anagram of each other
	 */

	public static void main(String[] args)
	{
		String str1 = "ram";
		String str2 = "arm";
		char str1_array[] = str1.toCharArray();
		char str2_array[] = str2.toCharArray();
		
		Arrays.sort(str1_array);
		Arrays.sort(str2_array);
		
		if(Arrays.equals(str1_array, str2_array))
		{
			System.out.println("Both Strings are anagram of each other");
		}
		else
		{
			System.out.println("Both Strings are Not anagram of each other");
		}
		

	}

}

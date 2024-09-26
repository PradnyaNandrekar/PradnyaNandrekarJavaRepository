package assignments_PradnyaNandrekar;

public class Assignment32_Reverse_String 
{
	/*
	 * Assignment 32 - 
			Write a program to 
			reverse String
			ex-school
	 */

	public static void main(String[] args) 
	{
		String originalString = "ex-school";
		String revString = "";
		for(int i =originalString.length()-1; i>=0; i--)
		{
			char ch = originalString.charAt(i);
			revString = revString+ch;
		}
		
		System.out.println("Original String - "+originalString);
		System.out.println("Reversed String - "+revString);

	}

}

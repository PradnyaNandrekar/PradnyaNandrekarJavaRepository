package assignments_PradnyaNandrekar;

public class Assignment36_String_Count_Space_alpha_speChar_num 
{
	/*
	 * Assignment 36 - 
			In given String find
			how many are alphabets,
			how many are special character,
			how many are numeric,
			how many are Spaces
	 */

	public static void main(String[] args) 
	{
		String str = "My Address #*1234";
		
		int cnt_alphabets = 0;
		int cnt_whtSpaces = 0;
		int cnt_num = 0;
		int str_Length = str.length();
		
		char array_str[] = str.toCharArray();
		for (int i=0; i < array_str.length; i++)
		{
			if(Character.isAlphabetic(array_str[i]))
			{
				cnt_alphabets++;
			}
			if(Character.isWhitespace(array_str[i]))
			{
				cnt_whtSpaces++;
			}
			if(Character.isDigit(array_str[i]))
			{
				cnt_num++;
			}
		}
		
		int cnt_speChar = str_Length - (cnt_alphabets+cnt_whtSpaces+cnt_num);
		System.out.println("Given String is - "+str);    //My Address #*1234	
		System.out.println("Alphabates in String is - "+cnt_alphabets);    //9	
		System.out.println("Spaces in String is - "+cnt_whtSpaces);			//2
		System.out.println("Numerics in String is - "+cnt_num);				//4
		System.out.println("Special Char in String is - "+cnt_speChar);		//2
		
		
		
		
		

	}

}

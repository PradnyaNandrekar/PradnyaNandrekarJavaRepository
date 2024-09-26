package assignments_PradnyaNandrekar;

public class Assignment33_Palindrome 
{
/*
 * Assignment 33 - 
		Check if given string 
		is palindrome or not 
		Ex:-Malayalam
 */
	public static void main(String[] args) 
	{
		String str = "Malayalam";
		String rev_Str = "";
		for(int i= str.length()-1; i>=0; i--)
		{
			char ch = str.charAt(i);
			rev_Str = rev_Str+ch;
			
		}
		if(str.equalsIgnoreCase(rev_Str))
		{
			System.out.println("Given string '"+str+"' is Palindrome");
		}
		else
		{
			System.out.println("Given string '"+str+"' is Not Palindrome");
		}
		
		

	}

}

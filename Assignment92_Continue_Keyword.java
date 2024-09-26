package assignments_PradnyaNandrekar;
/*
 * Assignment 92 - WAP - for continue keyword. Print 1 to 10 by skipping number 4
 */

public class Assignment92_Continue_Keyword
{

	public static void main(String[] args) 
	{
		for(int i=1; i<=10;i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
		}
		

	}

}

package assignments_PradnyaNandrekar;

import java.util.Date;

public class Assignment37_Find_Current_Date 
{
	/*
	 * Assignment 37 -
		Find Present Time,
	 */

	public static void main(String[] args) 
	{
		Date epch_Date = new Date();
		Date present_Date = new Date(epch_Date.getTime());
		System.out.println("Present Date Time is - "+present_Date);  //Wed Sep 25 20:26:11 IST 2024

	}

}

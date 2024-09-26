package assignments_PradnyaNandrekar;

import java.util.Date;

public class Assignment38_Find_Future_Date 
{
	/*
	 * Assignment 38 - Find FUture Time
	 */

	public static void main(String[] args) 
	{
		Date epchDate = new Date();
		Date presentDate = new Date(epchDate.getTime());
		Date FutureDate = new Date(epchDate.getTime() + (1000*60*60*24*2)); // Date after 2 days
		System.out.println("Present Date is "+presentDate);
		System.out.println("Future Date is "+FutureDate);

	}

}

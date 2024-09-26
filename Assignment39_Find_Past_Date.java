package assignments_PradnyaNandrekar;

import java.util.Date;

public class Assignment39_Find_Past_Date 
{

	public static void main(String[] args) 
	{
		Date epchDate = new Date();
		Date presentDate = new Date(epchDate.getTime());
		Date PastDate = new Date(epchDate.getTime()-(1000*60*60*24*2));
		System.out.println("Present Date - "+presentDate);
		System.out.println("Past Date - "+PastDate);

	}

}

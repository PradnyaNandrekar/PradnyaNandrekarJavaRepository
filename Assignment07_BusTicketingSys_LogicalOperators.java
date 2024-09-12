package assignments_PradnyaNandrekar;

public class Assignment07_BusTicketingSys_LogicalOperators {

	public static void main(String[] args) 
	{
		char gender = 'M';
		int age = 60;
		
		if(!(gender=='M'))
		{
			System.out.println("Free tickets for Women");
		}
		else
		{
			if(gender=='M')
			{
				if(age < 2)
				{
					System.out.println("For infant boys Ticket is free");
				}
				else if(age >=2 && age < 12 && age >60)
				{
					System.out.println("Half Ticket");
				}
				else 
				{
					System.out.println("Full Ticket");
				}
				
			}
			
		}
	}

}

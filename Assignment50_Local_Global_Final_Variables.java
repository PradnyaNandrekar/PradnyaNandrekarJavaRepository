package assignments_PradnyaNandrekar;

public class Assignment50_Local_Global_Final_Variables 
{
	/*Assignment 50 - WAP which has Local, Global and Final variables in it.
		Print all variables value
	 */
	final String s1 = "Earth is Unique";
	char p = 'S';
	static double r = 34613.133;
	
	public static void main(String[] args) 
	{
		float x = 3.124f;
		Assignment50_Local_Global_Final_Variables var1= new Assignment50_Local_Global_Final_Variables();
		System.out.println("Final Variable - "+ var1.s1);
		System.out.println("Global Variable - "+ var1.p);
		System.out.println("Static Gloabal Variable - "+ r);
		System.out.println("Local Variable - "+ x);


	}

}

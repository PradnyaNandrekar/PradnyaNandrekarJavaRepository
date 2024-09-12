/*
 "Assignment 23
Find out Area of 10 Circles where for every circle radius come from math.random"
 */

package assignments_PradnyaNandrekar;

public class Assignment23_AreaOfTenCircle_UsingMathClass 
{
	static double pi = Math.PI;
	// math.PI method comes from math class, math class comes from java.lang package
	public static void main(String[] args) 
	{
		double r = Math.random(); // Random method comes from math class, math class comes from java.lang package
		for(int i = 0; i<10;i++)
		{
			System.out.println("Radius of circle is "+i + " -> "+r);
			double circleArea = pi*r*r;
			System.out.println("Area of circle "+i + " -> "+circleArea);
		}

	}

}

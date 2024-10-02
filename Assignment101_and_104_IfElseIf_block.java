package assignments_PradnyaNandrekar;

import java.util.Scanner;

public class Assignment101_and_104_IfElseIf_block 
{
	static void Assignment101()
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Enter 5 or 10");
		int num = i.nextInt();
		
		if(num == 5)
		{
			System.out.println("Number 5 entered");
		}
		else if(num == 10)
		{
			System.out.println("Number 10 entered");
		}
		else
		{
			System.out.println("Random Number entered");
		}
	}
	static void Assignment104()
	{
		Scanner i1 = new Scanner(System.in);
		System.out.println("Enter number in range of 5. From 5 to 25");
		int num = i1.nextInt();
		
		if(num == 5)
		{
			System.out.println("Number 5 entered");
		}
		else if(num == 10)
		{
			System.out.println("Number 10 entered");
		}
		else if(num == 15)
		{
			System.out.println("Number 15 entered");
		}
		else if(num == 20)
		{
			System.out.println("Number 20 entered");
		}
		else if(num == 25)
		{
			System.out.println("Number 25 entered");
		}
		else
		{
			System.out.println("Random Number entered");
		}
	}

	public static void main(String[] args) 
	{
		Assignment101();
		Assignment104();
	}

}

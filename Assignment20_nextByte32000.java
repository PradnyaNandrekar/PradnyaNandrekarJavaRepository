package assignments_PradnyaNandrekar;

import java.util.Scanner;

public class Assignment20_nextByte32000 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter byte value as 32000 and check exception");
		byte val = s1.nextByte();
		System.out.println(val);
	
		/*  Output -----
		 Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"32000" Radix:10
	at java.base/java.util.Scanner.nextByte(Scanner.java:2034)
	at java.base/java.util.Scanner.nextByte(Scanner.java:1982)
	at FirstJavaProject/assignments_PradnyaNandrekar.Assignment20_nextByte32000.main(Assignment20_nextByte32000.java:11) 
		  
		 */
		

	}

}

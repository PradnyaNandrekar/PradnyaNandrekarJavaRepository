package assignments_PradnyaNandrekar;

public class Assignment90_StringBuilder_Methods 
{

	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("Pradnya");
		StringBuilder sb2 = new StringBuilder(10);
		
		System.out.println("StringBuilder without Param - "+sb);
		System.out.println("StringBuilder with Param - "+sb1); //Pradnya
		System.out.println("StringBuilder with int Param - "+sb2);
		
		sb1.append(" Nandrekar");
		System.out.println("After Append - "+sb1); //Pradnya Nandrekar
		System.out.println("After Insert - "+sb1.insert(0, "Mrs. ")); //Mrs. Pradnya Nandrekar
		System.out.println("After Delete - "+sb1.delete(0, 5)); //Pradnya Nandrekar
		System.out.println("After replace - "+sb1.replace(0, 7, "Aryaraj")); //Aryaraj Nandrekar
		System.out.println("After Substring - "+sb1.substring(0, 7)); //Aryaraj
		System.out.println("After Substring - "+sb1.substring(7)); //" Nandrekar"
		System.out.println("CharAt 8th index - "+sb1.charAt(8));// N
		System.out.println("After Reverse - "+sb1.reverse()); //rakerdnaN jarayrA
		

	}

}

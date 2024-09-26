package assignments_PradnyaNandrekar;

public class Assignment89_StringBuffer_Methods 
{

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Pradnya Nandrekar");
		System.out.println("Original StringBuffer - "+ sb);
		sb.append(" Chougule");
		System.out.println("After Append - "+sb); //Pradnya Nandrekar Chougule
		sb.insert(0, "Mrs. ");
		System.out.println("After Insert - "+sb); //Mrs. Pradnya Nandrekar Chougule
		sb.replace(0, 5, "---");
		System.out.println("After replace - "+sb); //---Pradnya Nandrekar Chougule
		sb.delete(0, 3);
		System.out.println("After Delete - "+sb); //Pradnya Nandrekar Chougule
		
		System.out.println("Length-"+sb.length()); //26
		System.out.println("Char at index 6-"+sb.charAt(6));
		System.out.println("Substring - "+ sb.substring(0, 8)); //Pradnya
		System.out.println("After Reverse - "+sb.reverse()); //eluguohC rakerdnaN ayndarP
		System.out.println("String capacity - "+sb.capacity()); //33 
		
		

	}

}

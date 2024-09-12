package assignments_PradnyaNandrekar;

import java.util.Arrays;

public class Assignment25_26_ArrayComparison 
{
	static void StringArray_1()
	{
		String strArray1[] = new String[4];
		String strArray2[] = new String[4];
		
		strArray1[0] = "Pradnya";
		strArray1[1] = "Shweta";
		strArray1[2] = "Bani";
		strArray1[3] = "Diksha";
		
		strArray2[0] = "Pradnya";
		strArray2[1] = "Shweta";
		strArray2[2] = "Bani";
		strArray2[3] = "Diksha";
		
		if(Arrays.equals(strArray1, strArray2))
		{
			System.out.println("Both string arrays are equal");
		}
		else
		{
			System.out.println("Both String arrays are not equal");
		}
				
	}
	
	static void charArray_2()
	{
		char charArray1[] = new char[4];
		charArray1[0] = 'a' ;
		charArray1[1] = 'b' ;
		charArray1[2] = 'c' ;
		charArray1[3] = 'd' ;
		
		char charArray2[] = new char[4];
		charArray2[0] = 'e' ;
		charArray2[1] = 'f' ;
		charArray2[2] = 'g' ;
		charArray2[3] = 'h' ;
		
		if(Arrays.equals(charArray1, charArray2))
		{
			System.out.println("Both char arrays are equal");
		}
		else
		{
			System.out.println("Both char arrays are not equal");
		}
	}

	public static void main(String[] args) 
	{
		
		StringArray_1();
		charArray_2();

	}

}

package assignments_PradnyaNandrekar;

public class Assignment44_Array_Check_Val_Present 
{
/*
 * Assignmnet 44 - 
		Create a array of size
		of 5 and just check 34
		 is present in array or not
 */
	public static void main(String[] args) 
	{
		int array1[] = new int[5];
		array1[0] = 32;
		array1[1] = 33;
		array1[2] = 36;
		array1[3] = 37;
		array1[4] = 34;
		int valToCheck = 34;
		
		for(int i=0; i<array1.length; i++)
		{
			if(array1[i]==valToCheck)
			{
				System.out.println(valToCheck+" is present in Array");
			}
			
		}

	}

}

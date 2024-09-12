package assignments_PradnyaNandrekar;

public class Assignment24_ArrayCreation 
{
	
	static void Array_Bool()
	{
		//Boolean datatype Array
				boolean boolArray[] = new boolean[2];
				boolArray[0] = false;
				boolArray[1] = true;
				
				for(int i = 0; i<2;i++)
				{
					System.out.println(boolArray[i]);
				}
	}
	static void Array_double()
	{
				// double datatype Array 
				double dblArray[] = new double[3];
				dblArray[0] = 34.12133;
				dblArray[1] = 0.246;
				dblArray[2] = 2434.133;
				for(int i = 0; i<3; i++)
				{
					System.out.println(dblArray[i]);
				}
	}
	static void Array_char()
	{
				// char datatype Array 
				char chrArray[] = new char[4];
				chrArray[0] = 'a';
				chrArray[1] = 'b';
				chrArray[2] = 'c';
				chrArray[3] = 'd';
				// chrArray[4] = 'e';   ------   ArrayIndexOutOfBoundsException:
				for(int i = 0; i<4; i++)
				{
					System.out.println(chrArray[i]);
				}
	}

	public static void main(String[] args)
	{
		Array_Bool();
		Array_double();
		Array_char();		
	}

}



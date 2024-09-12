package assignments_PradnyaNandrekar;

public class Assignment06_VariableUpdating 
{
	public static void main(String[] args) 
	{
		variableValUpdate();
	}
	static void variableValUpdate()
	{
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String s1;
		boolean b1;
		
		b = 127;
		s = 32767;
		i = 1233534;
		l = 2132534654;
		f = 1234.234f;
		d = 1234.542348;
		c = 'C';
		s1 = "This is String";
		b1 = true;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s1);
		System.out.println(b1);
		
		// Values Update 
		b = -127;
		s = -3767;
		i = 13534;
		l = 214654;
		f = 123.234f;
		d = 1234.45542348;
		c = 'S';
		s1 = "This is updated String";
		b1 = false;
		
		System.out.println("After update "+b);
		System.out.println("After update "+s);
		System.out.println("After update "+i);
		System.out.println("After update "+l);
		System.out.println("After update "+f);
		System.out.println("After update "+d);
		System.out.println("After update "+c);
		System.out.println("After update "+s1);
		System.out.println("After update "+b1);
				
	}
}

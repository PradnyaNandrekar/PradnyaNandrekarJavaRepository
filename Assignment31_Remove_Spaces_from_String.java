package assignments_PradnyaNandrekar;

public class Assignment31_Remove_Spaces_from_String {

	public static void main(String[] args) 
	{
		String s1 = "My Name is Java";
		String newString = s1.replaceAll(" ","");
		System.out.println("Old String Before Space remove- "+s1); // My Name is Java
		System.out.println("New String After Space remove- "+newString); //MyNameisJava

	}

}

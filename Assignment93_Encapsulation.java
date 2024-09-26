package assignments_PradnyaNandrekar;

public class Assignment93_Encapsulation 
{
	private int OTP = 3132;
	private String name = "Pradnya";
	
	public int getOTP() 
	{
		return OTP;
	}

	public void setOTP(int OTP) 
	{
		this.OTP = OTP;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public static void main(String[] args) 
	{
		Assignment93_Encapsulation obj = new Assignment93_Encapsulation();
		obj.setOTP(9999);
		obj.setName("Arya");
		System.out.println(obj.getOTP());
		System.out.println(obj.getName());

	}

}

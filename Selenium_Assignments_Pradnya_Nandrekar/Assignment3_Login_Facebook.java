package selenium_Assignments_Pradnya_Nandrekar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Login_Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("nandrekarpradnyas@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("132224");
		driver.findElement(By.name("login")).click();

	}

}

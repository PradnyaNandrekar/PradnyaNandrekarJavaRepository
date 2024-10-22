package selenium_Assignments_Pradnya_Nandrekar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment43_HeadLess_Mode {

	public static void main(String[] args) 
	{
		
		ChromeOptions var1 = new ChromeOptions();
		var1.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(var1);
		driver.manage().window().maximize();
		
		driver.get("https://www.amezon.in");
		System.out.println("Browser opened in headless mode");
		
		driver.quit();

		
		

	}

}

package selenium_Assignments_Pradnya_Nandrekar;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_GetWindowHandle_GetWindowHandles_amzn 
{
	/*
	 * Assignment8 - 
			WAP for getWindowhandle()
	 */

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		String parent_Tab_ID = driver.getWindowHandle();
		WebElement partial_linkText_Services = driver.findElement(By.partialLinkText("Service"));
		partial_linkText_Services.click();
		Set<String> child_Tab_ID = driver.getWindowHandles();
		System.out.println("Parent tab ID "+parent_Tab_ID); //Parent tab ID 4BB2E3682FB954B8F424941203C4AEF2
		System.out.println("Child tab ID "+child_Tab_ID);	//Child tab ID [4BB2E3682FB954B8F424941203C4AEF2]

	}

}

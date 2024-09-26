package selenium_Assignments_Pradnya_Nandrekar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_SearchSomething_Amezon_IDLocator 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement txtBoxSerach = driver.findElement(By.id("twotabsearchtextbox"));
		txtBoxSerach.sendKeys("one plus9r");
		WebElement iconSerach = driver.findElement(By.id("nav-search-submit-button"));
		iconSerach.click();
		

	}

}

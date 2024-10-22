package selenium_Assignments_Pradnya_Nandrekar;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment40_Amezon_Find_Cordinates 
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amezon.in");
	WebElement abtAmzn = driver.findElement(By.xpath("//a[.='About Amazon']"));
	
	Point v1 = abtAmzn.getLocation();
	int x = v1.getX();
	int y = v1.getY();
	System.out.println("X cordinate = "+x);
	System.out.println("Y cordinate = "+y);
	
	
}

}

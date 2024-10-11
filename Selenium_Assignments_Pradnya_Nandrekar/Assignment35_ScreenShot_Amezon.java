package selenium_Assignments_Pradnya_Nandrekar;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment35_ScreenShot_Amezon 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amezon.in");
		
		TakesScreenshot ts = driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\GrowtechMind\\Screenshots_Practice\\img"+Math.random()+".png");
		FileHandler.copy(sourceFile, destFile);
		
		// image name - using className. i.e. method - "new ClassName().getClass()"
		File dest2_File = new File("D:\\GrowtechMind\\Screenshots_Practice\\img"+new Assignment35_ScreenShot_Amezon().getClass() +".png");
		FileHandler.copy(sourceFile, dest2_File);

	}

}

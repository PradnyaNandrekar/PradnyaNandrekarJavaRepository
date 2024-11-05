package selenium_Assignments_Pradnya_Nandrekar;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment74_Broken_Links 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("Number of links available on page - "+li.size());
		
		for(int i=0; i<li.size(); i++)
		{
			WebElement list_li =	li.get(i);
			String url = list_li.getAttribute("href");
			System.out.println(url);
			verifyLinks(url);
		}
	}
	
	public static void verifyLinks(String url) throws IOException
	{
		try
		{
			URL uL = new URL(url);
			HttpURLConnection u2 = (HttpURLConnection) uL.openConnection();
			if(u2.getResponseCode()==200)
				{
					System.out.println("Link is Valid "+url+ " "+u2.getResponseMessage());
				}
			else
			{
				System.out.println("Link is InValid "+url+ " "+u2);
			}
		}
		catch(MalformedURLException var1)
		{
			System.out.println("Exception handled");
		}
		
	}

}

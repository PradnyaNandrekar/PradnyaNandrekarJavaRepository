package Assignment_TestNG_Pradnya;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment52_Amezon 
{
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement txt_Mobile= driver.findElement(By.xpath("//input[@name=\"email\"]"));
		txt_Mobile.sendKeys("8605119718");
		WebElement btn_cntinue= driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		btn_cntinue.click();
		WebElement txt_Pwd= driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		txt_Pwd.sendKeys("Pratik*999");
		WebElement btn_SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		btn_SignIn.click();
		
		Thread.sleep(2000);
	}
	@Test
	public void AmezonSearch()
	{
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
	}
	
	@Test
	public void AmezonAddWishList() throws InterruptedException 
	{
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
		WebElement shoe1st = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		shoe1st.click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> is1 = s1.iterator();
		String parentID = is1.next();
		String childID = is1.next();
		
		driver.switchTo().window(childID);
		
		WebElement btn_wishList = driver.findElement(By.id("wishListMainButton"));
		btn_wishList.click();

	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}
	
	
}

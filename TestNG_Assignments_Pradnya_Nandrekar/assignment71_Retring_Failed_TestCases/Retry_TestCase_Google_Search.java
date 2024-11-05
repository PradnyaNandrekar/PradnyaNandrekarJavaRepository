package assignment71_Retring_Failed_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_TestCase_Google_Search 
{
	@Test(retryAnalyzer=assignment71_Retring_Failed_TestCases.Retry_Class.class)
	public void Serach()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement Search_textBox = driver.findElement(By.name("q"));
		Assert.assertEquals(Search_textBox.isDisplayed(), true);
		Search_textBox.sendKeys("India");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}

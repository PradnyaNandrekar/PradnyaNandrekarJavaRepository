package selenium_Assignments_Pradnya_Nandrekar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Login_Amezon {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement e1= driver.findElement(By.id("ap_email"));
		e1.sendKeys("918605119718");
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		WebElement entrPass = driver.findElement(By.id("ap_password"));
		entrPass.sendKeys("Xyz@1235");
		WebElement btnSignInSubmit = driver.findElement(By.id("signInSubmit"));
		btnSignInSubmit.click();
//		driver.quit();
	}

}

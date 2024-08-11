package projectLuma;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateBackAndForwardMain {
	WebDriver driver;
	
	 @Test(priority = 0)
	 public void setup()
		{
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}

	 @Test(priority = 1)
	 public void placeOrder() throws InterruptedException, IOException
	 {
		 
		 LumaSignIn sign = new LumaSignIn(driver);
		 sign.urla();
		sign.clickOnSignInlink();
		sign.enteremail("shreelai78@gmail.com");
		sign.enterPasswd("shreelai@567");
		sign.clickSigninBtn();
	 }
	 
	 @Test(priority = 2)
	 public void verifybackandFwd() throws InterruptedException
	 {
		 NavigationBackForward bafwd = new NavigationBackForward(driver);
		 bafwd.urlsale();
	 }
}

package projectLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigationBackForward 

	{
		WebDriver driver;

		 public NavigationBackForward(WebDriver idriver)
		{

		driver = idriver;
		PageFactory.initElements(driver, this);
		
		}
		 
		 public void urlsale() throws InterruptedException
		 {
			driver.get("https://magento.softwaretestingboard.com/sale.html");
			Thread.sleep(2000);
			
			driver.navigate().back();
	Thread.sleep(2000);

	driver.navigate().forward();

	Thread.sleep(2000);
		 }

}

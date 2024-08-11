package projectLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CompareTitle
{

WebDriver driver;

public CompareTitle(WebDriver idriver)
	{

	driver = idriver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void verifyHomepage()
	{
		String dash = driver.getTitle();
		
		Assert.assertEquals(dash,"Home Page");
	}
		
		
	}


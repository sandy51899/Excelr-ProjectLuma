package projectLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LumaTitleContains {

	WebDriver driver;

	public LumaTitleContains(WebDriver idriver)
		{

		driver = idriver;
		PageFactory.initElements(driver, this);
		
		}
		
	public void compareTitle()
	
	{
		
        String acttitl = driver.getTitle();
		
		if( acttitl.contains("om"))
				{
			System.out.println("Title contains om");
				}
		
		else
		{
			System.out.println("Title doesn't contains om");
		}

	}

}

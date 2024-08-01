package projectLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountLogout 

{
	WebDriver driver;

	 public CreateAccountLogout(WebDriver idriver)
	{

	driver = idriver;
	PageFactory.initElements(driver, this);
	
	}
	 
	//Repository
	 @FindBy(xpath="//div[@class='panel header']/descendant::button[@class='action switch']") WebElement arrow;
	 @FindBy(xpath ="//div[@class='panel header']/descendant::div[@class='customer-menu']/descendant::li[3]/child::a")WebElement logoutlink;
	 public void clickOnArrow() throws InterruptedException
		{
			arrow.click();
			
		}

		public void clickSignOut()
		{
			logoutlink.click();
		}
}

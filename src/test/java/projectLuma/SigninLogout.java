package projectLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninLogout 
{
	WebDriver driver;

	 public SigninLogout(WebDriver idriver)
	{

	driver = idriver;
	PageFactory.initElements(driver, this);
	
	}
	
	//repository
	@FindBy (xpath="//div[@class='panel header']/descendant::button") WebElement arrowlink;
	@FindBy (xpath="//div[@class='panel header']/descendant::ul[2]/descendant::li[3]/child::a")WebElement logoutlink;
	@FindBy(xpath="//div[@class='panel header']/descendant::ul[2]/descendant::li[1]/child::a") WebElement myacclink;
	
	public void clickArrow()
	{
		arrowlink.click();;
	}
	
	public void clickMyaccount()
	{
		myacclink.click();
	}
	public void clickOnSignoutink() throws InterruptedException
	{
		logoutlink.click();
		Thread.sleep(2000);
	}

}

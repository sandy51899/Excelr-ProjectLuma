package projectLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchToMyorder 
{
	WebDriver driver;

	 public SwitchToMyorder(WebDriver idriver)
	{

	driver = idriver;
	PageFactory.initElements(driver, this);
	
	}
	
	//repository
	 
	@FindBy(xpath="//div[@class='page-wrapper']/descendant::div[@id='block-collapsible-nav']"
			+ "/child::ul/descendant::li[2]/child::a")WebElement MyOrder;
	@FindBy(xpath="//div[@class='page-wrapper']/descendant::div[@class='box box-information']/descendant::a[2]")WebElement ChangePwd;
	@FindBy(xpath="//form[@class='form form-edit-account']/descendant::fieldset[@class='fieldset password']"
			+ "/descendant::div[@class='field password current required']/descendant::input")WebElement CurrPwd;
	@FindBy(name ="password")WebElement NewPwd;
	@FindBy(name="password_confirmation")WebElement ConfPwd;
	@FindBy(xpath="//form[@class='form form-edit-account']/descendant::div[@class='actions-toolbar']"
			+ "/child::div[@class='primary']/child::button")WebElement save;
	@FindBy(xpath="//div[@class='page-wrapper']/descendant::div[@class='page messages']"
			+ "/descendant::div[@role='alert']/descendant::div[1]")WebElement Savedmessage;
	
	public void ClickChangePwd()
	{
		ChangePwd.click();
	}
	
	public void EnterCurrentPwd(String cpwd)
	{
		CurrPwd.sendKeys(cpwd);
	}
	
	public void EnterNewPwd(String npwd)
	{
		NewPwd.sendKeys(npwd);
	}
	
	public void EnterConfPwd(String conpwd)
	{
		ConfPwd.sendKeys(conpwd);
	}
	
	public void ClickSaveBtn()
	{
		save.click();
	}
	
	public void FetchCurrentURL()
	{
		
		driver.getCurrentUrl();
		
	}
	public void SavedMessage()
	{
	String message=Savedmessage.getText();
	System.out.println(message);
	}
	public void ClickMyOrder()
	{
		MyOrder.click();
	}
	
	
	
}

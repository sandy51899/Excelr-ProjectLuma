package projectLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaCreateAccount 
	
	{
		WebDriver driver;

		 public LumaCreateAccount(WebDriver idriver)
		{
	
		driver = idriver;
		PageFactory.initElements(driver, this);
		
		}
		
		//repository
		@FindBy (xpath="//div[@class='panel header']/descendant::li[3]/child::a") WebElement creatlink;
		@FindBy (name="firstname")WebElement finam;
		@FindBy (name="lastname")WebElement lasnam;
		@FindBy (name="email") WebElement email;
		@FindBy  (name= "password") WebElement passwrd;
		@FindBy  (name= "password_confirmation") WebElement conpasswrd;
		@FindBy (xpath = "//div[@class='primary']/child::button") WebElement createbtn;
		
		
		
		public void clickOnCreateacc()
		{
			creatlink.click();
		}

		public void enterfirstName(String fn)
		{
		finam.sendKeys(fn);
		}

		public void enterlastName(String ln)
		{
		lasnam.sendKeys(ln);
		}
		
		public void enteremail(String em)
		{
		email.sendKeys(em);	
		}
		public void enterpwd(String pwd)
		{
			passwrd.sendKeys(pwd);	
		}
		public void enteconfirmpwd(String cpwd)
		{
			conpasswrd.sendKeys(cpwd);	
		}
		
		public void clickcreatebtn()
		{
			createbtn.click();
			
		}
		
		
	}



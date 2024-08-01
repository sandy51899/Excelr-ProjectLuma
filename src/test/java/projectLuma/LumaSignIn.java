package projectLuma;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LumaSignIn 
{
	WebDriver driver;

	 public LumaSignIn(WebDriver idriver)
	{

	driver = idriver;
	PageFactory.initElements(driver, this);
	
	}
	
	//repository
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy (xpath="//header[@class='page-header']/descendant::li[2]/child::a") WebElement signinlink;
	@FindBy (id="email")WebElement emal;
	@FindBy (id="pass")WebElement passd;
	@FindBy (xpath = "//fieldset[@class='fieldset login']/descendant::div[6]/descendant::button") WebElement signinbtn;
	@FindBy(xpath="//div[@class='sections nav-sections']/descendant::nav[@class='navigation']/descendant::li"
			+ "[@class='level0 nav-4 category-item level-top parent ui-menu-item']/child::a")WebElement gearmenu;
	@FindBy(xpath="//div[@class='sections nav-sections']/descendant::nav[@class='navigation']"
			+ "/descendant::li[@class='level1 nav-4-1 category-item first ui-menu-item']/child::a")WebElement gearsubmenu;
	
	@FindBy(id="search")WebElement searchbox;
	
	@FindBy(xpath="//div[@class='block block-search']/descendant::div[7]/child::button")WebElement searchicon;
	
	@FindBy(id="sorter")WebElement sorter;
	
	@FindBy(xpath="//div[@class='columns']/descendant::div[@class='filter-options']/descendant::div[13]")WebElement MaterialDrop;
	
	@FindBy(xpath="//div[@class='sidebar sidebar-main']/descendant::div[@class='filter-options']/descendant::div[15]/child::ol/child::li[1]/child::a")WebElement burlapoption; 
	
	
	@FindBy(xpath="//div[@class='columns']/descendant::div[8]/child::ol/child::li/child::div/child::a/descendant::span[2]/child::img")WebElement clickPhoto;
	
	
	@FindBy(xpath="//div[@class='columns']/descendant::div[21]/child::div[1]/child::a[1]")WebElement addToWishlist;
	
	@FindBy(xpath="//main[@id='maincontent']/descendant::div[4]/child::div[@class='message-success success message']/child::div") WebElement Savedwishmessage;
	

	@FindBy(name="qty") WebElement quantity;
	
	@FindBy(xpath="//div[@class='columns']/descendant::div[14]/descendant::div[5]/child::button") WebElement addTocartBtn;
	
	@FindBy(xpath="//div[@class='page-wrapper']/descendant::div[@class='minicart-wrapper']/child::a") WebElement cartIcon;
	
	@FindBy(xpath="//div[@class='page-wrapper']/descendant::div[@data-block='minicart']/descendant::div[2]"
			+ "/descendant::div[@class='block-content']/descendant::div[4]/child::div[1]") WebElement CheckOutBtn;
	
	@FindBy(name="company")WebElement company;
	
	@FindBy(xpath="//li[@id='shipping']/descendant::div[10]/child::div[@class='field _required']/child::div/child::input")WebElement streetaddress;
	
	@FindBy(xpath="//li[@id='shipping']/descendant::form/descendant::div[15]/child::div/child::input")WebElement city;
	
	@FindBy(xpath="//li[@id='shipping']/descendant::form/descendant::div[17]/child::div/child::select") WebElement state;
	
	@FindBy(name="country_id")WebElement country;
	
	@FindBy(name="postcode")WebElement postalcode;
	
	@FindBy(name="telephone")WebElement phonenumber;
	
	@FindBy(xpath="//li[@id='opc-shipping_method']/descendant::div[5]/child::form/child::div[3]/child::div/child::button")WebElement nextbutton;
	
	@FindBy(name="billing-address-same-as-shipping")WebElement checkboxAddress;
	
	@FindBy(xpath="//div[@class='payment-group']/descendant::div[@class='billing-address-form']/child::form/descendant::div[5]/child::div/child::input")WebElement companyUp;
	
	@FindBy(xpath="//div[@class='checkout-billing-address']/descendant::div[12]/child::div[1]/child::div/child::input")WebElement streetUpdate;
	
	@FindBy(xpath="//div[@class='checkout-billing-address']/descendant::div[19]/child::div/child::input")WebElement cityUp;
	
	@FindBy (xpath="//div[@class='checkout-billing-address']/descendant::div[27]/descendant::div/child::select")WebElement countryUp;
	
	@FindBy(xpath="//div[@class='checkout-billing-address']/descendant::div[21]/child::div/child::select")WebElement stateUp;
	
	@FindBy(xpath="//div[@class='checkout-billing-address']/descendant::div[26]/child::input")WebElement postalcodeUp;
	
	@FindBy(xpath="//div[@class='checkout-billing-address']/descendant::div[30]/child::input")WebElement phonenumberUp;
	
	@FindBy(xpath="//div[@class='items payment-methods']/descendant::fieldset[1]/descendant::div[32]/child::div/child::button[1]")WebElement updatebtn;
	
	@FindBy(xpath="//li[@id='payment']/descendant::div[50]/child::div/child::button") WebElement placeorderbtn;
	
	@FindBy(xpath="//main[@id='maincontent']/descendant::div[5]/descendant::div[3]/child::div/child::div/child::a")WebElement continueShop;
	
	
	
	
	
	
	public void urla()
	{
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	public void clickOnSignInlink()
	{
		signinlink.click();
	}

	public void enteremail(String em)
	{
	emal.sendKeys(em);
	}
	public void enterPasswd(String pd)
	{
	passd.sendKeys(pd);
	}
	
	public void clickSigninBtn()
	{
	signinbtn.click();
	}
	
	
	
	public void clickGearMenu() throws InterruptedException
	{
      Actions act1 = new Actions(driver);
		
		act1.moveToElement(gearmenu).build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(gearmenu));

	}
	public void clickGearSubMenuBag() throws InterruptedException
	{
      Actions act1 = new Actions(driver);
		
		act1.moveToElement(gearsubmenu);
		act1.click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(gearsubmenu));
	
	}
	
	public void sorterDropdown()
	{
		Select scpname = new Select(sorter);
		scpname.selectByVisibleText( "Price");
	}
	
	
	public void clickMaterialDrop()
	{
		MaterialDrop.click();
	}
	
	public void clickBurlapoption()
	{
		burlapoption.click();
	}
	
	public void clickPhoto()
	{
		clickPhoto.click();
	}
	
	
	
	public void clickAddToWishlist()
	{
		addToWishlist.click();
	}
	
	
	public void FetchCurrentURL()
	{
		
		driver.getCurrentUrl();
		
	}
	
	public void SavedWishMessage()
	{
	String message=Savedwishmessage.getText();
	System.out.println(message);
	}
	
	public void navigateback()
	{
		driver.navigate().back();
	}
	
	
	public void addQuantity(String qt) throws InterruptedException
	{
		quantity.clear();
		quantity.sendKeys(qt);
		
		Thread.sleep(4000);
	}
	
	public void clickAddToCart() throws InterruptedException
	{
		addTocartBtn.click();
		Thread.sleep(3000);
	}
	
	public void clickCartIcon() throws InterruptedException
	{
		cartIcon.click();
		Thread.sleep(2000);
	}
	
	public void clickProToCheckout()
	{
		CheckOutBtn.click();
	}
	
	
	public void FetchCurrentChOuURL()
	{
		
		driver.getCurrentUrl();
	}
	
	public void enterCompany(String comp)
	{
	company.sendKeys(comp);
	}
	
	
	public void enterStreetAddress(String add)
	{
		streetaddress.sendKeys(add);
	}
	
	public void enterCity(String ci)
	{
		city.sendKeys(ci);
	}
	
	
	public void selectcountry()
	{
		Select secount = new Select(country);
		secount.selectByVisibleText( "India");
	}
	
	public void selectstate()
	{
		Select sestate = new Select(state);
		sestate.selectByVisibleText( "Maharashtra");
	}
	
	public void enterPostalCode(String co) 
	{
		postalcode.sendKeys(co);
	}
	
	public void enterPhoneNumber(String ph) throws InterruptedException 
	{
		phonenumber.sendKeys(ph);
		Thread.sleep(5000);
	}
	
	public void clickNextBtn() throws InterruptedException
	{
		nextbutton.click();
		Thread.sleep(5000);
	}
	
	public void clickCheckBox() throws InterruptedException
	{
		checkboxAddress.click();
		Thread.sleep(2000);
	}
	
	public void enterCompUpdate(String com)
	{
		companyUp.sendKeys(com);
	}
	
	public void enterStreetUpdate(String st)
	{
		streetUpdate.sendKeys(st);
	}
	
	
	public void enterCityUp(String ci)
	{
		cityUp.sendKeys(ci);
	}
	
	public void selectcountryUp()
	{
		Select secountu = new Select(countryUp);
		secountu.selectByVisibleText( "India");
	}
	
	
	public void selectStateUp()
	{
		Select sestat = new Select(stateUp);
		sestat.selectByVisibleText( "Maharashtra");
	}
	
	
	public void enterPostalCodeUp(String po)
	{
		postalcodeUp.sendKeys(po);
	}
	
	
	public void enterPhoneNumUp(String phup) throws InterruptedException
	{
		phonenumberUp.sendKeys(phup);
		Thread.sleep(4000);
	}
	
	public void clickUpdateBtn()
	{
		updatebtn.click();
	}
	
	public void clickPlaceOrBtn() throws InterruptedException
	{
		placeorderbtn.click();
		Thread.sleep(5000);
	}
	
	
	public void orderScreenshot() throws IOException
	{
            TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\ScreenShot\\OrderPlaced.jpeg");
		FileHandler.copy(src, dest);

	}
	
	public void clickContinueShopping()
	{
		continueShop.click();
	}
	
	public void entertextSearch(String se)
	{
	searchbox.sendKeys(se);
	}
	
	public void clickOnSearchIcon()
	{
		searchicon.click();
	}
}

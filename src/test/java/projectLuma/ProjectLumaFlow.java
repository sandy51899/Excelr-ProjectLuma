package projectLuma;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectLumaFlow {

	WebDriver driver;
	
	 @Test(priority = 0)
	 public void setup()
		{
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
	 
	 
	 @Test(priority=1)
		public void urlContains()
		{
			LumaSignIn sign = new LumaSignIn(driver);
			sign.urla();
			String url1 = driver.getCurrentUrl();
			if(url1.contains(".com"))
			{
				System.out.println("URL contains.com");
			}
			
			else
				{
				System.out.println("URL does nnot contains.com");
				
				}
		}
	 
	 
	 
	 @Test(priority = 2)
	 public void placeOrder() throws InterruptedException, IOException
	 {
		 
		 LumaSignIn sign = new LumaSignIn(driver);
		 sign.urla();
		sign.clickOnSignInlink();
		sign.enteremail("sodasingh34@gmail.com");
		sign.enterPasswd("perfume@789");
		sign.clickSigninBtn();
	 }
		
		
	@Test(priority = 3)
		 public void clickTopMenu() throws InterruptedException, IOException
		 {
			 LumaSignIn sign = new LumaSignIn(driver);
			
			sign.clickGearMenu();
			sign.clickGearSubMenuBag();
			
		 }
	@Test(priority = 4)
	 public void clickSorter() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.sorterDropdown();
		
	 }
	
	@Test(priority = 5)
	 public void clickMaterial() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.clickMaterialDrop();
		sign.clickBurlapoption();
		
	 }
	
	@Test(priority = 6)
	 public void clickPhotoProduct() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.clickPhoto();
		
	 }
	
	@Test(priority = 7)
	 public void addWishList() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.clickAddToWishlist();
		sign.FetchCurrentURL();
		sign.SavedWishMessage();
		sign.navigateback();
	 }
	
	@Test(priority = 8)
	 public void addQuantity() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		
		sign.addQuantity("3");
	 }
	
	@Test(priority = 9)
	 public void addToCart() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
	
		sign.clickAddToCart();
	 }
	
	@Test(priority = 10)
	 public void clickCart() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.clickCartIcon();
	 }
	
	@Test(priority = 11)
	 public void proceedCheckout() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.clickProToCheckout();
	 }
	
	@Test(priority = 12)
	 public void adddetails() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.FetchCurrentChOuURL();
		sign.enterCompany("Amul");
		sign.enterStreetAddress("Vidyanagar second cross near datta temple");
		sign.enterCity("Pune");
		sign.selectcountry();
		sign.selectstate();
		sign.enterPostalCode("412308");
		sign.enterPhoneNumber("9867567898");
		sign.clickNextBtn();
	 }
	
	@Test(priority = 13)
	 public void updateDetails() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		
		sign.clickCheckBox();
		sign.enterCompUpdate("crif");
		sign.enterStreetUpdate("jai Malhar colony");
		sign.enterCityUp("Pune");
		sign.selectcountryUp();
		sign.selectStateUp();
		sign.enterPostalCodeUp("412309");
		sign.enterPhoneNumUp("7896788765");
		sign.clickUpdateBtn();
	 }
	
	@Test(priority = 14)
	 public void placeOrderbtn() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.clickPlaceOrBtn();
	 }
	
	@Test(priority = 15)
	 public void takeScreenshot() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.orderScreenshot();
	 }
	
	@Test(priority = 16)
	 public void continueShopping() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.clickContinueShopping();
	 }
	
	@Test(priority = 17)
	 public void searchText() throws InterruptedException, IOException
	 {
		 LumaSignIn sign = new LumaSignIn(driver);
		sign.entertextSearch("tote bag");
		sign.clickOnSearchIcon();
		
	 }
	 
	 @Test(priority = 18)
	 public void myOrder()
	 {
		 
			SigninLogout sout= new SigninLogout(driver);
			SwitchToMyorder orinf = new SwitchToMyorder(driver);
			
			
			sout.clickArrow();
			sout.clickMyaccount();
			orinf.ClickMyOrder();
			
	 }
	 @Test(priority = 19)
	 public void signOut() throws InterruptedException
	 {
		 SigninLogout sout= new SigninLogout(driver);
		 sout.clickArrow();
		 sout.clickOnSignoutink();
	 }
	 
	@Test(priority = 20)
	public void changePwd() throws InterruptedException
	{
		LumaSignIn sign = new LumaSignIn(driver);
		SigninLogout sout= new SigninLogout(driver);
		SwitchToMyorder orinf = new SwitchToMyorder(driver);

		
		sign.clickOnSignInlink();
		sign.enteremail("ama678@gmail.com");
		sign.enterPasswd("batball@349");
		sign.clickSigninBtn();
		sout.clickArrow();
		sout.clickMyaccount();
		orinf.ClickChangePwd();
		orinf.EnterCurrentPwd("batball@349");
		orinf.EnterNewPwd("batball@350");
		orinf.EnterConfPwd("batball@350");
		orinf.ClickSaveBtn();
		orinf.FetchCurrentURL();
		orinf.SavedMessage();
		
	}
	
	
	@Test(priority = 21)
	 public void createAccount() throws InterruptedException
	 {
		LumaSignIn sign = new LumaSignIn(driver);
		LumaCreateAccount cracc = new LumaCreateAccount(driver);
		CreateAccountLogout cralogout =new CreateAccountLogout(driver);
		sign.urla();
		cracc.clickOnCreateacc();
		cracc.enterfirstName("shubh");
		cracc.enterlastName("laim");
cracc.enteremail("shubhlai78@gmail.com");
cracc.enterpwd("shubhlai@567");
cracc.enteconfirmpwd("shubhlai@567");
cracc.clickcreatebtn();
cralogout.clickOnArrow();
cralogout.clickSignOut();
		
		}
	 
	
	@Test(priority=22)
	public void signinValidInvalid() throws IOException, InterruptedException
	{
	LumaSignIn sign = new LumaSignIn(driver);
	SigninLogout sout= new SigninLogout(driver);
	sign.urla();
	
String filepath= "D:\\ExcelR\\ValidInvalidData.xlsx";
	
	FileInputStream fis = new FileInputStream(filepath);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("ValidInvalidData");
	
	int rows= sheet.getLastRowNum();
	System.out.println("Total number of rows in sheet:" +rows);
	
	for(int i=1;i<=rows;i++)
	{
		XSSFRow row= sheet.getRow(i);
		XSSFCell emal = row.getCell(0);
		XSSFCell passwrd = row.getCell(1);
		XSSFCell result = row.createCell(2);
		
		try {
		sign.clickOnSignInlink();
		sign.enteremail(emal.toString());
		sign.enterPasswd(passwrd.toString());
		sign.clickSigninBtn();
		Thread.sleep(2000);
		sout.clickArrow();
		Thread.sleep(2000);
		sout.clickOnSignoutink();
		Thread.sleep(2000);
		result.setCellValue("Valid data");
		}
		
		catch(Exception e)
		{
			String errormsg = driver.findElement(By.xpath("//div[@class='page-wrapper']/descendant::div[@class='page messages']/descendant::div[@class='message-error error message']")).getText();
			System.out.println("Invalid Data");
			Thread.sleep(2000);
			result.setCellValue(errormsg);
			
		}
}
	fis.close();
	FileOutputStream fos = new FileOutputStream(filepath);
	workbook.write(fos);
	}
	
}
	
	



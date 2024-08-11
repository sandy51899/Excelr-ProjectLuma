package projectLuma;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAccountMultipledata {
	WebDriver driver;
	
	 @Test(priority = 0)
	 public void setup()
		{
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
	 
	 @Test(priority=1)
	 public void createMultipleData() throws IOException, InterruptedException
	 {
		LumaSignIn sign = new LumaSignIn(driver);
		LumaCreateAccount cracc = new LumaCreateAccount(driver);
		CreateAccountLogout cralogout =new CreateAccountLogout(driver);
		sign.urla();
		
String filepath= "D:\\ExcelR\\CreateAccountData.xlsx";
		
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("AccountData");
		
		int rows= sheet.getLastRowNum();
		System.out.println("Total number of rows in sheet:" +rows);
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell firstnam = row.getCell(0);
			XSSFCell lastnam = row.getCell(1);
			XSSFCell eml = row.getCell(2);
			XSSFCell password = row.getCell(3);
			XSSFCell cpassword = row.getCell(4);
			System.out.println("Firstname---->"+firstnam+"          Password----->"+lastnam);
			
			cracc.clickOnCreateacc();
			cracc.enterfirstName(firstnam.toString());
			cracc.enterlastName(lastnam.toString());
			cracc.enteremail(eml.toString());
			cracc.enterpwd(password.toString());
			cracc.enteconfirmpwd(cpassword.toString());
			cracc.clickcreatebtn();
			Thread.sleep(2000);
			cralogout.clickOnArrow();
			Thread.sleep(2000);
			cralogout.clickSignOut();

	}
		fis.close();
	}
	

}

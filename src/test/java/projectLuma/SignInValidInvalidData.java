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

public class SignInValidInvalidData {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
			Thread.sleep(3000);
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


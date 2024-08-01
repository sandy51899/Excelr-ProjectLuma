package projectLuma;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CompareTitle
{

WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 1)
	public void login()
	{
		driver.findElement(By.xpath("//header[@class='page-header']/descendant::li[2]/child::a")).click();
		driver.findElement(By.id("email")).sendKeys("sunil456@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("basket@567");
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']/descendant::div[6]/descendant::button")).click();
	}
	
	@Test(priority = 2)
	
	public void verifyHomepage()
	{
		String dash = driver.getTitle();
		
		Assert.assertEquals(dash,"Home Page");
	}
		
		
	}


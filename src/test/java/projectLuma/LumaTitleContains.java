package projectLuma;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LumaTitleContains {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LumaSignIn sign = new LumaSignIn(driver);
		
		sign.urla();
		
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

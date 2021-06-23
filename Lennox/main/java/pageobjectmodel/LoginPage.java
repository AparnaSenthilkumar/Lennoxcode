package pageobjectmodel;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.restapi.propconfig.PropRepo;

public class LoginPage extends BaseTest {
	


	public static void LoginPage()throws Exception
	{
		
		driver.findElement(By.cssSelector(prop.getProperty("signin"))).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector(prop.getProperty("username"))).sendKeys("lenproautomation8@lenqat.com");
		driver.findElement(By.cssSelector(prop.getProperty("password"))).sendKeys("Community17");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector(prop.getProperty("close"))).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector(prop.getProperty("submit"))).click();
		Thread.sleep(5000);
	}

}

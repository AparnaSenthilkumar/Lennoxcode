package pageobjectmodel;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.restapi.propconfig.PropRepo;

public class Homepage extends BaseTest {
	
	


	public void Homepage() throws Exception
	{
		driver.findElement(By.cssSelector(prop.getProperty("navigation"))).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector(prop.getProperty("navigationpanel"))).click();
		driver.findElement(By.cssSelector(prop.getProperty("navigationcompressor"))).click();
		Thread.sleep(5000);
	}

}

package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PartsAndSuppliesPage extends BaseTest {
	
	

	public void partsandsupplies() throws Exception
	{
		driver.findElement(By.cssSelector(prop.getProperty("navigate"))).click();
		Thread.sleep(5000);
	}

}

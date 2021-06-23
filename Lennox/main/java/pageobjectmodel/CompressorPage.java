package pageobjectmodel;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CompressorPage extends BaseTest{
	

	public void compressor() throws Exception
	{
		HashMap <String, String> map  = new HashMap <String, String>();
		WebElement Title=driver.findElement(By.cssSelector(prop.getProperty("title")));
		Assert.assertEquals(Title.getText(), "Compressors");
		WebElement description =driver.findElement(By.cssSelector(prop.getProperty("description")));
		Assert.assertEquals(description.getText(), "Replace your compressor at LennoxPros.com.");
		while(!driver.getPageSource().contains(prop.getProperty("productname")))
		{
			driver.findElement(By.cssSelector(prop.getProperty("page"))).click();
			Thread.sleep(5000);
		}
		map.put("description", driver.findElement(By.cssSelector(prop.getProperty("descriptionid"))).getText());
		map.put("modelpart", driver.findElement(By.xpath(prop.getProperty("modelpartid"))).getText());
		map.put("yourprice", driver.findElement(By.xpath(prop.getProperty("yourpriceid"))).getText());
		map.put("listprice", driver.findElement(By.xpath(prop.getProperty("listpriceid"))).getText());
		map.put("Shippingavailability", driver.findElement(By.cssSelector(prop.getProperty("shippingavailabilityid"))).getText());
		map.put("pickup", driver.findElement(By.cssSelector(prop.getProperty("pickupid"))).getText());
		map.put("zip", driver.findElement(By.cssSelector(prop.getProperty("zipid"))).getText());
		Assert.assertEquals(map.get("description"), prop.getProperty("description"));
		Assert.assertEquals(map.get("modelpart"), prop.getProperty("modelpart"));
		Assert.assertEquals(map.get("yourprice"), prop.getProperty("yourprice"));
		Assert.assertEquals(map.get("listprice"), prop.getProperty("listpriceid"));
		Assert.assertEquals(map.get("Shippingavailability"), prop.getProperty("shippingavailabilityid"));
		Assert.assertEquals(map.get("pickup"), prop.getProperty("pickupid"));
		Assert.assertEquals(map.get("zip"), prop.getProperty("zipid"));
		driver.quit();
	}

}

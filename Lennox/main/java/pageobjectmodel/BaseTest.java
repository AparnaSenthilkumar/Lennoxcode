package pageobjectmodel;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.restapi.propconfig.*;

import com.restapi.propconfig.PropRepo;

public class BaseTest {




	public static WebDriver driver;
	public static Properties prop;
	


	static
	{
		try {
			prop=PropRepo.readPropertiesFile();
			Properties prop = PropRepo.readPropertiesFile();
			prop=PropRepo.readPropertiesFile();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aparna.s\\Desktop\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			Thread.sleep(5000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*void init() throws Exception
	{
	
   
	}*/

}

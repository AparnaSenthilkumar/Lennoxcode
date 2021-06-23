package UI_Automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectmodel.BaseTest;
import pageobjectmodel.CompressorPage;
import pageobjectmodel.Homepage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.PartsAndSuppliesPage;

public class Lennox_Automation extends BaseTest{
	
	
	LoginPage loginpage = new LoginPage();
	Homepage HomePage = new Homepage();
	PartsAndSuppliesPage PartsAndSupplies = new PartsAndSuppliesPage();
	CompressorPage CompressorPage = new CompressorPage();
    @Test
	void start() throws Exception
	{
    	LoginPage.LoginPage();
		HomePage.Homepage();
		PartsAndSupplies.partsandsupplies();
		CompressorPage.compressor();
			
		
	}

}

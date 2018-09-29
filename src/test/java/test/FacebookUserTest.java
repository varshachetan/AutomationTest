package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions_library.FacebookLoginLib;
import actions_library.FacebookUserLib;
import common_utilities.DriverConfig;

public class FacebookUserTest {
	
	//DriverConfig browser = new DriverConfig();
	
	FacebookUserLib facebookUser;
	
	@BeforeClass
	public void openbrowser()
	{
		DriverConfig.openBrowser("chrome");
		facebookUser = new FacebookUserLib();
		System.out.println("openbrowser Method");
	}
	
	@BeforeMethod
	public void openFacebook()
	{
		DriverConfig.driver.get("https://www.facebook.com");
	}
	
	@Test
	public void facebbokUserTest() throws Exception
	{
		facebookUser.enterFirstName("Vina");
		facebookUser.enterLastName("Vinod");
		facebookUser.enterMobileNo("9663656167");
		facebookUser.enterPassword("New_2018");
		facebookUser.selectRadioSex("Female");
		facebookUser.clickSignUp();
	}
	
/*	@AfterClass
	
	public void closeBrowser() throws Exception
	{
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
	}
	*/

}

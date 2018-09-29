package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions_library.FacebookLoginLib;
import actions_library.GmailUserLib;
import common_utilities.DriverConfig;

public class FacebookLoginTest {
	
	//DriverConfig browser = new DriverConfig();
	
	FacebookLoginLib facebookLogin;
	
	@BeforeClass
	public void openbrowser()
	{
		DriverConfig.openBrowser("chrome");
		facebookLogin = new FacebookLoginLib();
		System.out.println("openbrowser Method");
	}
	
	@BeforeMethod
	public void openFacebook()
	{
		DriverConfig.driver.get("https://www.facebook.com");
	}
	
	@Test
	public void facebookLoginTest() throws Exception
	{
		facebookLogin.enterEmail("varshas.mahajan8@gmail.com");
		facebookLogin.enterPassword("motomoto1234");
		facebookLogin.clickLogin();
	}
	

}

package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions_library.GmailUserLib;
import common_utilities.DriverConfig;

public class GmailUserTest {

	//DriverConfig browser = new DriverConfig();
	
	GmailUserLib gmailUser;
	
	@BeforeClass
	public void openbrowser()
	{
		DriverConfig.openBrowser("chrome");
		gmailUser = new GmailUserLib();
		System.out.println("openbrowser Method");
	}
	
	@BeforeMethod
	public void openGmail()
	{
		DriverConfig.driver.get("https://www.gmail.com");
		System.out.println("openGmail Method");
	}
	
	@Test
	public void gmailTest() throws Exception
	{
		gmailUser.enterEmail("varshas.mahajan8@gmail.com");
		gmailUser.clickNextButton1();
		
		Thread.sleep(5000);
		
		gmailUser.enterPassword("ssmvm8871234");
		gmailUser.clickNextButton2();
	}
	

	
}

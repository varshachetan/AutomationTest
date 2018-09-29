package test;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions_library.RegisterPageLib;
import actions_library.YouTubeLib;
import common_utilities.DriverConfig;

public class RegisterTest {
	
	
	RegisterPageLib registerTest;
	
	@BeforeClass
	public void openBrowser()
	{
		//Driver_Config browser = new Driver_Config();
		DriverConfig.openBrowser("chrome");
		registerTest = new RegisterPageLib();
		System.out.println("openbrowser Method");
	}
	
	@BeforeMethod
	public void openWebpage()
	{
		DriverConfig.driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@Test
	public void registerTest()
	{
	//	RegisterPageLib registerTest = new RegisterPageLib();
	
		registerTest.enterFirstName("Vibha");
		registerTest.enterLastName("Vibhan");
		registerTest.enterAddress("#302,Siri Sai Enclave");
		registerTest.enterEmail("varshas.mahajan8@gmail.com");
		registerTest.enterPhone("9663656167");
		registerTest.selectGender("FeMale");
		registerTest.selectHobbies("Movies");
		registerTest.selectLanguages("languages");
		registerTest.selectLang1("English");
		registerTest.selectLang2("Hindi");
		
		registerTest.selectSkills("Java");
		
		//registerTest.selectCountry("country");
		registerTest.selectCountry("India");
		registerTest.selectSelCountry("selCountry");
		registerTest.selectSelCountry1("Hong Kong");
		
		registerTest.selectYear("1976");
		registerTest.selectMonth("May");
		registerTest.selectDay("20");
		
		registerTest.enterPassword("Prana123");
		registerTest.enterRePassword("Prana123");
		registerTest.clickSubmit("submit");
		
		
	}
/*	
	@AfterSuite
	
	public void closeBrowser() throws Exception
	{
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
	}
*/
}

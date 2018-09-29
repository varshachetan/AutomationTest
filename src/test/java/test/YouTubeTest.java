package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import actions_library.YouTubeLib;
import common_utilities.DriverConfig;
import common_utilities.ReportConfig;

public class YouTubeTest {

//DriverConfig browser = new DriverConfig();
	
	YouTubeLib youTube;
	
	@BeforeClass
	public void openbrowser()
	{
		DriverConfig.openBrowser("chrome");
		youTube = new YouTubeLib();
		System.out.println("openbrowser Method");
	}
	
	@BeforeMethod
	public void openYouTube(Method m)
	{
		DriverConfig.driver.get("https://www.youtube.com");
		ReportConfig.report.startTest(m.getName());
	}
	
	@Test
	public void youtubeTest() throws Exception
	{
		youTube.enterSearch("chu chu tv johny johny");
		youTube.clickSearchButton();
		youTube.clickVedio();
	}
	
	@AfterClass
	public void closingTheExecution() throws Exception{
		ReportConfig.report.endTest(ReportConfig.logger);
		//ReportConfig.logger.log(LogStatus.INFO, "Test is ended");
		/* flush method commits the report and logger object things to the file */
		ReportConfig.report.flush();
		DriverConfig.driver.get(ReportConfig.ReportLocation);
	}
	

}

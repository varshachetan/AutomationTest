package actions_library;

import org.openqa.selenium.support.PageFactory;

import common_utilities.DriverConfig;
import common_utilities.ReportConfig;
import element_repository.YouTube;

public class YouTubeLib {
	
	YouTube youTube = PageFactory.initElements(DriverConfig.driver, YouTube.class);
	
	public void enterSearch(String search)
	{
		try
		{
			youTube.getSearch().sendKeys(search);
			ReportConfig.PassCase("Enter text in YouTube Search is successful", "YouTubeSearch_Pass");
		}
		catch(Exception e)
		{
			ReportConfig.FailCase("Enter text in YouTube Search is failed", "YouTubeSearch_Fail");
			
		}
	}
	
	public void clickSearchButton()
	{
		try
		{
			youTube.getSearchButton().click();
			ReportConfig.PassCase("YouTube Search Button click is successful", "YouTubeSeachBtn_Click_Pass");
		}
		catch(Exception e)
		{
			ReportConfig.FailCase("YouTube Search Button click is failed", "YouTubeSeachBtn_Click_Pass");
		}
	}
	
	public void clickVedio()
	{
		youTube.getVideo3().click();
	}
	

}

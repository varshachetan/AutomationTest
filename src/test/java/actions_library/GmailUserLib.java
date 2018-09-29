package actions_library;

import org.openqa.selenium.support.PageFactory;

import common_utilities.DriverConfig;
import element_repository.GmailUser;

public class GmailUserLib {
	
	GmailUser gmailUser = PageFactory.initElements(DriverConfig.driver, GmailUser.class);
	
	public void enterEmail(String email)
	{
		gmailUser.getEmail().sendKeys(email);
	}
	
	public void clickNextButton1()
	{
		gmailUser.getNextButton1().click();
	}

	public void enterPassword(String password)
	{
		gmailUser.getPassWord().sendKeys(password);
	}
	
	public void clickNextButton2()
	{
		gmailUser.getNextButton2().click();
	}
}

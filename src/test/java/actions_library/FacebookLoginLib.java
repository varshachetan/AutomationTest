package actions_library;

import org.openqa.selenium.support.PageFactory;

import common_utilities.DriverConfig;
import element_repository.FacebookLogin;

public class FacebookLoginLib {
	FacebookLogin faceBookLogin = PageFactory.initElements(DriverConfig.driver, FacebookLogin.class);
	
	public void enterEmail(String email)
	{
		faceBookLogin.getEmail().sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		faceBookLogin.getPassword().sendKeys(password);
	}
	
	public void clickLogin()
	{
		faceBookLogin.getLogin().click();
	}
	
}

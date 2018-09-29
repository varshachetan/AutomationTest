package actions_library;

import org.openqa.selenium.support.PageFactory;

import common_utilities.DriverConfig;
import element_repository.FacebookUser;

public class FacebookUserLib {
	
	FacebookUser faceBookUser = PageFactory.initElements(DriverConfig.driver, FacebookUser.class);
	
	public void enterFirstName(String firstName)
	{
		faceBookUser.getFirstName().sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		faceBookUser.getLastName().sendKeys(lastName);
	}
	
	public void enterMobileNo(String mobileNo)
	{
		faceBookUser.getMobileNo().sendKeys(mobileNo);
	}
	
	public void enterPassword(String passWord)
	{
		faceBookUser.getPassWord().sendKeys(passWord);
	}
	
	public void selectRadioSex(String radioSex)
	{
		faceBookUser.getRadioSex().click();
	}
	
	public void clickSignUp()
	{
		faceBookUser.getSignUp().click();
	}
	

}

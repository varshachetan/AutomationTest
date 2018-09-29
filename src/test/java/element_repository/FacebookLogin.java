package element_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogin {

	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
}

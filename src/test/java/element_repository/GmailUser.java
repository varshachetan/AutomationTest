package element_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailUser {

	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextButton1;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNextButton1() {
		return nextButton1;
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextButton2;

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getNextButton2() {
		return nextButton2;
	}
	
	
}

package element_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FacebookUser {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobileNo;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement passWord;
	
	/*
	
	@FindBy(xpath="//select[@name='birthday_day']")
	Select sel1 = new Select(selDay);	
	
	selDay.selectByVisibleText("5");
	
	Select selMonth = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
	selMonth.selectByVisibleText("Aug");
	
	Select selYear = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
	selYear.selectByVisibleText("2016");
	*/
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement radioSex;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signUp;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getRadioSex() {
		return radioSex;
	}

	public WebElement getSignUp() {
		return signUp;
	}
	

}

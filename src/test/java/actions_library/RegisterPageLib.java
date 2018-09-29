package actions_library;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common_utilities.DriverConfig;
import element_repository.RegisterPage;

public class RegisterPageLib {

	/* This way of creating object will through NullPointer Exception 
	 * because there is no link between WebElement and driver object
	 */
	//RegisterPage registerPage = new RegisterPage();
	
	RegisterPage registerPage = PageFactory.initElements(DriverConfig.driver, RegisterPage.class);
	
	public void enterFirstName(String firstName)
	{
		registerPage.getFirstName().sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		registerPage.getLastName().sendKeys(lastName);
	}
	
	public void enterAddress(String address)
	{
		registerPage.getAddress().sendKeys(address);
	}
	
	public void enterEmail(String email)
	{
		registerPage.getEmail().sendKeys(email);
	}
	
	public void enterPhone(String phone)
	{
		registerPage.getPhone().sendKeys(phone);
	}
	

	public void selectGender(String gender)
	{
		registerPage.getGender().click();
	}
	
	public void selectHobbies(String hobbies)
	{
		registerPage.getHobbies().click();
	}
	
	public void selectLanguages(String languages)
	{
		registerPage.getLanguage().click();
	}
	
	public void selectLang1(String lang1)
	{
		registerPage.getLang1().click();
	}
	
	public void selectLang2(String lang2)
	{
		registerPage.getLang2().click();
	}
	
	public void selectSkills(String skills)
	{
		Select sel = new Select(registerPage.getSkills());
		sel.selectByVisibleText(skills);
	}
	
	public void selectCountry(String country)
	{
		Select sel = new Select(registerPage.getCountries());
		sel.selectByVisibleText(country);
	}
	
	public void selectSelCountry(String selCountry)
	{
		registerPage.getSelCountry().click();
	}
	
	public void selectSelCountry1(String selCountry1)
	{
		registerPage.getSelCountry1().click();
	}
	
	public void selectYear(String year)
	{
		Select sel = new Select(registerPage.getYear());
		sel.selectByVisibleText(year);
	}
	
	public void selectMonth(String month)
	{
		Select sel = new Select(registerPage.getMonth());
		sel.selectByVisibleText(month);
	}
	
	public void selectDay(String day)
	{
		Select sel = new Select(registerPage.getDay());
		sel.selectByVisibleText(day);
	}
	
	public void enterPassword(String password)
	{
		registerPage.getPassword().sendKeys(password);
	}
	
	public void enterRePassword(String repassword)
	{
		registerPage.getRe_password().sendKeys(repassword);
	}
	
	public void clickSubmit(String submit)
	{
		registerPage.getSubmit().click();
	}
	
}

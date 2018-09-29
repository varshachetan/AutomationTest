package element_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private	WebElement firstName;
	
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastName;


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@ng-model='Phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@value='Movies']")
	private WebElement hobbies;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement language;
	
	@FindBy(xpath="//a[contains(text(),'English')]")
	private WebElement lang1;
	
	@FindBy(xpath="//a[contains(text(),'Hindi')]")
	private WebElement lang2;
	
	@FindBy(xpath="//select[@id='Skills']")
	private WebElement skills;
	
	@FindBy(xpath="//select[@id='countries']")
	private WebElement countries;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement selCountry;
	
	@FindBy(xpath="//li[contains(text(),'Hong Kong')]")
	private WebElement selCountry1;
	
	@FindBy(xpath="//select[@placeholder='Year']")
	private WebElement year;
	
	@FindBy(xpath="//select[@placeholder='Month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@placeholder='Day']")
	private WebElement day;
	
	@FindBy(xpath="//input[@id='firstpassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	private WebElement re_password;
	
	@FindBy(xpath="//button[@id='submitbtn']")
	private WebElement submit;


	public WebElement getAddress() {
		return address;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getHobbies() {
		return hobbies;
	}


	public WebElement getLanguage() {
		return language;
	}


	public WebElement getLang1() {
		return lang1;
	}


	public WebElement getLang2() {
		return lang2;
	}


	public WebElement getSkills() {
		return skills;
	}


	public WebElement getCountries() {
		return countries;
	}


	public WebElement getSelCountry() {
		return selCountry;
	}


	public WebElement getSelCountry1() {
		return selCountry1;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getDay() {
		return day;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getRe_password() {
		return re_password;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	
}

package element_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTube {

	@FindBy(xpath="//input[@id='search']")
	private WebElement search;
	
	@FindBy(xpath="//button[@id='search-icon-legacy']")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[contains(text(),'Johny Johny Yes')]")
	private WebElement video3;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getVideo3() {
		return video3;
	}
	
	
	
}

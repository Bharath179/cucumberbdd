package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company {

	@FindBy(linkText = "Company")
	private WebElement company;
	
	@FindBy(name = "search")
	private WebElement companytextfield;
	
	@FindBy(id="button")
	private WebElement searchBtn;
	
	@FindBy(id="tab")
	private WebElement text;
	
	public Company(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCompany() {
		return company;
	}
	public WebElement getCompanytextfield() {
		return companytextfield;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getText() {
		return text;
	}
}

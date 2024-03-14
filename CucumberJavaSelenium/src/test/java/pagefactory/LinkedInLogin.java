package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInLogin {

	@FindBy(name = "username")
	private WebElement usertextfield;
	
	@FindBy(name = "password")
	private WebElement passtextfield;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;
	
	public LinkedInLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pw) {
		usertextfield.sendKeys(un);
		passtextfield.sendKeys(pw);
		
	}
	public void clickOnLogin() {
		loginBtn.click();
	}
}


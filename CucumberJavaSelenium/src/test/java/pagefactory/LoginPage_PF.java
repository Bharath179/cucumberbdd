//package pagefactory;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPage_PF {
//
//	@FindBy(name = "username")
//	private WebElement usernametextField;
//	
//	@FindBy(name = "password")
//	private WebElement passwordtextField;
//	
//	@FindBy(xpath  = "//button[@type='submit']")
//	private WebElement loginBtn;
//
//	WebDriver driver;
//	
//	public LoginPage_PF(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//	public void setLogin(String un,String pw) {
//		usernametextField.sendKeys(un);
//		passwordtextField.sendKeys(pw);
//	}
//	public void clickonLogin() {
//		loginBtn.click();
//	}
//
//}
